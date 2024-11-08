package com.microservice.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerKafkaService {
	@KafkaListener(topics = "testTopicA", groupId = "groupA")
	public void readMessageFromTopic(String recievedMessage) {
		System.out.println("KAFka msg: " + recievedMessage);
	}

}
