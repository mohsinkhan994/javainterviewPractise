package com.coding.pratice;

public class RunnableThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("inside run method");
	}

	public static void main(String[] args) {
	
		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);
		t.start();
		

	}

}
