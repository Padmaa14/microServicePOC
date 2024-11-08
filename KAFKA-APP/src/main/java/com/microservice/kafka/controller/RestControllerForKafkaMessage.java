package com.microservice.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.kafka.service.ProducerKafkaService;

@RestController("/kafka")
public class RestControllerForKafkaMessage {
	@Autowired
	ProducerKafkaService prodService;

	@GetMapping("/getMsg")
	public void getMessageFromClient(@RequestParam("message") String msg) {
		prodService.sendMsgToTopic(msg);
	}
}
