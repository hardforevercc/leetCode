package com.easy;

public class Q9IsPalindromeInt {

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));

	}
	public static boolean isPalindrome(int x) {
		if(x < 0){
            return false;
        }
		if(String.valueOf(x).length() == 0){
			return true;
		}
		String sr = "";
		int tmp = x;
		while(tmp!=0){
			sr += tmp%10;
			tmp = tmp/10;
		}
		int m = 0;
		try{
            m = Integer.parseInt(sr);
        }catch(Exception e){
            return false;
        }
		return m == x?true:false;
		
		
        
        
    }
}
