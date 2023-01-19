package com.xworkz.practice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.practice")
public class SpringConfiguration {

	public SpringConfiguration() 
	{
		System.out.println("Running spring configuration using default const");
	}

}
