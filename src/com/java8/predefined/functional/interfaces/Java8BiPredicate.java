package com.java8.predefined.functional.interfaces;

import java.util.function.BiPredicate;

public class Java8BiPredicate {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (a,b)->(a+b)%2==0;
		System.out.println(biPredicate.test(12, 12));
	}
}
