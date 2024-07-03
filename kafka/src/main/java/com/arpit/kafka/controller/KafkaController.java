package com.arpit.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, String>  kafkaTemplate;
	
	@RequestMapping(path = "/produce", method = RequestMethod.POST)
	public void produceKafkaEvent() {
		kafkaTemplate.send("my-kafka-topic", "Sent");
	}
	
	
}
