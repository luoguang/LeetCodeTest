package com.luog;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
    private ListNode listNode = null;

    @Before
    public void before() {
        listNode = new ListNode(1);
        ListNode node = listNode;
        ListNode tmp;

        tmp = new ListNode(2);
        node.next = tmp;
        node = node.next;

        tmp = new ListNode(3);
        node.next = tmp;
        node = node.next;

        tmp = new ListNode(4);
        node.next = tmp;
        node = node.next;

        tmp = new ListNode(5);
        node.next = tmp;
    }

    @Test
    public void testSolution1() {
        long start = System.currentTimeMillis();
        Solution1 solution = new Solution1();
        ListNode newNode = solution.reverseList(listNode);
        print(newNode);
        long end = System.currentTimeMillis();
    }

    /**
     * 更优，更易理解
     */
    @Test
    public void testSolution2() {
        long start = System.currentTimeMillis();
        Solution2 solution = new Solution2();
        ListNode newNode = solution.reverseList(listNode);
        print(newNode);
        long end = System.currentTimeMillis();
    }

    private void print(ListNode node) {
        if (node == null) {
            return;
        }

        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val).append(", ");
            node = node.next;
        }
        System.out.println(builder);
    }
}
