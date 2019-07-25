package com.testing.program1;

public class Singleton {
	
	static Singleton s= new Singleton();
	
	private Singleton(){
		if(s!=null){
			 throw new RuntimeException("Singleton already constructed");
		}
	}
public static Singleton getInstance(){
	return s;
	
}

}
