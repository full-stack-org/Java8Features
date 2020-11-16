package com.java8.predefined.functional.interfaces;

import java.util.function.Function;

@FunctionalInterface
interface MyFunctionalInterface {
	Student getStudent(String name);
}

public class Java8ConstructorReference {
	public static void main(String[] args) {
		MyFunctionalInterface mf = Student::new;

		Function<String, Student> f1 = Student::new; // Constructor Reference
		Function<String, Student> f2 = (name) -> new Student(name);

		System.out.println(mf.getStudent("Adithya").getName());
		System.out.println(f1.apply("Jai").getName());
		System.out.println(f2.apply("Jai").getName());
	}
}

// Student class
class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}