package com.java8.predefined.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Java8BiFunction {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		BiFunction<Integer, String, Employee> biFunctionEmployee = (id, name) -> new Employee(id, name);

		empList.add(biFunctionEmployee.apply(100, "Ramu"));
		empList.add(biFunctionEmployee.apply(200, "Ramu"));
		empList.add(biFunctionEmployee.apply(300, "Ramu"));
		empList.add(biFunctionEmployee.apply(400, "Ramu"));

		empList.forEach((emp) -> {
			System.out.println(emp.id + " : " + emp.name);
		});
	}
}
