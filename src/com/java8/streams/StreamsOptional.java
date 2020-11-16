package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsOptional {

	public static void main(String[] args) {

		var nameList = new ArrayList<>();
		nameList.add("Sunny");
		nameList.add("Ramu");
		nameList.add("Sunny");
		nameList.add("Test");

		Optional<List<Object>> optional = Optional
				.ofNullable(nameList.stream().filter(name -> name != "Test").collect(Collectors.toList()));

		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
		

	}

}
