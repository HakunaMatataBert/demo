package com.ls.demo;

public class StringAnalyze {
	public static void main(String[] args) {
		int a[] = {1,2,8,4,10,3,55,6,99,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.err.print(a[i]+" ");
		}
		
	}
}
