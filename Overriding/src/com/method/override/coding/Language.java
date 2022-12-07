package com.method.override.coding;

import com.method.override.code.Kannada;

public class Language extends Kannada {

	//Language language = new Language();
	//System.out.println(language.version);
	Kannada kannada=new Kannada();
	


	@Override
	public void coding(){
		System.out.println("running coding method in Language");
		super.name="telugu";
		System.out.println(super.name);
		//super.coding();
		
	}

}
