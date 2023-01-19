package com.xworkz.collec.boot;

import java.util.Collection;
import java.util.LinkedList;

public class Malls {
	public static void main(String[] args) 
	{
		String mall1="Orian";
	    String mall2="GT";
	    String mall3="lulu";
	    String mall4="Mantri";
	    String mall5="Garuda";
	    Collection<String>col=new LinkedList<String>(); 
		col.add(mall5);
		col.add(mall4);
		col.add(mall3);
		col.add(mall1);
		col.add(mall2);
		col.add(mall5);
		col.add(null);
		//System.out.println(col);
		System.out.println(col.size());
	
		col.clear();
		System.out.println(col.size());
		
		
	    		
	    	

	}

}
