package com.java8.predefined.functional.interfaces;

import java.util.Date;
import java.util.function.Supplier;

public class Java8Supplier {
	public static void main(String[] args) {
		Supplier<Date> supplier = () -> new Date();
		System.out.println(supplier.get());
	}
}
