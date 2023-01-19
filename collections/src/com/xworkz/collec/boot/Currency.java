package com.xworkz.collec.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Currency {

	public static void main(String[] args) {
		String india = "Rupees";
		String china = "Yuan";
		String pakistan = "Pakistan Rupee";
		String us = "dollar";
		String korea = "Won";
		String oman = "Omani";
		Collection<String> collection = new ArrayList<String>();
		collection.add(korea);
		collection.add(oman);
		collection.add(us);
		collection.add(pakistan);
		collection.add(china);
		collection.add(china);
		collection.add(india);
		collection.add(null);
		System.out.println(collection);
		 collection.clear();
		System.out.println(collection);
		System.out.println(collection.size());

	}
}
