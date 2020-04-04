package com.toolv.springcloud.controller;

import java.util.Objects;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toolv.springcloud.entities.CommonResult;
import com.toolv.springcloud.entities.Payment;
import com.toolv.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentController
{
	@Resource
	private PaymentService paymentServiceImpl;

	@PostMapping("/payment/create")
	public CommonResult<?> create(@RequestBody Payment payment)
	{
		int result = paymentServiceImpl.create(payment);
		if (result > 0)
		{
			return new CommonResult<>(200, "Create success.");
		}
		else
		{
			return new CommonResult<>(444, "Create error.");
		}
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult<?> create(@PathVariable("id") Long id)
	{
		Payment payment = paymentServiceImpl.getPaymentById(id);
		if (Objects.nonNull(payment))
		{
			return new CommonResult<>(200, "Query success.", payment);
		}
		else
		{
			return new CommonResult<>(444, String.format("Query error, id:[%d] not found", id));
		}
	}
}
