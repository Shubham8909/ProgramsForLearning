package com.testing.program;

public class Example1 {

	
/*	char c='U';
	
      
    // static block 
    static { 
        System.out.println("Inside static block"); 
    } 
  
    Example1(){
    	System.out.println("Constructor call"); 
    }
    {
    	System.out.println("Inside instance intialization  block"); 
    }
 // static variable 
    static int a = m1();
    // static method 
    static int m1() { 
        System.out.println("from m1"); 
        return 20; 
    } 
      */
    // static method(main !!) 
    public static void main(String[] args) 
    { 
    	
   	int [][] arr= new int[10][20];
   	String s="Shubham";
   	
   	System.out.println( Math.abs(-20));
   	
 
   System.out.println(arr.length);

    	Example1 e= new Example1();

       System.out.println("from main"+ Integer.MIN_VALUE+" --"+arr.length+"  --"+arr[0].length); 
    } 
}
