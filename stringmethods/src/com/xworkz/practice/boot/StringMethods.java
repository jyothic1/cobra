package com.xworkz.practice.boot;



public class StringMethods {
 String name= "jyothi";
 
	 String[] dosa1={"ragi dosa","masala dosa"};
	String[] dosa2={"masala dosa","ragi dosa"};


	public void method()
	{
	for(int i=0;i<name.length();i++)
	{
		char c=name.charAt(i);
		System.out.println("character at position "+i+" is "+c);
	}
	System.out.println(dosa1.length);
	System.out.println(dosa2.length);
	System.out.println("comparing two strings");
	for (int i = 0; i < dosa1.length; i++) {
		for (int j = 0; j < dosa2.length; j++) {
			
			int g=dosa1[i].compareTo(dosa2[j]);
			System.out.println(g);
			System.out.println("concatinating two strings");
			for (int kite = 0; kite < dosa1.length; kite++) {
				for (int thread = 0; thread < dosa1.length; thread++) {
				
			          String yummy= dosa1[kite].concat(" "+dosa2[thread]);
			         System.out.println(yummy);
					}
				}
					
				}
				
			}
		
		
		
	}
	
		
	}
	
	


