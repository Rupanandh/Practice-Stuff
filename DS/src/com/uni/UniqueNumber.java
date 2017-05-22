package com.uni;

public class UniqueNumber {

	public static void main(String args[]) {
		int[] arr = {  2, 3, 4, 5,6, 5, 4, 3, 2, 1 };
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = num^arr[i];
			System.out.println(num);
			
		}
		
		System.out.println("unique number:"+num);
	}
}
