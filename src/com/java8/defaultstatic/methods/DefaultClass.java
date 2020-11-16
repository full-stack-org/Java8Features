package com.java8.defaultstatic.methods;

public class DefaultClass implements DefaultInterface {

	public static void main(String[] args) {
		
		DefaultClass defaultClass = new DefaultClass();
		System.out.println(defaultClass.getName("Hello Gopi"));
		defaultClass.hello();
		System.out.println(defaultClass.sayHello(" Seelam"));

	}

	@Override
	public String sayHello(String Name) {
		return "Hello" + Name;
	}

}
