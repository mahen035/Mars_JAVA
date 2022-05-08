package com.training.inheritance;

public class Car extends Vehicle {
	
	static int noOfWheels;
	
	public Car() {
		super();
		System.out.println("Car constructor");
	}
	
	public void getValues() {
		brakeType = "Disk";
		speed = 150;
		color="Blue";
		System.out.println("Color: " +color +" speed: "+speed);
		
	}
	
	@Override
	public int getTopSpeed() {   //Method overridden
		return 200;
	}

}
