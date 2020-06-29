package com.easy;

import com.alibaba.fastjson.JSONObject;

public class Q26RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		int[] a = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(a));
	}
	
	public static int removeDuplicates(int[] nums) {
        int num = nums[0];
        int i = 1;      
        for(int n : nums) {       	
        	if(n > nums[i-1]) {
        		nums[i++] = n;      		
        	}      	
        }
        return i;
    }
}
