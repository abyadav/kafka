package com.arpit.kafka.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "my-kafka-topic")
	 public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
