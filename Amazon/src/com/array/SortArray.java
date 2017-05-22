package com.array;

public class SortArray {

	public static void main(String[] args) {
		int nums[] = { 3, 4, 5, 6, 1, 2 };
		sortdata(nums);
	}

	static int[] sortdata(int[] nums) {
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {

				if (nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		for(int num:nums)
		{
			System.out.println(num);
		}

		return nums;
	}
}
