package com.testing.program1;

import java.util.Iterator;

public class ThreadTest extends ConcurrentThread{

	public static void main(String[] args) {
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		ConcurrentThread t= new ConcurrentThread();
		t.start();
		
		Iterator<Integer> it = c.iterator();
		
		while(it.hasNext()){
		 int i= it.next();
		 System.out.println(i);
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
