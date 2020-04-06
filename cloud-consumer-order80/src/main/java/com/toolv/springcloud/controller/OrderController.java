package com.toolv.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.toolv.springcloud.entities.CommonResult;
import com.toolv.springcloud.entities.Payment;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController
{
	private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

	@Resource
	private RestTemplate restTemplate;

	@PostMapping("/consumer/payment/create")
	public CommonResult<?> create(@RequestBody Payment payment)
	{
		String url = String.format("%s/payment/create", PAYMENT_URL);
		return restTemplate.postForObject(url, payment, CommonResult.class);
	}

	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<?> create(@PathVariable("id") Long id)
	{
		String url = String.format("%s/payment/get/%d", PAYMENT_URL, id);
		return restTemplate.getForObject(url, CommonResult.class);
	}
}
