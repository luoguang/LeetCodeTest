package com.luog;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
    private ListNode listNode = null;

    private int x;

    @Before
    public void before() {
        x = 3;

        listNode = new ListNode(6);
        ListNode node = listNode;
        ListNode tmp;

        tmp = new ListNode(5);
        node.next = tmp;
        node = node.next;

        tmp = new ListNode(4);
        node.next = tmp;
        node = node.next;

        tmp = new ListNode(3);
        node.next = tmp;
        node = node.next;

        tmp = new ListNode(2);
        node.next = tmp;
        node = node.next;

        tmp = new ListNode(1);
        node.next = tmp;

        print(listNode);
    }

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();

        long start = System.currentTimeMillis();
        ListNode node = solution.partition(listNode, x);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        print(node);
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
