package com.xworkz.odc.boot;

import com.xworkz.odc.coding.Pista;

public class PistaRunner {

	public static void main(String[] args) {
		Pista pista=new Pista(500,"enu illa",1.5);
	
		double total=pista.print();
		System.out.println(total);

		
	}

}
