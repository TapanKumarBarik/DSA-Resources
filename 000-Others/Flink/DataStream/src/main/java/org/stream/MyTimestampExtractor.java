package org.stream;

import org.apache.flink.api.common.eventtime.*;
import org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks;
import org.apache.flink.streaming.api.functions.AssignerWithPunctuatedWatermarks;
import org.apache.flink.streaming.api.watermark.Watermark;
import org.stream.model.Transaction;

import javax.annotation.Nullable;
import java.time.Duration;

public class MyTimestampExtractor implements
        WatermarkStrategy<Transaction>,
        AssignerWithPeriodicWatermarks<Transaction>,
        AssignerWithPunctuatedWatermarks<Transaction> {
    @Override
    public WatermarkGenerator<Transaction> createWatermarkGenerator(WatermarkGeneratorSupplier.Context context) {
        return null;
    }

    @Override
    public TimestampAssigner<Transaction> createTimestampAssigner(TimestampAssignerSupplier.Context context) {
        return WatermarkStrategy.super.createTimestampAssigner(context);
    }

    @Override
    public WatermarkAlignmentParams getAlignmentParameters() {
        return WatermarkStrategy.super.getAlignmentParameters();
    }

    @Override
    public WatermarkStrategy<Transaction> withTimestampAssigner(TimestampAssignerSupplier<Transaction> timestampAssigner) {
        return WatermarkStrategy.super.withTimestampAssigner(timestampAssigner);
    }

    @Override
    public WatermarkStrategy<Transaction> withTimestampAssigner(SerializableTimestampAssigner<Transaction> timestampAssigner) {
        return WatermarkStrategy.super.withTimestampAssigner(timestampAssigner);
    }

    @Override
    public WatermarkStrategy<Transaction> withIdleness(Duration idleTimeout) {
        return WatermarkStrategy.super.withIdleness(idleTimeout);
    }

    @Override
    public WatermarkStrategy<Transaction> withWatermarkAlignment(String watermarkGroup, Duration maxAllowedWatermarkDrift) {
        return WatermarkStrategy.super.withWatermarkAlignment(watermarkGroup, maxAllowedWatermarkDrift);
    }

    @Override
    public WatermarkStrategy<Transaction> withWatermarkAlignment(String watermarkGroup, Duration maxAllowedWatermarkDrift, Duration updateInterval) {
        return WatermarkStrategy.super.withWatermarkAlignment(watermarkGroup, maxAllowedWatermarkDrift, updateInterval);
    }

    @Nullable
    @Override
    public Watermark getCurrentWatermark() {
        return null;
    }

    @Nullable
    @Override
    public Watermark checkAndGetNextWatermark(Transaction transaction, long l) {
        // Emit a watermark based on some logic (e.g., a time threshold)
        // In this example, we emit a watermark 1 second behind the event time
        long watermarkTime = l - 1000; // 1 second delay
        return new Watermark(watermarkTime);
    }

    @Override
    public long extractTimestamp(Transaction transaction, long l) {
        // Extract the timestamp from your event as a string (assuming it's in a string format)
        String timestampStr = transaction.getTransactionTime().toString(); // Replace with your actual method to get the timestamp as a string

        try {
            // Parse the string timestamp into a long value (adjust the parsing logic as needed)
            long timestamp = Long.parseLong(timestampStr);
            return timestamp;
        } catch (NumberFormatException e) {
            // Handle parsing errors (e.g., log an error or return a default value)
            // You can also return Long.MIN_VALUE to indicate a missing timestamp
            return Long.MIN_VALUE;
        }

    }
}
