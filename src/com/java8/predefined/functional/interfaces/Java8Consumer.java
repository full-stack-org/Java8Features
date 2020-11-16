package com.java8.predefined.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.beans.Student;

public class Java8Consumer {

	public static void main(String[] args) {
		Consumer<String> nameConsumer = name -> System.out.println(name);
		nameConsumer.accept("Tester");

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

		// Predicate
		Predicate<Student> salPredicate = sal -> sal.getSalary() > 25000;

		// Function
		Function<Student, Student> studentFunction = studentSal -> salPredicate.test(studentSal) ? studentSal : null;

		// Consumer
		Consumer<Student> consumer = studt -> {
			System.out.println(studt.getName());
		};

		studentList.forEach((studentData) -> {
			Student latestData = studentFunction.apply(studentData);
			consumer.accept(null != latestData ? latestData : new Student());
		});

	}

}
