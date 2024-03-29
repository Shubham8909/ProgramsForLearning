package com.testing.program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackImplementaionByQueue {
	
	//First Queue q1 and Second Queue q2
	Queue<Integer> q1;
	Queue<Integer> q2;
	
	//Constructor and instantiation the queue
	public StackImplementaionByQueue(){
		q1=new LinkedList<>();
		q2=new LinkedList<>();
	}
	
	public boolean push(int data){
		
		if(q1.size()==0){
			q1.add(data);
			return true;
		}else{
			int l= q1.size();
			for(int i=0; i<l; i++){
				q2.add(q1.remove());
			}
			q1.add(data);
			for(int i=0; i<l; i++){
				q1.add(q2.remove());
			}
			return true;
		}
	}
	
	public int pop(){
		if(q1.size()==0){
			throw new RuntimeException("Queue is empty");
		}
		return q1.remove();
	}
	
	public void display()
	{
		if(q1.size()==0){
			throw new RuntimeException("Queue is empty");
		}
		Iterator<Integer> it =q1.iterator();
		while(it.hasNext()){
			int i = it.next();
			System.out.println(i);
		}
	}
}
class TestingStack{
	
	public static void main(String[] args) {
		StackImplementaionByQueue s= new StackImplementaionByQueue();
		s.push(12);
		s.push(10);
		s.push(2);
		s.push(8);
		s.push(5);
		System.out.println("-----------");
		s.display();
		int N = 8<<20;
		System.out.println(N);
		s.pop();
		System.out.println("-----------");
		s.display();
	}
}
