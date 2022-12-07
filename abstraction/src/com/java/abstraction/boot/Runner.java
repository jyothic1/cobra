package com.java.abstraction.boot;

import com.java.abstraction.coding.Students;
import com.java.abstraction.follow.Librarian;
import com.java.abstraction.inter.Library;

public class Runner {
	public static void main(String[] args) {
		Library library=new Students();
		   Librarian librarian=new Librarian(library);
		   librarian.rules();
		   
		
	}

	
}
