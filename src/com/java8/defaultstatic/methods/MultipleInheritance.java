package com.java8.defaultstatic.methods;

public class MultipleInheritance implements ParentOne, ParentTwo {
	public static void main(String[] args) {
		MultipleInheritance multipleInheritance = new MultipleInheritance();
		multipleInheritance.m1();
	}

	@Override
	public void m1() {
		ParentOne.super.m1();
		ParentTwo.super.m1();
	}
}

