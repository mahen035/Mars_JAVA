package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig;

public class SpringTester {

	public static void main(String[] args) {
		
		//ApplicationContext  context = new ClassPathXmlApplicationContext("Application.xml");
		
		ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p1 = (Person)context.getBean("person");
		
		//Car c1 = (Car)context.getBean("car");
		
		System.out.println(p1.getFirstName()+":"+p1.getAge());
		
		System.out.println(p1.getCarDetails());
		
	}

}
