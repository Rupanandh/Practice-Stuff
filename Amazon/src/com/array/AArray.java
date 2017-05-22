package com.array;

import java.util.TreeSet;

public class AArray {
	
	

	
	public int findKthLargest(int[] nums, int k) {
        TreeSet<Integer> data= new TreeSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            data.add(nums[i]);
        }
       Integer []numbrs =data.toArray(new Integer[0]);
        return nums[k-1];
    }
}
