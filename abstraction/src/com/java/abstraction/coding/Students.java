package com.java.abstraction.coding;

import com.java.abstraction.inter.Library;

public class Students implements Library{

	public Students() {
		System.out.println("Running default const of Students ");
		
	}

	@Override
	public boolean silence() {
		System.out.println("Running silence");
		
		return false;
	}

	@Override
	public char reading() {
		System.out.println("Running reading");
		return 'N';
	}

}
