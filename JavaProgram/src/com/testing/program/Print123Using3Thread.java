package com.testing.program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Print123Using3Thread {

	public static void main(String args []) {
		 ExecutorService executor = Executors.newFixedThreadPool(5);
		
		Thread t1= new Thread(new Print123Class(1));
		Thread t2= new Thread(new Print123Class(2));
		Thread t3= new Thread(new Print123Class(3));
           t1.start();
           t2.start();
           t3.start();
	}

}
