package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicListStream {

	public static void main(String[] args) {

		List<Integer> integersList = new ArrayList<>();
		integersList.add(2);
		integersList.add(3);
		integersList.add(4);
		integersList.add(5);
		integersList.add(6);
		integersList.add(7);

		List<Integer> evenList = integersList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		List<Integer> addDataList = integersList.stream().filter(i -> i > 3).map(i -> i)
				.collect(Collectors.toList());
		System.out.println(addDataList);
	}

}
