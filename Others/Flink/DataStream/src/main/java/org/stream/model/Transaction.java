package org.stream.model;
import java.time.LocalDateTime;
import java.util.List;

public class Transaction {

    private String UserId;
    private float Amount;
    private List<Rule> rule;
    private LocalDateTime TransactionTime;

    public Transaction() {
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public LocalDateTime getTransactionTime() {
        return TransactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        TransactionTime = transactionTime;
    }
}
