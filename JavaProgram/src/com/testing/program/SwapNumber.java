package com.testing.program;

import java.util.Scanner;

public class SwapNumber {

	
	//// Swap the value by using third variable
	public static void swap(int x, int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("After--" + x + "  " + y);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Befour--" + x + "  " + y);
		//swap(x, y);
	     x=x+y;
	     y=x-y;
	     x=x-y;
		System.out.println("Befour--" + x + "  " + y);
		
		sc.close();

	}

}
