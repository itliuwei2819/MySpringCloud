package com.toolv.springcloud.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.toolv.springcloud.lb.LoadBalancer;

@Configuration
public class ApplicationContextConfig
{
	@Bean
//	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
