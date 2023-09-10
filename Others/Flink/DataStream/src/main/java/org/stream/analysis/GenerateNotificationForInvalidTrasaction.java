package org.stream.analysis;

import org.apache.flink.streaming.api.functions.ProcessFunction;
import org.apache.flink.util.Collector;
import org.stream.model.Notification;
import org.stream.model.Transaction;

public class GenerateNotificationForInvalidTrasaction extends ProcessFunction<Transaction, Notification> {
    @Override
    public void processElement(Transaction transaction,
                               ProcessFunction<Transaction, Notification>.Context context,
                               Collector<Notification> collector) throws Exception {

        Notification n = new Notification(
                transaction.getUserId(),
                transaction.getRule().get(0).getRuleType(),
                "MAX Transaction expected " +
                        transaction.getRule().get(0).getMaximunAmout()
                        +
                        " But the current Transaction Amount is "
                        + transaction.getAmount()
        );
        collector.collect(n);
    }
}
