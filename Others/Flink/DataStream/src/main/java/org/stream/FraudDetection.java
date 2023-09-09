package org.stream;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FraudDetection {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env=StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<Integer> data=env.fromElements(1,2,3);

        data.print();

        env.execute();
    }
}