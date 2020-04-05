package com.luog;

public class Solution1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode node = new ListNode(0);
        node.next = head;

        // 指向分组起点元素 (已处理终点元素)
        ListNode preNode = node;
        // 分组终点元素 （待处理终点元素）
        ListNode endNode = preNode;

        while (preNode.next != null) {
            for (int i = 0; i < k; i++) {
                endNode = endNode.next;
                if (endNode == null) {
                    break;
                }
            }

            if (endNode == null) {
                break;
            }

            // 分组起点元素 （待处理起点元素）
            ListNode node1 = preNode.next;
            // 分组终点元素的下一个元素 （未处理起点元素）
            ListNode node2 = endNode.next;

            preNode.next = reverse(node1, node2);
            // 将反向后的最后一个元素（待处理起点元素） 指向 未处理起点元素
            node1.next = node2;

            // 指向待处理的元素
            preNode = node1;
            endNode = preNode;
        }

        return node.next;
    }

    private ListNode reverse(ListNode startNode, ListNode endNode) {
        ListNode preNode = null;
        ListNode currNode = startNode;
        ListNode nextNode;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = preNode;
            // 指向当前已处理的元素
            preNode = currNode;
            currNode = nextNode;

            if (currNode == endNode) {
                break;
            }
        }
        return preNode;
    }
}
