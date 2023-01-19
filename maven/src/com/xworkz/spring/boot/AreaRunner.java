package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Area;

public class AreaRunner {


	public static void main(String[] args) 
	
	{
	   ApplicationContext con=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Area ref=con.getBean(Area.class);
	   System.out.println(ref);

	}
}