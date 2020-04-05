package com.luog;

public class Solution2 {
    /**
     * 更优，更易理解
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pre = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            // 下一个元素
            next = curr.next;
            // 当前元素
            // 当前元素/next = 上一个元素
            curr.next = pre;

            // 移动指针，前一元素指针指向当前反转的链表
            pre = curr;
            curr = next;
        }

        return pre;
    }
}
