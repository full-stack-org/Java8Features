package com.java8.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsLambdaExpression {
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(30);
		intList.add(10);
		intList.add(60);
		intList.add(25);
		intList.add(20);

		System.out.println("Before Sorting" + intList);

		Comparator<Integer> intComparator = (num1, num2) -> num1 > num2 ? 1 : (num1 < num2 ? -1 : 0);
		Collections.sort(intList, intComparator);

		System.out.println("After Sorting" + intList);
		
		intList.stream().forEach(System.out::println);
		
		List<Integer> evenNumberList = intList.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers");
		evenNumberList.stream().forEach(System.out::println);
	}

}
