package com.toolv.springcloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.toolv.springcloud.dao.PaymentDao;
import com.toolv.springcloud.entities.Payment;
import com.toolv.springcloud.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService
{
	@Resource
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment)
	{
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id)
	{
		return paymentDao.getPaymentById(id);
	}
}
