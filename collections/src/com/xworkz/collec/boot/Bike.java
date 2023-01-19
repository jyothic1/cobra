package com.xworkz.collec.boot;

import java.util.Collection;
import java.util.HashSet;

public class Bike {
	public static void main(String[] args) {
		
String bike1="CT100";
String bike2="Suzuki";
String bike3="Splender++";
String bike4="HeroHonda";
String bike5="Bajaj";
Collection<String>col=new HashSet<String>();
col.add(bike1);
col.add(bike3);
col.add(bike1);
col.add(bike2);
col.add(bike5);
col.add(bike4);
col.add(null);
System.out.println(col);
int size=col.size();
System.out.println(size);
col.clear();
System.out.println(col.size());




	}

}
