package com.java8.defaultstatic.methods;

public interface DefaultInterface {
	String sayHello(String Name);

	default void hello() {
		System.out.println("Heloooooooooo");
	}

	default String getName(String name) {
		return name;
	}
}
