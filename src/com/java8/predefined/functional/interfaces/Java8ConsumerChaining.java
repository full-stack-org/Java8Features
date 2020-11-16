package com.java8.predefined.functional.interfaces;

import java.util.function.Consumer;

class Movie {
	String movieName;

	public Movie(String movieName) {
		this.movieName = movieName;
	}
}

public class Java8ConsumerChaining {
	public static void main(String[] args) {

		Consumer<String> consumerOne = movieName -> {
			System.out.println(movieName + " Released");
		};
		Consumer<String> consumerTwo = movieName -> {
			System.out.println(movieName + " Flop");
		};
		Consumer<String> consumerThree = movieName -> {
			System.out.println(movieName + " Stored");
		};

		Consumer<String> consumerChain = consumerOne.andThen(consumerTwo).andThen(consumerThree);

		Movie movie = new Movie("Spider");

		consumerChain.accept(movie.movieName);
	}
}
