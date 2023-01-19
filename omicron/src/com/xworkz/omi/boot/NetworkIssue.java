package com.xworkz.omi.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.omi.configuration.SpringConfiguration;
import com.xworkz.omi.implementation.Chrome;
import com.xworkz.omi.implementation.FireFox;

public class NetworkIssue {

	public NetworkIssue() {
		System.out.println("created NetworkIssue using default constructor");
	}

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FireFox ref1=container.getBean(FireFox.class);
		ref1.browse();
		Chrome ref=	container.getBean(Chrome.class);

		ref.browse();
		

	}

}
