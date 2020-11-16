package com.java8.predefined.functional.interfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Java8PrimitivePredicate {

	public static void main(String[] args) {

		IntPredicate intPredicate = i -> i % 2 == 0;

		System.out.println(intPredicate.test(25));

		LongPredicate longPredicate = i -> i % 2 == 0;

		System.out.println(longPredicate.test(24));

		DoublePredicate doublePredicate = i -> i % 2 == 0;

		System.out.println(doublePredicate.test(20));

	}

}
