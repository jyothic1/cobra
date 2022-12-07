package com.method.override.code;

public class PainKiller {
	private double price;
	String color;
	protected String brand;
	public boolean isStrong;

	public PainKiller() {
		System.out.println("running default const of PainKiller ");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	protected void display() {
		System.out.println(this.brand);
		System.out.println(this.isStrong);
	}

}
