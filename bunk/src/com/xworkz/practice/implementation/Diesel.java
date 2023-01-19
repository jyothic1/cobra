package com.xworkz.practice.implementation;

import org.springframework.stereotype.Component;

import com.xworkz.practice.incomplete.Fuel;
@Component
public class Diesel implements Fuel{

	public Diesel() {
			System.out.println("Running diesel using no-arg const");
	}

	@Override
	public void consume() {
	System.out.println("running consume method from fuel");
		
	}

}
