package com.testing.program;

public class DoubleLinkTest {

	public static void main(String[] args) 
	{
		DoublyLinkedList d= new DoublyLinkedList();
		d.InsertValue(5);
		d.InsertValue(8);
		d.InsertValue(10);
		
		d.printList(d.head);
	}

}
