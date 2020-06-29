package com.medium;
/**
 * 215. 数组中的第K个最大元素
 * @author cy
 *
 */
public class Q215FindKthLargest {
	/**
	 * 先排序 再根据索引找出第K个数字
	 * @param nums
	 * @param k
	 * @return
	 */
	public static int findKthLargest(int[] nums, int k) {
		for(int i =0;i < nums.length-1;i++) {
			for(int j=i+1;j < nums.length;j++) {
				if(nums[i] < nums[j]) {
					int m = nums[j];
					nums[j] = nums[i];
					nums[i] = m;
				}
			}
		}
		System.out.println(nums[k-1]);
		return nums[k-1];
    }

	public static void main(String[] args) {
		int[] nums1 = {3,2,1,5,6,4};
		findKthLargest(nums1,2);
		int[] nums2 = {3,2,3,1,2,4,5,5,6};
		findKthLargest(nums2,4);

	}

}
