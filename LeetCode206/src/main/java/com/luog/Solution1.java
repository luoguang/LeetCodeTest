package com.luog;

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode p = null;
        ListNode p1 = head;
        ListNode p2;

        while (p1 != null) {
            //1. 对之前的链表做头删
            p2 = p1;
            p1 = p1.next;


            p2.next = p;
            p = p2;
        }

        return p;
    }
}
