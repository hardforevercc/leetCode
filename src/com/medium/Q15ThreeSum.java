package com.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Q15ThreeSum {

	public static void main(String[] args) {
		int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
		//{-1,-1,0,1,2,4}
		//int[] nums = new int[] {};
		Q15ThreeSum sum = new Q15ThreeSum();
		//sum.threeSum(nums);
		System.out.println(JSONObject.toJSONString(sum.threeSum(nums)));
	
	}
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		int len = nums.length;
		if(len <3) {
			return new ArrayList<>();
		}
		Arrays.sort(nums);
		for(int i = 0;i < len;i++) {
			if(i >0 && nums[i] == nums[i-1]) {
				continue;
			}
			int j = i+1,k = len -1;
			int target = - nums[i];
			while(j < k){
				if(nums[j]+nums[k] == target) {
					list.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
					while(j<k&&nums[j] == nums[j-1]) j++;
					while(j<k&&nums[k] == nums[k+1]) k--;
				}else if(nums[j]+nums[k] > target) {
					k--;
				}else {
					j++;
				}
			}
		}
		return list;
        
    }
}
