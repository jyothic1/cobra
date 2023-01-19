package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Mall;

public class MallRunner {

	public MallRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	ApplicationContext con=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Mall ref=con.getBean(Mall.class);
	System.out.println(ref);

	}

}
