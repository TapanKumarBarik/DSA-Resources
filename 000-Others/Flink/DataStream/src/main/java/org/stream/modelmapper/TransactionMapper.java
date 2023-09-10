package org.stream.modelmapper;

import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.util.Collector;
import org.stream.model.Transaction;

import java.util.Iterator;

public class TransactionMapper extends RichFlatMapFunction<String, Transaction> {

   ObjectMapper mapper=new ObjectMapper();
    @Override
    public void flatMap(String s, Collector<Transaction> collector) throws Exception {
        JsonNode jsonNode=mapper.readTree(s);
        Transaction t=mapper.readValue(jsonNode.toString(),Transaction.class);
        collector.collect(t);
    }
}
