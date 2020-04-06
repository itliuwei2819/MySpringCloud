package com.toolv.springcloud.service;

import org.apache.ibatis.annotations.Param;

import com.toolv.springcloud.entities.Payment;

public interface PaymentService
{
	int create(Payment payment);

	Payment getPaymentById(@Param("id") Long id);
}
