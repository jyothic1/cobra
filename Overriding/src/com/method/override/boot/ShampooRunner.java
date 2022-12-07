package com.method.override.boot;

import com.method.override.coding.Shampoo;

public class ShampooRunner {
	public static void main(String[] args) {
		Shampoo shampoo = new Shampoo();
		shampoo.setSize('M');
		shampoo.setBrand("nyle");
		char size=shampoo.getSize();
	String br=shampoo.getBrand();

		shampoo.print();
		System.out.println(size);
		System.out.println(br);
		

	}

}
