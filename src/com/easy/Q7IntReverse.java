package com.easy;

public class Q7IntReverse {
	
	public int reverse(int x) {
		 if(x > Math.pow(2, 31)-1 || x < Math.pow(-2, 31)){
			 System.out.println(x+"0");
			 return 0;
		 }
		 
		 String rx = "";
		 boolean flag  = (x > 0? true:false);
		 if(x <0 ){
			 x= (x ==(int)Math.abs(x))? 0:(int)Math.abs(x);
			 
		 }
		 if(x < 10) return x;
		 System.out.println(x);
		 while(x!=0){
			rx += x%10; 
			x = x/10;
			System.out.println(rx+","+x);
		 }
		 try{
			 x = flag ?Integer.parseInt(rx):-Integer.parseInt(rx);
		 }catch(Exception e){
			 e.printStackTrace();
			 return 0;
		 }
		 
		return x;
        
    }

}
