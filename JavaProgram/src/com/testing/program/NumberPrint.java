package com.testing.program;

public class NumberPrint {
	
	public static void main(String[] args) {
		
	
	
	PrintNumber p= new PrintNumber();

	Thread t1=new Thread(new Runnable() {
		@Override
		public void run() {
			p.m1();
		}
	});
	Thread t2=new Thread(new Runnable() {
		@Override
		public void run() {
			p.m1();
		}
	});
	Thread t3=new Thread(new Runnable() {
		@Override
		public void run() {
			p.m1();
		}
	});
	t1.start();
	t2.start();
	t3.start();
	}
	
}
