package com.xworkz.equals.object.code;



public class Lipstick  {
private String brand;
private String name;
private boolean quality;
private double price;
private String shade;
private String color;
private String type;
private boolean isCostly;

public Lipstick(String brand, String name, boolean quality, double price, String shade, String color, String type,
		boolean isCostly) {
	super();
	this.brand = brand;
	this.name = name;
	this.quality = quality;
	this.price = price;
	this.shade = shade;
	this.color = color;
	this.type = type;
	this.isCostly = isCostly;
	System.out.println("parameter constructor");
}
public Lipstick() {
	System.out.println("default construtor");
}
@Override
public String toString() {
	return "Lipstick [brand=" + brand + ", name=" + name + ", quality=" + quality + ", price=" + price + ", shade="
			+ shade + ", color=" + color + ", type=" + type + ", isCostly=" + isCostly + "]";
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isQuality() {
	return quality;
}
public void setQuality(boolean quality) {
	this.quality = quality;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getShade() {
	return shade;
}
public void setShade(String shade) {
	this.shade = shade;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public boolean isCostly() {
	return isCostly;
}
public void setCostly(boolean isCostly) {
	this.isCostly = isCostly;
}
@Override
	public boolean equals(Object obj) {
	System.out.println("running equals method in lipstick");
	if(obj instanceof Lipstick)
	{
		System.out.println("obj is lipstick , can check for properties");
		Lipstick lips=(Lipstick)obj;
		if((this.price==lips.price)&&this.brand.equals(brand))
		{
			System.out.println("same");
			return true;
			
		}
		
	}
	else
	{
		System.err.println("obj is not lipstick");
	}
		return false;
	
		
		
	}

}
