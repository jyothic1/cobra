package com.xworkz.odc.code;

public class Curd {
	
	public String color;
	public double fat;
	public String company;
	
	public Curd(String color, double fat, String company) {
		super();
		this.color = color;
		this.fat = fat;
		this.company = company;
	}
	
protected void print()
	{
		System.out.println(this.color);
		System.out.println(this.fat);
		System.out.println(this.company);
	}

	 

}
