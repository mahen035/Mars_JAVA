package com.training.inheritance;

public class InhetitanceTest {

	public static void main(String[] args) {
		
		//Car car1 = new Car();
		
		Vehicle car2 = new Car();  // Parent class reference can point to child class object
		
		//car1.getValues();
		
		System.out.println(car2.getTopSpeed());  // Dynamic polymorphism

	}

}
