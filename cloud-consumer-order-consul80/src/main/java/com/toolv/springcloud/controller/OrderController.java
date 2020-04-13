package com.toolv.springcloud.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController
{
	private static final String PAYMENT_URL = "http://cloud-payment-service";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/consul")
	public String zk()
	{
		String url = String.format("%s/payment/consul", PAYMENT_URL);
		return restTemplate.getForObject(url, String.class, new HashMap<>());
	}
}
