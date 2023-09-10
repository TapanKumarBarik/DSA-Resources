package org.stream.analysis;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;
import org.stream.model.Transaction;

public class Tokenizer implements FlatMapFunction<Transaction, Tuple2<Transaction, Integer>> {

    @Override
    public void flatMap(Transaction transaction,
                        Collector<Tuple2<Transaction, Integer>> collector) throws Exception {

        collector.collect(new Tuple2<>(transaction,1));
    }
}
