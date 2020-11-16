package com.java8.predefined.functional.interfaces;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToIntFunction;

public class Java8PrimitiveFunctions {

	public static void main(String[] args) {

		IntFunction<Integer> intFunction = num -> num * num * 5;
		System.out.println(intFunction.apply(3));
		
		ToIntFunction<String> toIntFunction = str -> str.length();
		System.out.println(toIntFunction.applyAsInt("Hyderabad"));
		
		LongFunction<Long> longFunction = num -> num * num * 5;
		System.out.println(longFunction.apply(3));

		DoubleFunction<Double> doubleFunction = num -> num * num * 5;
		System.out.println(doubleFunction.apply(3));
		
		/**********************************************/
		
		IntToDoubleFunction intToDoubleFunction = num -> Math.sqrt(num);
		System.out.println(intToDoubleFunction.applyAsDouble(49));
		
		IntToLongFunction intToLongFunction = num -> num * num * 5;
		System.out.println(intToLongFunction.applyAsLong(4));

		LongToIntFunction longToIntFunction = id -> (int) id * 5;
		System.out.println(longToIntFunction.applyAsInt(4));

		LongToDoubleFunction longToDoubleFunction = num -> num * num * 5;
		System.out.println(longToDoubleFunction.applyAsDouble(5));


	}

}
