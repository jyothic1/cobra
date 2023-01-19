package com.xworkz.collec.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Coupons {
public static void main(String[] args) {
	
	String coupon1="Bogo";
	String coupon2="Gift Card";
	String coupon3="Free Shipping";
	String coupon4="complementary";
	String coupon5="discount";
	String coupon6="Reserve";
	Collection<String>collection=new TreeSet<String>();
	collection.add(coupon6);
	collection.add(coupon5);
	collection.add(coupon4);
	collection.add(coupon3);
	collection.add(coupon1);
	collection.add(coupon2);
	//collection.add(null);//---cannot add null
	collection.add(coupon4);
	//System.out.println(collection);
	System.out.println(collection.size());
	//collection.clear();
	System.out.println(collection.size());
	
Iterator<String>itertator= collection.iterator();
while(itertator.hasNext()) {
	String element=itertator.next();
	System.out.println(element);
	System.out.println("element is there"+itertator.hasNext());
}

	
	
	
	
	
}

}
