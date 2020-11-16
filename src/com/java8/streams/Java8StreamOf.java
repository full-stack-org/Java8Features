package com.java8.streams;

import java.util.stream.Stream;

public class Java8StreamOf {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(9, 999, 99, 99999, 9999);
		stream.forEach(System.out::println);
	}

}
