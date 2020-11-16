package com.java8.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsDistinct {

	public static void main(String[] args) {

		var nameList = new ArrayList<>();
		nameList.add("Sunny");
		nameList.add("Ramu");
		nameList.add("Sunny");
		nameList.add("Test");

		var finalList = nameList.stream().distinct().collect(Collectors.toSet());

		finalList.stream().forEach(System.out::println);
	}

}
