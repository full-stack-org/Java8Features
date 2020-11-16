package com.java8.predefined.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvenOrOddPredicate {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(5));
		System.out.println(predicate.test(10));
		
		String name ="Gopi";
		Predicate<String> predicateString = str -> str.length()>5;
		System.out.println(predicateString.test(name));
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Gopi");
		nameList.add("Raju S");
		nameList.add("Seelam");
		nameList.add("Test");
		
		nameList.forEach(mineName->{
			if(predicateString.test(mineName)) {
				System.out.println("Length > 5 is " + mineName);
			}
		});
	}
}
