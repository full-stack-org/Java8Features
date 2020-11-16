package com.java8.lambdaexpressions;

import com.java8.functionalinterface.HelloFunctionalInterface;
import com.java8.functionalinterface.SquareFunctionalInterface;

public class HelloLamda {

	public static void main(String[] args) {

		HelloFunctionalInterface functionalInterface = (name) -> System.out.println("Hello " + name);
		functionalInterface.hello("Gopi Raju");
		functionalInterface.hello("Seelam");
		
		SquareFunctionalInterface squareFunctionalInterface = num -> num * num ;
		
		System.out.println(squareFunctionalInterface.squareIt(5));
	}
}
