package com.xworkz.practice.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.practice.incomplete.Fuel;
import com.xworkz.practice.incomplete.PetrolBunk;
@Component
public class Shell implements PetrolBunk{
	@Autowired
	@Qualifier("diesel")
	private Fuel fuel;

	public Shell() {
		System.out.println("Running shell using no-arg const");
	}

	@Override
	public void purchase() {
		System.out.println("Running purchase method from petrol bunk");
		fuel.consume();
	}

}
