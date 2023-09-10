package org.stream;

import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.functions.RichFilterFunction;
import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.api.common.time.Time;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.stream.analysis.FilterInValidTransactions;
import org.stream.analysis.FilterValidTransactions;
import org.stream.analysis.GenerateNotificationForInvalidTrasaction;
import org.stream.analysis.Tokenizer;
import org.stream.model.Notification;
import org.stream.model.Transaction;
import org.stream.modelmapper.TransactionMapper;

import java.time.Duration;
import java.util.List;

public class FraudDetection {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);

        DataStream<String> transactionData = env.socketTextStream("localhost", 9000);

        //MAP
        DataStream<Transaction> transformedData = transactionData.flatMap(new TransactionMapper())
                .assignTimestampsAndWatermarks(WatermarkStrategy.forBoundedOutOfOrderness(Duration.ofSeconds(10)));;
        //transformedData.print();

        //filter validTransactions , which can be processed
        DataStream<Transaction>validTransactions= transformedData.filter(new FilterValidTransactions());

       // validTransactions.print();

        //invalid Transactions which should not be processed
        DataStream<Transaction>inValidTransactions= transformedData.filter(new FilterInValidTransactions());
        //inValidTransactions.print();

        //Generate Alert from Invalid Transactions
        DataStream<Notification>raisedNotifications= inValidTransactions.process(new GenerateNotificationForInvalidTrasaction());

        //raisedNotifications.print();


        //key by userid
        DataStream<Tuple2<Transaction, Integer>> transactionsIn5Minutes = transformedData
               .flatMap(new Tokenizer())
               .keyBy(value -> value.f0.getUserId().toString())
               .timeWindow(org.apache.flink.streaming.api.windowing.time.Time.minutes(2))
               .sum(1);

        transactionsIn5Minutes.print();
       //process key by data

        env.execute();
    }
}