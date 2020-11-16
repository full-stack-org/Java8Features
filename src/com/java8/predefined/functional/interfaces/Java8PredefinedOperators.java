package com.java8.predefined.functional.interfaces;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Java8PredefinedOperators {

	public static void main(String[] args) {
		System.out.println("******Unary Operators ********");
		UnaryOperator<Integer> unaryOperator = i -> i * i;
		System.out.println(unaryOperator.apply(6));

		IntUnaryOperator intUnaryOperator = i -> i * i;
		System.out.println(intUnaryOperator.applyAsInt(7));

		LongUnaryOperator longUnaryOperator = i -> i * i;
		System.out.println(longUnaryOperator.applyAsLong(8));

		DoubleUnaryOperator doubleUnaryOperator = i -> i * i;
		System.out.println(doubleUnaryOperator.applyAsDouble(9));

		System.out.println("******Binary Operators ********");

		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		System.out.println(binaryOperator.apply(6, 10));

		IntBinaryOperator intBinaryOperator = (a, b) -> a * b;
		System.out.println(intBinaryOperator.applyAsInt(6, 10));

		LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
		System.out.println(longBinaryOperator.applyAsLong(7, 10));

		DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
		System.out.println(doubleBinaryOperator.applyAsDouble(8, 10));

	}

}
