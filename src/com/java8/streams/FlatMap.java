package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {

		// Creating a List of Strings
		List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");

		// Using Stream flatMap(Function mapper)
		list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);

		List<Integer> i1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> i2 = Arrays.asList(5, 6, 7, 8);

		List<List<Integer>> integerList = Arrays.asList(i1, i2);

		Optional<List<Integer>> optionalList = Optional
				.ofNullable(integerList.stream().flatMap(List::stream).collect(Collectors.toList()));
		if (optionalList.isPresent()) {
			System.out.println(optionalList.get());
		}
	}

}
