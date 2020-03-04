public class Test {
    public static void main(String[] args) {
        ListNode l = null;
        ListNode tmp = null;

        ListNode l1 = new ListNode(2);
        l = l1;
        tmp = new ListNode(4);
        l.next = tmp;
        l = l.next;
        tmp = new ListNode(3);
        l.next = tmp;
        l = l.next;

        ListNode l2 = new ListNode(5);
        l = l2;
        tmp = new ListNode(6);
        l.next = tmp;
        l = l.next;
        tmp = new ListNode(4);
        l.next = tmp;
        l = l.next;

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        l = result;
        StringBuffer buffer = new StringBuffer();
        while (l != null) {
            buffer.append(l.val).append("  ");
            l = l.next;
        }
        System.out.println(buffer.toString());
    }
}
