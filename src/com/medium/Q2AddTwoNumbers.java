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
	/**
	 * 将两个链表l1 l2数字分别相加：
	 * 1.l1.length >l2.length 则 l2 不足位补0
	 * 2.若两个数字相加之和>0 则向后追加1
	 * 注:除基本数据类型外，数组,对象都是引用传递故:ListNode curr = head;
	 * curr和head 指向的是同一个地址，当curr发生改变时,head也会发生改变;
	 * String是不可变字符串，是特殊的对象，每次改变字符串的值，都会新建一个对象，
	 * 变量指向地址也会随之发生改变。
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		/**
		l1 = new ListNode(2);
		l2 = new ListNode(5);
		
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l6 = new ListNode(6);
		ListNode l44 = new ListNode(4);
		l1.next = l4;
		l1.next.next = l3;
		l2.next = l6;
		l2.next.next = l44;
		*/
		ListNode head = new ListNode(0);
		ListNode p = l1;
		ListNode q = l2;
		ListNode curr = head;
		int carry = 0;
		
		while(null != p || null != q) {
			int a = (p == null) ? 0 : p.val;
			int b = (q == null) ? 0 : q.val;
			int sum = a + b + carry;
			carry = sum/10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			
			if(null != p) { p = p.next;}
			if(null != q) { q = q.next;}
		}
		if(carry >0) {
			curr.next = new ListNode(carry);
		}
		nextNode(head.next,new StringBuilder(""));
		return head.next;
        
    }
	
	private void nextNode(ListNode node,StringBuilder m) {
		ListNode  tmpNode = new ListNode(0);
		tmpNode = node;
		while(null != tmpNode) {
			System.out.println(tmpNode.val);
			tmpNode = tmpNode.next;
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
