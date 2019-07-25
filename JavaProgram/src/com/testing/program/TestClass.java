package com.testing.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClass {

	public static void main(String[] args)  {

		ChildClass childClass = new ChildClass();
		System.out.println(childClass.name + " " + childClass.k + " " + childClass.z);
		childClass.name = "brother";
		childClass.k = 50;
		System.out.println(childClass.name + " " + childClass.k + " " + childClass.z);

		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream("C:/Users/1204621/Downloads/shubham1.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(childClass);
			fos.close();
			oos.close();
			FileInputStream fis = new FileInputStream("C:/Users/1204621/Downloads/shubham1.txt");
			ObjectInputStream oi = new ObjectInputStream(fis);
			ChildClass childClass1 = (ChildClass) oi.readObject();
			System.out.println(childClass1.k + " " + childClass1.name + " " + childClass1.z);
			fis.close();
			oi.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} 
	

		

	}

}
