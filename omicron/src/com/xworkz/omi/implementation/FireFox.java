package com.xworkz.omi.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.omi.Browser;
import com.xworkz.omi.Provider;

@Component
public class FireFox implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;

	public FireFox() {
		System.out.println("created FireFox using default constructor");
	}

	@Override
	public void browse() {
		System.out.println("running browse from jio browser inteface");
		provider.connect();

	}

}
