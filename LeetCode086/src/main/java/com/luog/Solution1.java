package com.luog;

public class Solution1 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }


        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode node0 = newHead;
        ListNode node1 = head;
        ListNode p0 = null;
        ListNode p1 = null;

        while (node1 != null) {
            if (p1 == null && node1.val >= x) {
                p1 = node1;
                p0 = node0;
            }

            ListNode next = node1.next;
            ListNode curr = node1;
            if (node1.val < x && p1 != null) {
                node0.next = node1.next;
                p0.next = node1;
                node1.next = p1;
                p0 = node1;

                curr = node0;
            }

            node0 = curr;
            node1 = next;
            node0.next = node1;
        }

        return newHead.next;
    }
}
