package com.testing.program;

public class LinkedListTest {

	public static void main(String[] args) {
		
		SingleLinkedList s= new SingleLinkedList();

		System.out.println(s.insertData(30));
		s.insertData(20);
		s.insertData(2);
		s.insertData(5);
		s.insertData(6);
		s.insertData(7);
		
		
		
		s.printList(s.head);
       /// s.head=s.sorting(s.head);
		
		//s.head=s.deleteNode(s.head,0);
		s.head=s.deleteNodeValue(s.head,0);
        System.out.println("-----Print----");
        
    	s.printList(s.head);
/*		System.out.println("-----Print----");
		
		s.printList(s.head);
		
		System.out.println("-----reverse----");
		s.head=s.reverse(s.head);
		System.out.println("-----Print R----");
		s.printList(s.head);
		
		
		//System.out.println(s.Totaldata());
		System.out.println("-----middle number----");
		System.out.println(s.middleNumber());*/
		

	}

}
