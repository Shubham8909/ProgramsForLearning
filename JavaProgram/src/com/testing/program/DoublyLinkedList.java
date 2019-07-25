package com.testing.program;

public class DoublyLinkedList {
	
	Node head;
	   public DoublyLinkedList(){
		  head= new Node();
		  head.next= null;
		  head.prev= null;
		  head.value= 0;
	   }
	
	class Node{
		Node prev;
		Node next;
		int value;
	}
	
	public boolean InsertValue(int item){
		Node n= new Node();
		n.value=item;
	    n.next= null;
	    
	    Node nNode=head;
	    while(nNode.next!=null){
	    	nNode= nNode.next;
	    }
	    nNode.next=n;
	    n.prev=nNode;
	    nNode=n;
		return true;
	}
	
	public void printList(Node h){
	
		Node n= h;
		while(n!= null){
          System.out.println(n.value);
          n= n.next;
		}
		
	}
}
