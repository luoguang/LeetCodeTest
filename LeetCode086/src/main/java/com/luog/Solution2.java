package com.luog;

public class Solution2 {
    /**
     * 双链表，拼接
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;


        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }

            head = head.next;
        }
        // 末节点置空，关闭与其他节点间的指针
        after.next = null;
        before.next = after_head.next;

        return before_head.next;
    }
}
