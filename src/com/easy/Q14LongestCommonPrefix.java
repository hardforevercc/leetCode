package com.easy;

public class Q14LongestCommonPrefix {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abde";
		System.out.println(b.indexOf(a));

	}
	
	public String longestCommonPrefix(String[] strs) {
		if(null == strs || strs.length <1) {
			return "";
		}
		String preStr = strs[0];
		if(preStr.isEmpty()) return "";
		for(int i = 1;i<strs.length;i++) {
			while(preStr.indexOf(strs[i])!=0) {
				preStr = preStr.substring(0,preStr.length()-1);
			}
			
		}
        return preStr;
    }

}
