package com.testing.program;

public class StringPerformance  {

	public static void main(String[] args) {
		
		String s= new String("Shubham");
		
		String S1= s;
		 S1= S1.concat("verma");
		

		int a = 5;
		Integer b = new Integer(5);
		int c = 5;
  System.out.println(S1+"  "+s);		System.out.println(s == S1); // false
		System.out.println(s.equals(S1)); // true

				
					
	}

}
