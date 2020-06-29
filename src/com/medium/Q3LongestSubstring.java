package com.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q3LongestSubstring {
	
	public int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
     
        for (int j = 0, i = 0; j < n; j++) {
        	//计算出现的位置                        
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            //计算j - i的范围取最大值
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
	
	
	public static int longestSubStringBySet(String s) {
		int n = s.length();
		int maxLength = 0,i=0,j=0;
		Character c = null;
		HashSet<Character> set = new HashSet<Character>();
		while(j<n) {
			c = s.charAt(j);
			if(!set.contains(c)) {
				set.add(c);
				maxLength = Math.max(maxLength, j-i+1);
				j++;
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return maxLength;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
