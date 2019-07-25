package com.testing.program;

public class CloneTest {
	
	int id;
	String name;
	
	public CloneTest(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneTest c= new CloneTest(10,"Shubham");
		System.out.println(c.hashCode());
		
		CloneTest c1=(CloneTest) c.clone();
		System.out.println(c1.hashCode());
		
	}

}
