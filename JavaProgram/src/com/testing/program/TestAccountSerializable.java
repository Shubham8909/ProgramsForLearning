package com.testing.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Account ac= new Account();
		System.out.println("Account details:-"+ac.name+" "+ac.accountNumer+" "+ac.password+" "+ac.pin);
		
		FileOutputStream fos= new FileOutputStream("C:/Users/1204621/Downloads/siddharth.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(ac);
		fos.close();
		oos.close();
		
		
		FileInputStream fis= new FileInputStream("C:/Users/1204621/Downloads/siddharth.txt");
		ObjectInputStream oi =new ObjectInputStream(fis);
		Account account= (Account)oi.readObject();
		System.out.println("Account details:-"+account.name+" "+account.accountNumer+" "+account.password+" "+account.pin);
		fis.close();
		oi.close();
	}

}   
