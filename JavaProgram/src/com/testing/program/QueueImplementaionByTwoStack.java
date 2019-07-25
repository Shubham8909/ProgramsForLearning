package com.testing.program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImplementaionByTwoStack {
	
	     Stack<Integer> s1;
	      Stack<Integer> s2;
	
	      public QueueImplementaionByTwoStack(){
	    	  s1= new Stack<Integer>();
	    	  s2= new Stack<Integer>();  
	      }
	      
	      public boolean enQueue(int data){
	    	  if(s1.size()==0){
	    		  s1.add(data);
	    		  return true;
	    	  }else{
	    		  int l= s1.size();
	    		  for(int i= 0; i<l; i++){
	    			  s2.add(s1.pop());
	    		  }
	    		  s1.add(data);
	    		  for(int i= 0; i<l; i++){
	    			  s1.add(s2.pop());
	    		  }
	    		  

		    	  return true;
	    	  }
	    	  
	      }
	
	      public int dequeue(){
	    	  if(s1.size()==0){
	    		  return 0;
	    	  }else{
	    		  return s1.pop();
	    	  }
	    	  
	      }
	
	  	public void display()
		{
			if(s1.size()==0){
				throw new RuntimeException("Queue is empty");
			}
			Iterator<Integer> it =s1.iterator();
			while(it.hasNext()){
				int i = it.next();
				System.out.println(i);
			}
		}
	
	public static void main(String[] args) {
		 
		///Queue<Integer> s1= new LinkedList<>();
		QueueImplementaionByTwoStack s= new QueueImplementaionByTwoStack();
		s.enQueue(1);
		s.enQueue(2);
		s.enQueue(3);
		s.enQueue(4);
		s.enQueue(5);
	
		
		s.display();
		System.out.println(s.dequeue());
		s.display();

	}

}
