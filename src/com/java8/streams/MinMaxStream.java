package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.java8.beans.Student;

public class MinMaxStream {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();

		Student student = new Student();
		student.setId(105);
		student.setName("Sunny");
		student.setAddress("Hyderabad");
		student.setSalary(25000);

		Student student1 = new Student();
		student1.setId(102);
		student1.setName("Bunny");
		student1.setAddress("Hyderabad");
		student1.setSalary(15000);

		Student student2 = new Student();
		student2.setId(101);
		student2.setName("Test");
		student2.setAddress("Hyderabad");
		student2.setSalary(45000);

		studentList.add(student2);
		studentList.add(student1);
		studentList.add(student);

		Optional<Student> minSalStudent = Optional
				.ofNullable(studentList.stream().min(Comparator.comparing(Student::getSalary)).get());
		System.out.println("Min Salary " + minSalStudent.get().getSalary());

		Optional<Student> maxSalStudent = Optional
				.ofNullable(studentList.stream().max(Comparator.comparing(Student::getSalary)).get());
		System.out.println("Max Salary " + maxSalStudent.get().getSalary());

	}

}
