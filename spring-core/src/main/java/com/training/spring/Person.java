package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	@Autowired
	private Car car;

	public Person() {
		
	}
	
	public Person(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public String getCarDetails() {
		return car.getMake()+":"+car.getModel()+":"+car.getYear();
	}

}

// Setter based injection
// Constructor based injection
// how to inject an object -- setter/constructor/autowire=byName/byType/Annotation
//
