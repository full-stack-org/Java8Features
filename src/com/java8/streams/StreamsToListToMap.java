package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Product {
	String productName;
	float price;

	public Product(String productName, float price) {
		this.price = price;
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

public class StreamsToListToMap {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Samsung", 65000));
		productList.add(new Product("LG", 45000));
		productList.add(new Product("Sony", 40400));
		productList.add(new Product("Samsung", 65000));

		Set<Product> finalSet = productList.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Product::getProductName))));

		finalSet.parallelStream().forEach((data) -> {
			System.out.println(data.productName + ":" + data.price);
		});

		var treeSet = new TreeSet<>();

		productList.removeIf(product -> !treeSet.add(product.getProductName()));

		Map<Object, Object> productPriceMap = productList.stream()
				.collect(Collectors.toMap(product -> product.productName, product -> product.price));

		productPriceMap.forEach((k, v) -> {
			System.out.println("in Map Iteration " + k + ":" + v);
		});
	}

}
