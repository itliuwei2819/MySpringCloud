package com.toolv.springcloud.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentController
{
	@Value("${server.port}")
	private Integer serverPort;

	@GetMapping("/payment/zk")
	public String create()
	{
		return "springcloud with zookeeper: " + serverPort + " " + UUID.randomUUID().toString();
	}
}
