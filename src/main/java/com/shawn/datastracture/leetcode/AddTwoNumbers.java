package com.shawn.datastracture.leetcode;

/**
 *   Definition for singly-linked list.
 *   public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) { val = x; }
 *   }
 * @Description 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @Author shawn
 * @create 2019/3/6 0006
 */
public class AddTwoNumbers {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l1node1 = new ListNode(2);
        l1.next = l1node1;
        ListNode l1node2 = new ListNode(3);
        l1node1.next = l1node2;
        System.out.println(l1);
        ListNode l2 = new ListNode(1);
        ListNode l2node1 = new ListNode(2);
        l2.next = l2node1;
        ListNode l2node2 = new ListNode(3);
        l2node1.next = l2node2;
        System.out.println(l2);
        ListNode listNode = addTwoNumbers(l1,l2);
        System.out.println(listNode);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode  curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;   //截取
            curr.next = new ListNode(sum % 10); //余数作为下一个节点的值
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
