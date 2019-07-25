package com.testing.program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountWord {
	
	
	public static void main(String[] args) {
		
	Map<String, Integer> hmap= new HashMap<>();
	Scanner sc = new Scanner(System.in);
	String str= sc.nextLine();
	
	String[] charArray=  str.split("");
	
	for(int i=charArray.length-1; i>=0; i--){
		
		if(hmap.containsKey(charArray[i])){
		  int count=hmap.get(charArray[i]);
		  hmap.put(charArray[i], count+1);
		}else {
			hmap.put(charArray[i], 1);
		}
	}
	sc.close();
	 
	Iterator< Map.Entry<String, Integer>> it= (Iterator<Entry<String, Integer>>) hmap.entrySet().iterator();
	
	while(it.hasNext()){
		Map.Entry<String, Integer> emap=it.next();
	System.out.println(	emap.hashCode());
		System.out.println(emap.getKey()+"  "+emap.getValue());
	}
	/*for( Map.Entry<Character, Integer> map: hmap.entrySet()){
		
		System.out.println(map.getKey()+"  "+map.getValue());
		
	 }*/
	}
}
