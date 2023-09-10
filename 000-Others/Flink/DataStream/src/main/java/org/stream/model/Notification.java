package org.stream.model;

public class Notification {

    private Integer UserId;
    private String RuleType;
    private String NotificationMessage;

    public Notification(Integer userId, String ruleType, String notificationMessage) {
        UserId = userId;
        RuleType = ruleType;
        NotificationMessage = notificationMessage;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getRuleType() {
        return RuleType;
    }

    public void setRuleType(String ruleType) {
        RuleType = ruleType;
    }

    public String getNotificationMessage() {
        return NotificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        NotificationMessage = notificationMessage;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "UserId='" + UserId + '\'' +
                ", RuleType='" + RuleType + '\'' +
                ", NotificationMessage='" + NotificationMessage + '\'' +
                '}';
    }
}
