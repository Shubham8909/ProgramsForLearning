package com.testing.program1;

public class ThreadTestClass {
	
	public static void main(String[] args) {
		
		MyThread m=new MyThread();
		Thread t= new Thread(m);
		t.start();
			
			for(int i=0; i<10;i++){
				System.out.println("Main Thread--"+i);
			}
		
			}

}
