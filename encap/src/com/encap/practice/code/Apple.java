package com.encap.practice.code;

public class Apple {
	private int quantity;
	private Double price;
	private String type;
	

	public Apple() {
		super();
	
	}


	public int getQuantity() {
		return quantity;
	}


	 public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


 void setPrice(Double price) {
		this.price = price;
	}


 protected String getType() {
		return type;
	}


	protected void setType(String type) {
		this.type = type;
	}
public void print()

{
	System.out.println(this.quantity);
	System.out.println(this.type);
	System.out.println(this.price);
	}
	
}
