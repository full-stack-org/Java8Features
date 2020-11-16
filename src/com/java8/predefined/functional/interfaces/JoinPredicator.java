package com.java8.predefined.functional.interfaces;

import java.util.function.Predicate;

public class JoinPredicator {
	public static void main(String[] args) {
		Predicate<Integer> evenOrOddPredicate = num -> num%2==0;
		Predicate<Integer> numberPredicate = num -> num>0;
		
		System.out.println("Predicate And : " + evenOrOddPredicate.and(numberPredicate).test(20));
		System.out.println("Predicate Or : " + evenOrOddPredicate.or(numberPredicate).test(5));
		System.out.println("Predicate Negate : " + evenOrOddPredicate.negate().test(5));

	}
}
