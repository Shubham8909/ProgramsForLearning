package com.testing.program1;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentTest {
	
	public static void main(String[] args) 
	{
	final ArrayList< Integer> aa= new ArrayList<>();
	

		
 ArrayList<Integer> a= new ArrayList<>();
         a.add(8);
         a.add(6);
         a.add(8);
         a.add(2);
         a.add(1);
         
		CopyOnWriteArrayList<Integer> c= new CopyOnWriteArrayList<>();
		
		c.addIfAbsent(1);
		
		c.addIfAbsent(2);
		
		c.addIfAbsent(2);
		
		c.addIfAbsent(1);
		
		a.addAll(c);
		
		c.addAllAbsent(a);
		
		
		Integer arr[]= {1,2,3,5,8,8,8};
		
		CopyOnWriteArrayList<Integer> c1= new CopyOnWriteArrayList<>(arr);
		
		System.out.println( a);
		System.out.println( c);
		
		
	}

}
