package com.testing.program;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int a,b =0; int c=1;
	for(int i=0; i<num; i++){
	     a=b;
	     b=c;
	     c=a+b;
	     System.out.print(a+" ");
	}
		
	}

}
