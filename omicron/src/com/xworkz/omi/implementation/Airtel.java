package com.xworkz.omi.implementation;

import org.springframework.stereotype.Component;

import com.xworkz.omi.Provider;

@Component
public class Airtel implements Provider {

	public Airtel() {
		System.out.println("created Airtel using default constructor");

	}

	@Override
	public void connect() {

		System.out.println("running connect from provider inteface");
	}

}
