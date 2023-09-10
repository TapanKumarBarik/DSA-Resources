package org.stream.analysis;

import org.apache.flink.api.common.functions.RichFilterFunction;
import org.stream.model.Rule;
import org.stream.model.Transaction;

import java.util.List;

public class FilterInValidTransactions extends RichFilterFunction<Transaction> {
    @Override
    public boolean filter(Transaction transaction) throws Exception {

        //get the rule
        List<Rule> allRules = transaction.getRule();

        for (int i = 0; i < allRules.size(); i++) {
            if (allRules.get(i).getMaximunAmout() < transaction.getAmount()
                    && allRules.get(i).getRuleType().equalsIgnoreCase("MAX") ) {
                return true;
            }
        }

        //return
        return false;
    }
}
