package com.testing.program1;

public class CheckingSuperKey {
	
	int a= 20;
	public CheckingSuperKey(){
		System.out.println("In parent");
		System.out.println("In parent" +a);
	}
	void m1(){
		
		System.out.println("In parent m1");
		System.out.println("In parent" +a);
	}
}

class child extends CheckingSuperKey{


	
	
}

class Demo{
public static void main(String[] args) {
	child c = new child();
}
}