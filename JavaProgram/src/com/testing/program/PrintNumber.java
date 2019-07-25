package com.testing.program;

import java.util.concurrent.locks.ReentrantLock;

public class PrintNumber {
	
	static ReentrantLock l= new ReentrantLock();
	public void m1(){
		   if(l.tryLock()){
			for(int i=1; i<4;i++)
			System.out.println(i);
			System.out.println("---------"+Thread.currentThread().getName());
			l.unlock();
		   }else{
			   for(int i=1; i<4;i++)
					System.out.println(i);
					System.out.println("---------"+Thread.currentThread().getName());
		   }
	}

}
