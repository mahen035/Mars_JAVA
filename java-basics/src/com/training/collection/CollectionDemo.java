package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		//
		
		Student stud1 = new Student("Sara", 32, "B");
		Student stud2 = new Student("Mark", 12, "C");
		Student stud3 = new Student("Dave", 9, "A");
		Student stud4 = new Student("Kevin", 23, "B");
		//Student stud5 = new Student("Sara", 12, "B");
		
		List<Student> studenSet = new ArrayList<>();
		
		/*
		 * Set<String> names = new TreeSet<>();
		 * 
		 * names.add("Zak"); names.add("Bruce"); names.add("Adam");
		 * 
		 * for(String name:names) { System.out.println(name); }
		 */
		
		studenSet.add(stud1);
		studenSet.add(stud2);
		studenSet.add(stud3);
		studenSet.add(stud4);
		//studenSet.add(stud5);
		System.out.println("----------------------------");
		Collections.sort(studenSet, new NameComparator());
		for(Student student:studenSet) {
			System.out.println("Name: "+student.getName()+ " Roll_No: "+student.getRollNo());
		}
		
		/*
		 * Map<String, Student> studentMap = new HashMap<>();
		 * 
		 * studentMap.put("1", stud1); studentMap.put("2", stud2); studentMap.put("3",
		 * stud3); studentMap.put("4", stud4);
		 * 
		 * for(Map.Entry<String, Student> entry : studentMap.entrySet()) { //String key
		 * = entry.getKey(); Student student = entry.getValue();
		 * System.out.println("NAME: "+student.getName()+" GRADE: "+student.getGrade());
		 * }
		 */
				
		/*
		 * List<Student> studentList = new ArrayList<>();
		 * 
		 * studentList.add(stud1); studentList.add(stud2); studentList.add(stud3);
		 * studentList.add(stud4);
		 * 
		 * for(Student student : studentList) { System.out.println(student.getName()); }
		 */
	
	}

}

//What are the changes that needs to be done in order to let Java consider two objects as same
//if their content is same ?
