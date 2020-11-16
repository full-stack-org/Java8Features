package com.java8.defaultstatic.methods;

public interface StaticInterface {

	public static String getName(String name) {
		return name;
	}

	public static void hello() {
		System.out.println("In default Method");
	}

}
