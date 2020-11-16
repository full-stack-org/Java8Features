package com.java8.lambdaexpressions;

public class ThreadLambdaExpression {
	
	public static void main(String[] args) {
		Runnable runnable = ()->{
			for(int i=0;i<5;i++) {
			System.out.println("In Child Thread");	
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("In Main Thread");
		}
	}

}
