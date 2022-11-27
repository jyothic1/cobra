package com.xworkz.odc.coding;

import com.xworkz.odc.code.Curd;

public class Nandini extends Curd {
	
	public String brand;
	public  double price;
	
	public Nandini(String brand,double price,String color,double fat,String company)
	{
		super(color,fat,company);
		this.brand=brand;
		this.price=price;
	}
	


	




	@Override
public void print()
	{
		System.out.println(this.color);
		System.out.println(this.fat);
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.price);
	}

	

	 

	
	}






