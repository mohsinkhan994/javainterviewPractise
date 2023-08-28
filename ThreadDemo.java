package com.coding.pratice;

public class ThreadDemo extends Thread{
	
	
	public void run() {
		System.out.println("inside thread");
	}
	

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();

	}

}
