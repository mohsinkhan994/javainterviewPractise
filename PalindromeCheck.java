package com.coding.pratice;

public class PalindromeCheck {
	
	public boolean checkPalindrome(String s) {
		int length = s.length();
		boolean result = true;
		for(int i = 0; i<=length/2; i++) {
			
			if(s.charAt(i)!= s.charAt(length-i-1)) {
				
				result = false;
				break;
			}
		}				
		return result;
	}

	public static void main(String[] args) {
		
		String str = "Delhi";
		String str1 = "NitiN";
		PalindromeCheck pc = new PalindromeCheck();
		boolean check = pc.checkPalindrome(str1);
		
		if(check) {
			System.out.println("is palindrome");
		} else {
			System.out.println("not palindrome");
		}
		
	}

}
