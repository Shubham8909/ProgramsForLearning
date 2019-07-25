package com.testing.program1;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentThread extends Thread{
	
	static ArrayList<Integer> c= new ArrayList<>();
	
	public void run(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("child thread");
		c.add(5);
		
	}

}
