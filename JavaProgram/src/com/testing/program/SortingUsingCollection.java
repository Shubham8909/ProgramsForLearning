package com.testing.program;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
	 ArrayList<String> a= new ArrayList<>();
	 
	 a.add("A");
	 a.add("a");
	 a.add("s");
	 a.add("A");
	 a.add("V");
	 
	 System.out.println(a);
	 Collections.sort(a,new  Mycomparator());
	 System.out.println(a);
	 

	}

}
