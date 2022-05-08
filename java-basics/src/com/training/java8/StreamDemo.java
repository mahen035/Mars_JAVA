package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(4,8,2,6,1,7,9);  //Creating a list of numbers
		
		//Stream<Integer> numberStream = numbers.stream();	// Creating a stream on numbers collection
		
		//Stream<Integer> squaredValue = numberStream.map(a -> a*a); // call intermediate map method on numberStream
		
		//List<Integer> updatedNumbers = squaredValue.collect(Collectors.toList());
		
				
		List<Integer> newNumbers = numbers.stream().map(a->a*a).collect(Collectors.toList());
		
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		
		List<Integer> sortedSquaredNumbers = numbers.stream().map(a->a*a).sorted().collect(Collectors.toList());
		
		//List<Integer> evenList = numbers.stream().filter(x -> (x%2==0)).collect(Collectors.toList());
		
		numbers.stream().filter(x -> (x%2==0)).forEach(System.out::println); //method reference
		
		int sumEven = numbers.stream().filter(x -> (x%2==0)).reduce(0,(ans, y) -> ans+y);
		
		System.out.println("Sum of even numbers is: "+sumEven);
		
		System.out.println(newNumbers);
		
		System.out.println(sortedNumbers);
		
		System.out.println(sortedSquaredNumbers);
		
		//System.out.println(evenList);
	}

}

//Intermediate operation: map, filter, sorted
//Terminal operation : collect, forEach, reduce

//Demonstrate different stream operations in a collection of Strings
