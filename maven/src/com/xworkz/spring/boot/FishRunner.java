package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Fish;

public class FishRunner {

	public static void main(String[] args) {
		ApplicationContext ref=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Fish bean=ref.getBean(Fish.class);
		System.out.println(bean);
	}

}
