package com.testing.program;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	
	String name="siddharth";
	transient int pin=1234;
	transient String password="verma";
	int accountNumer=5676456;
	
/*	private void writeObject(ObjectOutputStream oos) throws Exception{
		System.out.println("writeObject method");
		oos.defaultWriteObject();
		String pwd=this.password+"852";
		 int pin= 123+this.pin;
	    System.out.println(pin);
		oos.writeObject(pwd);
		oos.writeObject(pin);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception{
		System.out.println("readObject method");
		ois.defaultReadObject();

		String str=(String)ois.readObject();
		this.password=str.substring(0, 5);
	    this.pin=ois.readInt()-123;
	    System.out.println(this.pin);

		
	}*/

}