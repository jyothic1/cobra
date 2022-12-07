package com.encap.practice.boot;
import com.encap.practice.code.Apple;
public class FruitRunner extends Apple{

	public static void main(String[] args) 
	{
		
		Apple apple=new Apple();
		apple.setPrice(null);
		apple.setQuantity(0);
		apple.setType("simla");
		System.out.println(apple.getType());  
		apple.print();
		
		
		
	}

}
