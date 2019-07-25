package com.testing.program;

public interface Boom {
	
	default void m1(){
		System.out.println("I am interface default method.");
	}
	
	static void m2(){
		System.out.println("I am interface static method.");
	}

}
