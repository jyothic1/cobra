package com.property.init.bean;

import org.springframework.stereotype.Component;

@Component
public class Rocket 
{
private String country;
private double budget;
private String name;

	public Rocket()
	{
	System.out.println("running default cont from rocket");
	}

	public String getCountry() {
		return country;
	}

	
	public double getBudget() {
		return budget;
	}

	public String getName() {
		return name;
	}
	

}
