package com.xworkz.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring.things")
public class SpringConfiguration {
	public SpringConfiguration()
	{
		System.out.println("running SpringConfiguration using zero arg construtor");
	}

}
