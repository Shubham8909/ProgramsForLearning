package com.testing.program1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestingClass {

	public static void main(String[] args) {
		
		
		

		
		ArrayList<Integer> l= new ArrayList<>();
		l.add(2);
		l.add(3);
		l.add(4);
	
		Iterator<Integer> it = l.iterator();
		
		while(it.hasNext()){
			int i= it.next();
			System.out.println(i);
			if(l.get(0)==2){
				it.remove();
			}
		}
		
		System.out.println(l);
	}

}
