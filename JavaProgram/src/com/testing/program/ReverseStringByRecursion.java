package com.testing.program;

public class ReverseStringByRecursion {

	public static String reverseString(String myStr) {
		String reverse="";
		
		if(!myStr.isEmpty())
		{
		
		reverse= reverseString(myStr.substring(1)) + myStr.charAt(0);
		}
		 return reverse;
	}
	
	public static void main(String[] args) {
	String str= "Shubham";
     System.out.println(reverseString(str));
	}



}
