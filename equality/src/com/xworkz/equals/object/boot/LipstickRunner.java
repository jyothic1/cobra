package com.xworkz.equals.object.boot;

import com.xworkz.equals.object.code.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {
		Lipstick lip=new Lipstick();
		lip.setBrand("sugar");
		lip.setColor("wine");
		lip.setCostly(true);
		lip.setName("lipstick");
		lip.setPrice(799);
		lip.setQuality(true);
		lip.setShade("nude");
		lip.setType("sheer");
		  
		Lipstick lipstick=new Lipstick("Maybelline","Lipstick", true, 900, "dark red", "red", "satin", true);
	
		System.out.println(lip);
		System.out.println(lipstick);
		//lip=lipstick;
		boolean status=lip.equals(lipstick);
		System.out.println(status);
		//lipstick=lip;
		System.out.println(lip.getBrand());
		
		
		
	}

}
