package com.training.mars;

import java.util.Scanner;
public class DataTypeDemo {

	public static void main(String[] args) {
		
		String name = "John";		//creating String literal
		
		String myName = "John";
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(name.equals(myName)); // compares content
		
		//System.out.println(name == myName); // compares references
		
		String firstName = new String("John"); // creating String object
		
		String secondName = new String("John");
		
		System.out.println(firstName.equals(secondName)); // compares content
		
		System.out.println(firstName == secondName); // compares references
		
		String fullName = name.concat(" Doe");
		
		System.out.println("New Name: "+fullName);
		
		int[] marks = new int[5];
		for(int i=0;i<marks.length;i++) {
			marks[i] = 2*i+4;
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("----------------------------------");
		
		int [][] numbers = new int[3][];
		
		//System.out.println("Array Size: "+numbers.length);
		numbers[0] = new int[4];
		numbers[1] = new int[5];
		numbers[2] = new int[4];
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				numbers[i][j] = i*4+j;
			}
		}
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		int evenCount = 0;
		int oddCount = 0;
		int[] values = new int[6];
		System.out.println("Enter 6 number");
		for(int i = 0; i<6 ;i++) {
			values[i] = sc.nextInt();
		}
		
		for(int i = 0; i<values.length ;i++) {
			if(values[i]%2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
	}

}
