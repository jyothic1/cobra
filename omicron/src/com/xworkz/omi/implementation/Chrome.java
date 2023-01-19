package com.xworkz.omi.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.omi.Browser;
import com.xworkz.omi.Provider;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	public Chrome() {
		System.out.println("created chrome using default constructor");
	}

	@Override
	public void browse() {
		System.out.println("running browse from aitrel browser inteface");
		provider.connect();

	}

}
