package com.coding.pratice;


public class LinkListSearch {
	
	Node head;

	public void push(int new_data) {
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}

	public boolean search(int x) {
		
		Node current = head;
		while(current!=null) {
			if(current.data == x) {
				current =current.next;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
	
		LinkListSearch ll = new LinkListSearch();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		
		if(ll.search(4)) {
			System.out.println("found");
			
		}else {
			System.out.println("not found");
		}
		
		

	}

}
