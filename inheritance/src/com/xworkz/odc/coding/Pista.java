package com.xworkz.odc.coding;

import com.xworkz.odc.code.DryFruits;

public class Pista extends DryFruits{
	
	public double price;
	public double quantity;
	public Pista(double price,String shopName,double quantity) {
		super(shopName);
		this.price = price;
		this.quantity=quantity;
	}
	
	public double print()
	{
		double total=price*quantity;
		System.out.println(this.shopName);
		System.out.println(this.price);
		System.out.println(this.quantity);
	 	
		return total;
		
	}
 

 
}
	


