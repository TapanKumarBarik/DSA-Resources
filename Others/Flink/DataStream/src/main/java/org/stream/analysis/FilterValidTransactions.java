package org.stream.analysis;

import org.apache.flink.api.common.functions.RichFilterFunction;
import org.stream.model.Rule;
import org.stream.model.Transaction;

import java.util.List;

public class FilterValidTransactions extends RichFilterFunction<Transaction> {
    @Override
    public boolean filter(Transaction transaction) throws Exception {

        //get the rule
        List<Rule> allRules = transaction.getRule();

        for (int i = 0; i < allRules.size(); i++) {
            if (allRules.get(i).getMaximunAmout() > transaction.getAmount()) {
                return true;
            }
        }

        //return
        return false;
    }
}
