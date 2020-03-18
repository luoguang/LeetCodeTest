import org.junit.Test;

import java.util.*;

public class UnitTest {
    private char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};

    private int n = 2;

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();
        int i = solution.leastInterval(tasks, n);

        print(i);
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();
        int i = solution.leastInterval(tasks, n);

        print(i);
    }

    @Test
    public void testPriorityQueue() {
        // Collections.reverseOrder() 在方法调用返回一个比较器，它强行上实现Comparable接口的对象的集合的自然顺序相反。
        // 默认排序相反，默认排序按照数字增序进行
        PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(5);
        System.out.println(queue.peek());// 6

        // 默认排序，默认排序按照数字增序进行
        queue = new PriorityQueue<>(10);
        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(5);
        System.out.println(queue.peek());// 1

        //优先级队列存放字符
        String fact = "UDJKKDJL WSAPLMAD IUJSAA ATHSHJ";
        List<String> list = Arrays.asList(fact.split(""));
        PriorityQueue<String> priorityQueueStrings = new PriorityQueue<String>(list);
        PrintPr(priorityQueueStrings);

        priorityQueueStrings = new PriorityQueue<String>(list.size(), Collections.reverseOrder());
        priorityQueueStrings.addAll(list);
        PrintPr(priorityQueueStrings);
    }

    private void print(int i) {
        System.out.println(i);
    }


    public void PrintPr(Queue<?> queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

}
