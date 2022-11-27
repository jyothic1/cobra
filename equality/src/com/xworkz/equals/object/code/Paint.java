package com.xworkz.equals.object.code;

public class Paint {
	
	 private String brand;
	 private double price;
	 private double quantity;
	 private String color;
	 private String packing;
	 private String mfDate;
	 private String expDate;
	 private boolean quality;
	 private String type;
	 private double weight;
	public Paint(String brand, double price, double quantity, String color, String packing, String mfDate,
			String expDate, boolean quality, String type, double weight) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
		this.packing = packing;
		this.mfDate = mfDate;
		this.expDate = expDate;
		this.quality = quality;
		this.type = type;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", color=" + color
				+ ", packing=" + packing + ", mfDate=" + mfDate + ", expDate=" + expDate + ", quality=" + quality
				+ ", type=" + type + ", weight=" + weight + "]";
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Paint)
		{
			Paint paint=(Paint)obj;
			if(this.color.equals(paint.color)&this.weight==paint.weight)
			{
				System.out.println("color is same");
				return true;
				
				
			}
			
			}
		else {
			System.out.println("obj is not paint type");
		}
			return false;
		
		

		
	}
	 

}
