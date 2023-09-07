package com.coding.pratice;

class Node {
	
	int data;
	
	Node next;

	Node(int d) {
		
		data = d;
		
		next = null;
	}
}

public class LinkedListPractice {

	Node head;

	public void push(int new_data) {
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}

	public int getCount() {
		
		int count = 0;

		Node temp = head;
		
		while (temp != null) {

			count++;
			temp = temp.next;
		}

		return count;
	}

	public static void main(String[] args) {
		
		LinkedListPractice ll = new LinkedListPractice();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);

		System.out.println(ll.getCount() + ":count");

	}

}
