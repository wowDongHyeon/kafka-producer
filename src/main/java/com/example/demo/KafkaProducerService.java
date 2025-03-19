package com.example.demo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final LogMessageRepository logMessageRepository;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate, LogMessageRepository logMessageRepository) {
        this.kafkaTemplate = kafkaTemplate;
        this.logMessageRepository = logMessageRepository;
    }

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        LogMessage logMessage = new LogMessage(topic, message, "Producer");
        logMessageRepository.save(logMessage);
    }
} 