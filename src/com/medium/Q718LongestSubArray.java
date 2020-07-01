package com.medium;
/**
 * medium718 最长重复子数组
 * @author cy
 *
 */
public class Q718LongestSubArray {

	public static void main(String[] args) {
		int[] A = {1,2,3,2,1},B = {3,2,1,4,7};
		System.out.println(findLength(A,B));

	}
	public static int findLength(int[] A, int[] B) {
		int max = 0;
		int m= A.length+1,n=B.length+1;
		int[][] array = new int[m][n] ;
		for(int i = 1;i < m;i++) {
			for(int j = 1;j < n;j++) {
				if(A[i-1] == B[j-1]) {
					array[i][j] = array[i-1][j-1]+1;
				}else {
					array[i][j] = 0;
				}
				max = Math.max(max, array[i][j]);
			}
		}
		return max;
    }

}
