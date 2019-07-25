package com.testing.program;

import java.io.Serializable;

public class ChildClass extends ParentClass implements Serializable {
	int z=10;
	public ChildClass (){
		System.out.println("I am from child class");
	}

}
