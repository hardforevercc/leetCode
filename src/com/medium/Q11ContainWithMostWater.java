package com.medium;

public class Q11ContainWithMostWater {
	public static void main(String[] args) {
		int[] container = {1,8,6,2,5,4,8,3,7}; 
		System.out.println(maxArea(container));
	}
	
	public static int maxArea(int[] height) {
	   int maxArea = 0;
       int len = height.length;
       int left = 0,right = len-1;
       while(left<right) {
    	   maxArea = Math.max(Math.min(height[left], height[right]) * (right-left) , maxArea);
    	   if(height[left] > height[right]) {
    		   right--;
    	   }else {
    		   left++;
    	   }
       }
    	   
		return maxArea;
    }
}
