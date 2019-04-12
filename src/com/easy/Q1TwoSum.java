package com.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * description：
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author caiyao
 *
 */
public class Q1TwoSum {
	
	/**
	 * 解法1:暴力解法，双重for循环
	 * 时间复杂度:O(n^2) 空间复杂度：O(1)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumByLoop(int[] nums, int target) {
        int num = 0;
        for(int i = 0;i < nums.length;i++) {
            num = target - nums[i];
			for(int j = i+1;j < nums.length;j++) {
				if(nums[j] == num) {
					return new int[]{i , j};
				}
			}
		}
		return null;   
    }
	/**
	 * 时间复杂度:O(n) 空间复杂度：O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumByMap(int[] nums, int target) {
        Map<Integer,Integer> intMap = new HashMap<Integer,Integer>();
		for(int i = 0;i < nums.length;i++) {
			intMap.put(nums[i], i);
		}
		int m = 0;
		for(int i = 0;i<nums.length;i++) {
			m = target - nums[i];
			if(intMap.containsKey(m) && i != intMap.get(m)) {
				System.out.printf("%d,%d",i,intMap.get(m));
				return new int[]{i,intMap.get(m)};
			}
		}
		return null;   
    }
	/**
	 * 每次将数组的数放入map前 检查map中是否存在target - num[i]的值
	 * 时间复杂度:O(n) 空间复杂度：O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumByOneMap(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int m = 0;
		for(int i = 0;i < nums.length;i++) {
			m = target - nums[i];
			if(map.containsKey(m)) {
				return new int[] {map.get(m),i};
			}
			map.put(nums[i], i);
		}
		return null;
		
	}
	
	
}
