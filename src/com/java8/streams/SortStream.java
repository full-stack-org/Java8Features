package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.beans.Student;

public class SortStream {

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

		System.out.println("******** Sorting By Id *************");
		List<Student> sortedDataById = studentList.stream()
				.sorted((stud1, stud2) -> stud1.getId() > stud2.getId() ? 1 : (stud1.getId() < stud2.getId() ? -1 : 0))
				.collect(Collectors.toList());

		sortedDataById.forEach((newData) -> {
			System.out.println("Sorting data by Id List : " + newData.getId() + " : " + newData.getName());
		});

		System.out.println("******** Sorting By Name*************");
		List<Student> sortedDataByName = studentList.stream()
				.sorted((stud1, stud2) -> stud1.getName().compareTo(stud2.getName())).collect(Collectors.toList());

		sortedDataByName.forEach((newData) -> {
			System.out.println("Sorting data by Name List : " + newData.getId() + " : " + newData.getName());
		});

		System.out.println("******** Sorting By  Method Reference *************");
		List<Student> sortedDataByMethodReference = studentList.stream()
				.sorted(Comparator.comparing(Student::getSalary).reversed()).collect(Collectors.toList());

		sortedDataByMethodReference.forEach((newData) -> {
			System.out.println("Sorting data by Method Reference : " + newData.getSalary() + " : " + newData.getName());
		});

		System.out.println("******** Sorting without streams *************");
		studentList.sort(Comparator.comparing(Student::getId));
		studentList.forEach((newData) -> {
			System.out.println("Sorting without streams : " + newData.getId() + " : " + newData.getName());
		});
	}

}
