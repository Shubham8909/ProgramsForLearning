package com.testing.program;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> aList= new ArrayList<>();
		aList.add(sc.nextInt());
		aList.add(sc.nextInt());
		aList.add(sc.nextInt());
		aList.add(sc.nextInt());
		aList.add(sc.nextInt());
		
		//Advance for loop
		for(Integer ints :aList){
			System.out.print(ints+" ");
		}
		
		System.out.println("");
		//for loop
		for(int i=0; i<aList.size(); i++){
			System.out.print(aList.get(i)+" ");
		}
		System.out.println("");
		int i=0;
		//while
		while(i<aList.size()){
			System.out.print(aList.get(i)+" ");
			i++;
		}
	}

}
