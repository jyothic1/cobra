package com.xworkz.equals.object.boot;

import com.xworkz.equals.object.code.God;

public class GodRunner {

	public static void main(String[] args) {
		God god=new God();
		god.setFlowers("malige");
		god.setName("lakshmi");
		god.setNoOfTickets(1);
		god.setPlace("kollapur");
		god.setPrasadam("pongal");
		god.setPriceOfTickets(10);
		god.setTimings(6.00);
		god.setWeapon("money");
	
		God god3=new God("krishna","udipi","tulasi","flute","laddu", 2, 20,7.00);
		System.out.println(god);
		System.out.println(god3);
		
		System.out.println(god.getName());
		boolean status=god.equals(god3);
		System.out.println(status);
		

	}

}
