package com.training.mars;

public class MyClass {
	int num56 =0 ;
	static int age = 8;
	public MyClass() {
		System.out.println(this.age);
	}

	public static void main(String... a) {
	
		System.out.println("This is my first JAVA file");
	
		byte number = 12;

		System.out.println("Byte value is " + number);
		
		int num1 = 8;
		int result = 0;
		String str = null;
		try {
			//result = num1/0;
			System.out.println("String length "+str.length());	//Runtime exception
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
		System.out.println("Result is "+result);

		short shortValue = 48;

		int intValue = 89;

		byte newByte = (byte) intValue; // Explicit typecasting

		int newInt = shortValue; // Implicit typecasting

		int charValue = 'a';
		
		System.out.println("Character value is: " + charValue);

		// int age;

		System.out.println("Age of the person is " + age);

		Person p1 = new Person();
		p1.setHeight(170);
		p1.setWeight(80);
		System.out.println(p1.getPersonInfo());

		Person p2 = new Person();
		p2.setHeight(180);
		p2.setWeight(75);
		System.out.println(p2.getPersonInfo());

		Person p3 = new Person(190, 95);
		System.out.println(p3.getPersonInfo());
		
		try {
			if (p1.getWeight() < 75) {
				throw new MyException("Weight should be less than 75 in this category");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Finally block always execute");
		}
		
	}

}

//try, catch, finally, throw, throws

// Access Specifiers:  public -> anyone can use this
