package com.medium;
/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero,
 *  except the number 0 itself.
 *  Example:
 *  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  Output: 7 -> 0 -> 8
 *  Explanation: 342 + 465 = 807.
 * @author cayao
 *
 */
public class Q2AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		l1 = new ListNode(2);
		l2 = new ListNode(5);
		
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l6 = new ListNode(6);
		ListNode l44 = new ListNode(4);
		
		
		l4.next = l3;
		l1.next = l4;
		
		l6.next = l4;
		l2.next = l6;
		
		
		StringBuilder a = new StringBuilder("");
		StringBuilder b = new StringBuilder("");
		a.append(l1.val);
		b.append(l2.val);
		System.out.println(a+","+b);
		nextNode(l1.next,a);
		nextNode(l2.next,b);
		
		return l2;
        
    }
	
	private void nextNode(ListNode node,StringBuilder m) {
		if(null != node.next) {
			m.append(node.next.val);
			nextNode(node.next,m);
			System.out.println(m);
		}
	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}
		
		
	}
}
