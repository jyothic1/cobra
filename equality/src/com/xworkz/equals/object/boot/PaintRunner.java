package com.xworkz.equals.object.boot;

import com.xworkz.equals.object.code.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint asian=new Paint("Asian Paints", 320, 3, "lavender", "plastic", " july 2022", "july 2024", true,"chemical type",500.00);
		System.out.println(asian);
		Paint nippon=new Paint("Nippon Paints", 400, 3, "pink", "plastic","june 2034","june 2045",false,"natural",1000.00);
		System.out.println(nippon);
		asian=nippon;
		//System.out.println(asian.brand);
	 boolean status=asian.equals(nippon);
	 System.out.println(status);

	 																													
	}

}
