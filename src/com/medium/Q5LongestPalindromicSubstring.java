package com.medium;

public class Q5LongestPalindromicSubstring {
	private int l0,maxLen;
	public String longestPalindrome(String s) {
		if(s.length() < 2) {
			return s;
		}
		for(int i = 0;i<s.length();i++) {
			isPalindromic( s, i, i);
			isPalindromic( s, i+1, i);
		}
		return s.substring(l0,l0+ maxLen);
	}
	
	private void isPalindromic(String s,int i, int j) {
		int l = i,r = j;
		while(l >= 0&j < s.length()&&s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		if(maxLen < j-i+1) {
			l0 = i+1;
			maxLen = j - i + 1;
		}
	}
}
