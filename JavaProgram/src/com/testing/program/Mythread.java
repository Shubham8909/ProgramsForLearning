package com.testing.program;

import java.util.concurrent.locks.ReentrantLock;

public class Mythread extends Thread {
	
  static ReentrantLock l= new ReentrantLock();
  static int count=0;
	public Mythread(String name){
		super(name);
	}
	
	public void run(){	
		  count++;
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName()+" got lock");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l.unlock();
			
		}else{
			System.out.println(Thread.currentThread().getName()+" with out lock");
		}
		
		System.out.println(count);
	}

}
