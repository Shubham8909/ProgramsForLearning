package com.testing.program;

public class ReverseStringWord {

	public static void main(String[] args) {
		String s1="";
		 String s= "Hello Shubham What are You Doing";
		 System.out.println(s);
		 String [] str=s.split(" ");
		 
		 for(int i=str.length-1; i>=0; i--){
			 System.out.println(str[i]);
			 StringBuilder sb=new StringBuilder(str[i]);
			 sb.reverse();
			 s1=s1+sb+ " ";
		 }
		 
		 System.out.println(s1); ///output -gnioD uoY era tahW mahbuhS olleH 

	}

}
