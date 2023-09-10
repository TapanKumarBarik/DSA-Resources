package org.socket;

public class Rule {

    private String RuleType;
    private float MaximunAmout;
    private Integer MaximumTransactionPerDay;

    public Rule(String ruleType, float maximunAmout, Integer maximumTransactionPerDay) {
        RuleType = ruleType;
        MaximunAmout = maximunAmout;
        MaximumTransactionPerDay = maximumTransactionPerDay;
    }

    public String getRuleType() {
        return RuleType;
    }

    public void setRuleType(String ruleType) {
        RuleType = ruleType;
    }

    public float getMaximunAmout() {
        return MaximunAmout;
    }

    public void setMaximunAmout(float maximunAmout) {
        MaximunAmout = maximunAmout;
    }

    public Integer getMaximumTransactionPerDay() {
        return MaximumTransactionPerDay;
    }

    public void setMaximumTransactionPerDay(Integer maximumTransactionPerDay) {
        MaximumTransactionPerDay = maximumTransactionPerDay;
    }
}

