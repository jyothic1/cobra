package com.xworkz.collec.boot;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Sweets {
	public static void main(String[] args)
	{ String sweet1="Badusha";
	 String sweet2="Paysa";
	 String sweet3="Uggi";
	 String sweet4="Karjikay";
	 String sweet5="Olige";
	 
	 Collection<String>col=new LinkedHashSet<String>();
	 col.add(sweet2);
	 col.add(sweet1);
	 col.add(sweet3);
	 col.add(sweet4);
	 col.add(sweet5); 
	 col.add(null);
	 col.add(sweet5);
	 col.add(sweet2);
	 System.out.println(col);
	 System.out.println(col.size());
	 col.clear();
	 System.out.println(col.size());
	 
		
	
	

	}

}
