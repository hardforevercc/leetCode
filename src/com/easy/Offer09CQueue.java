package com.easy;

import java.util.LinkedList;

public class Offer09CQueue {

	public static void main(String[] args) {
		

	}
	
	public class CQueue {
		LinkedList<Integer> stack1,stack2;
		public CQueue() {
			stack1 = new LinkedList<Integer>();
			stack2 = new LinkedList<Integer>();
		}
		
		
		public void appendTail(int value) {
			stack1.addLast(value);
	    }
	    
	    public int deleteHead() {
	    	if(stack1.isEmpty()) return -1;
	    	
	    	if(!stack2.isEmpty()) return stack2.removeLast();
	    	
	    	while(!stack1.isEmpty()) {
	    		stack2.addLast(stack1.remove());
	    	}
	    	return stack2.removeLast();

	    }
		
    }
    
    

}
