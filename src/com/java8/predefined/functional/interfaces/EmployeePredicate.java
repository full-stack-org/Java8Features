package com.java8.predefined.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.beans.Student;

public class EmployeePredicate {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		Student student = new Student();
		student.setId(105);
		student.setName("Test");
		student.setAddress("Hyderabad");
		student.setSalary(25000);

		Student student1 = new Student();
		student1.setId(102);
		student1.setName("Sunny");
		student1.setAddress("Tenali");
		student1.setSalary(95000);

		Student student2 = new Student();
		student2.setId(101);
		student2.setName("Bunny");
		student2.setAddress("Vijayawada");
		student2.setSalary(45000);

		studentList.add(student);
		studentList.add(student1);
		studentList.add(student2);
		
		Predicate<Student> studentPredicate = salary -> salary.getSalary() > 15000;
		
		studentList.forEach((studentData)->{
			if(studentPredicate.test(studentData)) {
				System.out.println(studentData.getName() + ":"+ studentData.getSalary());
			}
		});
	
		Function<Integer, Integer> functionOne = num -> num*2;
		Function<Integer,Integer> functionTwo = num -> num*num*num;
		
		//andThen
		System.out.println("And Then : " + functionOne.andThen(functionTwo).apply(2));
				
		//compose
		System.out.println("Compose : " + functionOne.compose(functionTwo).apply(2));

	}

}
