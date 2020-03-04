package com.luog;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 解题时有阅读过题解，阅读完后按照自记得理解答的题
        // 用作head节点
        ListNode l = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode tmp = l;
        int carry = 0;
        while (p != null || q != null) {
            int a = p == null ? 0 : p.val;
            int b = q == null ? 0 : q.val;
            int sum = a + b + carry;
            carry = sum / 10;
            ListNode nextTmp = new ListNode(sum % 10);
            tmp.next = nextTmp;
            tmp = nextTmp;

            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            ListNode nextTmp = new ListNode(carry);
            tmp.next = nextTmp;
        }
        // 返回head指向的节点
        return l.next;
    }

}
