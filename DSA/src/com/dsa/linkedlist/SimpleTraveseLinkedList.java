package com.dsa.linkedlist;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class SimpleTraveseLinkedList {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node next = head;
		while(next != null) {
			System.out.println(next.data);
			next = next.next;
		}

	}

}
