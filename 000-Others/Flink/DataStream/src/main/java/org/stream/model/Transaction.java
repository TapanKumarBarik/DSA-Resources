package org.stream.model;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class Transaction {

    private Integer UserId;
    private float Amount;
    private List<Rule> rule;
    private Timestamp TransactionTime;

    public Transaction() {
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
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

    public Timestamp getTransactionTime() {
        return TransactionTime;
    }

    public void setTransactionTime(Timestamp transactionTime) {
        TransactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "UserId=" + UserId +
                ", Amount=" + Amount +
                ", rule=" + rule +
                ", TransactionTime=" + TransactionTime +
                '}';
    }
}
