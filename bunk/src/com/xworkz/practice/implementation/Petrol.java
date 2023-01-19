package com.xworkz.practice.implementation;

import org.springframework.stereotype.Component;

import com.xworkz.practice.incomplete.Fuel;
@Component
public class Petrol implements Fuel {

	public Petrol() {
		System.out.println("Running petrol using no-arg const");	}

	@Override
	public void consume() {
		System.out.println("Running consume method from fuel");
		
	}

}
