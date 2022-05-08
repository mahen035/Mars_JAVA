package com.training.java8;

public class LambdaDemo {

	public static void main(String[] args) {
		
		MyFuncInterface method = (a) -> {
			int b = a*5;
			return b;
		};
		
		System.out.println(method.getValue(5));

	}
	
	
}
