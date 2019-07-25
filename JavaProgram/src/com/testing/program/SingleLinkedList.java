package com.testing.program;

public class SingleLinkedList {

	Node head;
	int count;

	public SingleLinkedList() {
		head = new Node();
		head.value = 0;
		head.next = null;
		count = 0;
	}

	class Node {
		int value;
		Node next;
/*		public Node (int value){
			this.next=next;
			this.value=value;
		}*/
	}

	public boolean insertData(int item) {
		Node n = new Node();
		n.next = null;
		n.value = item;
		Node nhead;
		nhead = head;
		while (nhead.next != null) {
			nhead = nhead.next;
		}
		nhead.next = n;
		count++;
		return true;
	}

	public void printList(Node h) {

		Node n = h;
		while (n != null) {
			if (n.value != 0) {
				System.out.println(n.value);
			}
			n = n.next;
		}
	}

	public int Totaldata() {
		return count;
	}

	public int middleNumber() {
		int m = 0;
		Node n = head.next;
		int middle = 0;
		if (count % 2 == 0) {
			System.out.println("in");
			middle = count / 2;
		} else {
			System.out.println("in1");
			middle = (count / 2) + 1;
		}
		System.out.println(middle);
		int NewCount = 1;
		while (n != null) {
			if (NewCount == middle) {
				m = n.value;
			}
			NewCount++;
			n = n.next;
		}

		return m;
	}

	public Node reverse(Node head2) {
		Node current = head2;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public Node sorting(Node h) {
		Node a = h.next;
		while (a != null) {
			Node b = a.next;
			while (b != null) {
				if (a.value > b.value) {
					int temp = a.value;
					a.value = b.value;
					b.value = temp;
				}
				b = b.next;
			}
			a = a.next;
		}
		return h;
	}

	public Node deleteNode(Node h, int num) {
		Node n = h;
		if (num <= 0 || num > count) {
			throw new NewException("please check the postion of node which you want to remove.");
		}
		int nCount = 1;
		while (n != null) {
			if (nCount == num) {
				n.next = n.next.next;
			}
			nCount++;
			n = n.next;
		}
		return h;
	}
	
	public Node deleteNodeValue(Node h, int item) {
		Node n = h;
		Node y= n.next;
		while (y != null) {
			if (y.value == item) {
				n.next= y.next;
			}
			n = n.next;
			y=y.next;
		}
		return h;
	}

}
