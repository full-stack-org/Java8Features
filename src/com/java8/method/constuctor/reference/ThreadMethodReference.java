package com.java8.method.constuctor.reference;

import java.util.function.BiFunction;

public class ThreadMethodReference {

	public static void main(String[] args) {
		Runnable runnable = ThreadMethodReference::childMethod;
		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("In Main Method");
		}
		
		BiFunction<Integer, Integer, Integer> intFunction = ThreadMethodReference::add;
		System.out.println(intFunction.apply(99, 199));

	}

	private static void childMethod() {
		for (int i = 0; i < 5; i++) {
			System.out.println("In Child Method");
		}
	}

	private static Integer add(int j,int i) {
		return j + i;
	}

		
}
