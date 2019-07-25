package com.testing.program;

public class ClassLevelThread implements Runnable{
	@Override
	public void run() {
		Lock();
	}

	 public void Lock() 
	    { 
	     
	        synchronized(ClassLevelThread.class) 
	        { 
	        	   System.out.println(Thread.currentThread().getName()); 
	            System.out.println("in block " 
	                + Thread.currentThread().getName()); 
	            System.out.println("in block " 
	                + Thread.currentThread().getName() + " end"); 
	        } 
	    } 
	public static void main(String[] args) {
            
		ClassLevelThread g1 = new ClassLevelThread(); 
	        Thread t1 = new Thread(g1); 
	        Thread t2 = new Thread(g1); 
	        ClassLevelThread g2 = new ClassLevelThread(); 
	        Thread t3 = new Thread(g2); 
	        t1.setName("t1"); 
	        t2.setName("t2"); 
	        t3.setName("t3"); 
	        t1.start(); 
	        t2.start(); 
	        t3.start(); 

	}



}