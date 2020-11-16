package com.java8.predefined.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class Department {
	int salary;
	String name;

	public Department(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
}

public class Java8BiConsumer {

	public static void main(String[] args) {
		List<Department> empList = new ArrayList<>();
		empList.add(new Department(1000,"Sunny"));
		empList.add(new Department(2000,"Bunny"));
		empList.add(new Department(3000,"Ramu"));
		BiConsumer<Department, Integer> biConsumer = (e,sal) -> e.salary = e.salary + 500;
		
		empList.forEach((empData)->{
			biConsumer.accept(empData, 500);
		});
		
		empList.forEach((emp)->{
			System.out.println(emp.name + " : " + emp.salary);
		});
	}

}
