package com.testing.program;

import java.util.Scanner;

public class ProgramTest {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
		String i=s.concat("verma G");
		System.out.println(i);
		
		StringBuffer sf= new StringBuffer();
		sf.append(s);
		sf.append("Shubham Verma");
		sf= sf.reverse();
		System.out.print(sf);
		
	/*	char[] charArray= s.toCharArray();
		for(int i=charArray.length-1;  i>=0; i--){
			System.out.print(charArray[i]);
		}
		*/
	/*	for(int i=s.length()-1; i>=0; i--){
			
			System.out.print(s.charAt(i));
			
		}*/
	}

}
