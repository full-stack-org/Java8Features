package com.java8.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.beans.Student;

public class EmployeeLamdaExpression {

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
		student1.setSalary(25000);
		
		Student student2 = new Student();
		student2.setId(101);
		student2.setName("Test");
		student2.setAddress("Hyderabad");
		student2.setSalary(45000);
		
		studentList.add(student2);
		studentList.add(student1);
		studentList.add(student);
		
		//Sort by Id
		Comparator<Student> studentComparator = (st1,st2) -> st1.getId() < st2.getId() ?-1:(st1.getId()>st2.getId()?1:0);
		Collections.sort(studentList,studentComparator);
		System.out.println("Id Comparator");
		System.out.println("==============\n");
		studentList.stream().forEach((data) ->{
			System.out.println(data.getId() +":" + data.getAddress() +":" + data.getName()+":" + data.getSalary());
		});
		
		//Sort by Name
		Comparator<Student> nameComparator = (st1,st2) -> st1.getName().compareTo(st2.getName());
		System.out.println("Name Comparator");
		System.out.println("==============\n");
		Collections.sort(studentList,nameComparator);
		
		studentList.stream().forEach((data) ->{
			System.out.println(data.getId() +":" + data.getAddress() +":" + data.getName()+":" + data.getSalary());
		});
		
	}
	

}
