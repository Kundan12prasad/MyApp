package com.practice.loadbalance.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class RibbonConfiguration 
{
	@Autowired
	IClientConfig ribbonclient;
	
	@Bean
	public IPing ribbonPing(IClientConfig ribbonclient) 
	{
		return new PingUrl();
	}
	
	@Bean
	public IRule ribbonRule(IClientConfig ribbonclient)
	{
		return new AvailabilityFilteringRule();
	}

}
