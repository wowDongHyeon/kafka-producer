package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "logs")
public class LogMessage {
    @Id
    private String id;
    private String topic;
    private String message;
    private long timestamp;
    private String logType;

    public LogMessage(String topic, String message, String logType) {
        this.topic = topic;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
        this.logType = logType;
    }
} 