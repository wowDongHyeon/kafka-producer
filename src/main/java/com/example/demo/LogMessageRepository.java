package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogMessageRepository extends MongoRepository<LogMessage, String> {
} 