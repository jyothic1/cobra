package com.method.override.coding;

import com.method.override.code.Nyle;

public class Shampoo extends Nyle {

	public Shampoo() {
		super.color="orange";
		System.out.println("running shampoo const");
		System.out.println(color);
		
	}

	public void print() {
		System.out.println("running shampoo");
		System.out.println("re init color");
		super.color = "green";
		super.show();
	}

}
