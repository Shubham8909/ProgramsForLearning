package com.testing.program;

import java.util.concurrent.locks.*;

public class Display {
	ReentrantLock l=new ReentrantLock();

	public  void printName(String name){
         l.lock();
		for(int i=0; i<10;i++){
			
			System.out.print("Gud Morning Bro- ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		//l.unlock();
		
		
		}
		


}
