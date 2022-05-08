package com.training.mars;

import java.util.Scanner;

public class BasicsDemo {

	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		pattern();
		/*
		 * System.out.println("Enter age: "); int age = scanner.nextInt();
		 * 
		 * if(age < 18) { System.out.println("Not eligible to vote!"); } else {
		 * System.out.println("Eligible to vote!"); } scanner.close();
		 */
	}
	
	private static void pattern() {
		for(int i = 1;i<=3; i++) {
			for(int j = 1 ; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

//1
//2 3
//4 5 6



