package com.java8.predefined.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.java8.beans.Student;

public class Java8Function {

	public static void main(String[] args) {

		Function<Integer, Integer> squareFunction = num -> num * num;
		System.out.println("Square " + squareFunction.apply(5));

		Function<String, Integer> lengthFunction = str -> str.length();
		System.out.println("Length " + lengthFunction.apply("Sunny Bunny Test"));

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

		Function<Student, Student> studentFunction = studentSal -> studentSal.getSalary() > 25000 ? studentSal : null;

		studentList.forEach((studentData) -> {
			Student latestData = studentFunction.apply(studentData);
			System.out.println(latestData != null ? latestData.getName() : null);
		});

		//andThen
		
		//compose
		
	}

}
