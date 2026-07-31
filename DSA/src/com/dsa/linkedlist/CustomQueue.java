package com.dsa.linkedlist;
class MyNode<E>{
	E data;
	MyNode<E> next;
	public MyNode(E data) {
		super();
		this.data = data;
	}
}
public class CustomQueue<E> {
	
	MyNode<E> head, tail = null;
	
	public void enqueue(E data) {
		MyNode<E> temp = new MyNode<>(data);
		
		if(head == null) {
			head = tail = temp;
			return;
		}
		
		tail.next = temp;
		tail = tail.next;
	}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		
		MyNode<E> temp = head;
		head = head.next;
		
		if (head == null) {
			tail = null;
		}
		
		return temp.data;
	}
	
	public E top() {
		if(head == null) {
			throw null;
		}
		
		return head.data;
	}
	
	public E bottom() {
		if(tail == null) {
			throw null;
		}
		
		return tail.data;
	}

	public static void main(String[] args) {
		CustomQueue<Integer> q = new CustomQueue<>();
		q.enqueue(12);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(5);
		
		System.out.println(q.top());
		System.out.println(q.bottom());
		System.out.println(q.dequeue());
		System.out.println(q.top());
		System.out.println(q.bottom());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		

	}

}
