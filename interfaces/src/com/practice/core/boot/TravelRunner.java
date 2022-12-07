package com.practice.core.boot;

import com.practice.core.coding.Travel;
import com.practice.core.inter.Train;

public class TravelRunner {

	public TravelRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Train train=new Travel();
	Travel travel=new Travel();
	Object object=new Travel();
	Travel t=(Travel)object;
	System.out.println(train.isCostly(false));
	System.out.println(travel.name("metro"));
	System.out.println(train.place("peenya"));
	System.out.println(t.ticketPrice(35));
	System.out.println(travel.type("electric"));
	
	}

}
