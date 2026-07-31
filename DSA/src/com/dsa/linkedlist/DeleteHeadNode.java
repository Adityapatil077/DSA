package com.dsa.linkedlist;

public class DeleteHeadNode {
	
	public static Node deleteHead(Node head) {
		if(head == null) {
			return null;
		}
		Node next = head.next;
		head.next = null;
		return next;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
//		Node head = null;+
		
		head = deleteHead(head);
		
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

}
