package com.luog;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
    private ListNode l1;

    private ListNode l2;

    @Before
    public void before() {
        ListNode l = null;
        ListNode tmp = null;

        l1 = new ListNode(2);
        l = l1;
        tmp = new ListNode(4);
        l.next = tmp;
        l = l.next;
        tmp = new ListNode(3);
        l.next = tmp;
        l = l.next;

        l2 = new ListNode(5);
        l = l2;
        tmp = new ListNode(6);
        l.next = tmp;
        l = l.next;
        tmp = new ListNode(4);
        l.next = tmp;
        l = l.next;
    }

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        ListNode l = result;
        StringBuffer buffer = new StringBuffer();
        while (l != null) {
            buffer.append(l.val).append("  ");
            l = l.next;
        }
        System.out.println(buffer.toString());
    }
}
