package com.xworkz.practice.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.practice.configuration.SpringConfiguration;
import com.xworkz.practice.implementation.Shell;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Shell s=container.getBean(Shell.class);
s.purchase();


	}

}
