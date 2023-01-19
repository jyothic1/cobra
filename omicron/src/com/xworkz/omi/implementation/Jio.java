package com.xworkz.omi.implementation;

import org.springframework.stereotype.Component;

import com.xworkz.omi.Provider;

@Component
public class Jio implements Provider {

	public Jio() {
		System.out.println("created jio using default constructor");
	}

	@Override
	public void connect() {
		System.out.println("running connect from provider inteface");

	}

}
