package com.microservice.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerKafkaService {
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMsgToTopic(String msg) {
		kafkaTemplate.send("testTopicA ",msg);
	}

}
