package ds.circularlikedlist;

import ds.singlylikedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (first == null);
	}
	
	public void insertFirst(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;// new node -- > old first
		first = newNode;// first place
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			
			first = newNode;
		}
		else {
			
			last.next = newNode;//
			last = newNode;// make the new node be last one in the list
		}
		
		
	}
	
	public int deletefirst() {
		int temp = first.data;
		
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void displaylist() {
		System.out.println("List (first --> last)");
		Node current = first;
		while(current!=null) {
			current.displayNode();
			current = current.next;	
		}
		System.out.println();
	}
}
