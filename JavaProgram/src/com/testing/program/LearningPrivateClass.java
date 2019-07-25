package com.testing.program;

public  class LearningPrivateClass {
	
	 static int i=10;
	
	 class B{
		
		int j=20;
		public void m1(){
			
			System.out.println(i);
		}
	}

}

class Ptest{
	public static void main(String[] args) {
		
		LearningPrivateClass l= new LearningPrivateClass();
	///	System.out.println(l.i);
	///for static	////LearningPrivateClass.B b= new LearningPrivateClass.B();
		LearningPrivateClass.B b= l.new B();
		
	    System.out.println("afvdasfsh"+b.j);
	    b.m1();
	}
	
}