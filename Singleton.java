package com.coding.pratice;

public class Singleton {
	
	String s;
	private static Singleton singleton_instance = null;
	
	private Singleton() {
		s= "hi i am in singleton constructor";
		
	}
	public static Singleton getInstance() {
		if(singleton_instance == null) 
			singleton_instance  = new Singleton();
		
			return singleton_instance;
		
		
	}
	
}

class Runner{
	public static void main(String [] args) {
		
		Singleton x = Singleton.getInstance();
		System.out.println(x.hashCode() + "x");
		
		Singleton y = Singleton.getInstance();
		System.out.println(y.hashCode() + "y");
		
		
		
		
	}

}
