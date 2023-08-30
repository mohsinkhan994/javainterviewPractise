package com.coding.pratice;

import java.util.HashSet;

public class ArrayCombination {

	static void getArrayCombination(int arr1[], int arr2[]) {
		
		HashSet<Integer> combARR = new HashSet<Integer>();
		int l = arr1.length;
		int m = arr2.length;
		for(int i=0; i<l; i++) {
			combARR.add(arr1[i]);
		}
		for(int j=0; j<m; j++) {
		if(combARR.contains(arr2[j])) {
			
			combARR.remove(arr2[j]);
			
		}else {
			combARR.add(arr2[j]);
			}
		}
		
		System.out.println(combARR);
		
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6,7};
		
		getArrayCombination(a,b);
		
	}

}
