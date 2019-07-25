package com.testing.program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();;
		System.out.println(Integer.parseInt(str));
		String result="";
		
		for(int i=str.length()-1; i>=0; i--){
			result=result+str.charAt(i);
		}

      if(str.equals(result)){
    	  
    	  System.out.println("its a Palindrome");
      }else 	  System.out.println("its not a Palindrome");
    	  
      sc.close();
	}

}
