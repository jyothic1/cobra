package com.method.override.code;

public class Nyle {
	protected String color;
	private String brand;
	public double price;
	char size;

	public Nyle() {
		System.out.println("super chaining");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	protected void show() {

		System.out.println(this.color);
		System.out.println(this.price);

	}

}
