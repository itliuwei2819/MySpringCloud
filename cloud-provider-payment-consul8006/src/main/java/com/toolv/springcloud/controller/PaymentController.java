package com.toolv.springcloud.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController
{
	@Value("${server.port}")
	private Integer serverPort;

	@RequestMapping("/payment/consul")
	public String paymentConsul() {
		return "springcloud with consul: " + serverPort + " " + UUID.randomUUID().toString();
	}
}
