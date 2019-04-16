package com.medium;

import java.util.HashMap;
import java.util.Map;

public class Q3LongestSubstring {
	
	public int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
        	/**
        	 * 获取首次出现的位置
        	 */                          
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            //计算j - i的范围取最大值
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
