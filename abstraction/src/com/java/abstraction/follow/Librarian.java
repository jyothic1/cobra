package com.java.abstraction.follow;

import com.java.abstraction.inter.Library;

public class Librarian {
	private Library library;

	public Librarian(Library library ) {
		super();
		this.library=library;
		System.out.println("Running default const of Librarian");
	}
 public void rules()
 {
	 System.out.println("Running rules from Librarian");
	 if(this.library!=null)
	 {
		 boolean read=this.library.silence();
		    char no=this.library.reading() ; 
		 if(read==true&&no=='Y')
		 {
			 System.out.println("students are from first bench");
		 }
		 else
		 {
			 System.out.println("students are form last bench");
		 }
	 }               
 }
	
	
	
}
