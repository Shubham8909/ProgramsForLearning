package com.testing.program;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTesting {

	public static void main(String[] args) {
	
		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
	 
		
		ListIterator< Integer> lIt= al.listIterator();
		
            while(lIt.hasNext()){
            	int k= lIt.next();
            	System.out.println(k);
            }
            
            System.out.println(al);
	}
	


}
