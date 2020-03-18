import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 优先队列
 */
public class Solution2 {
    public int leastInterval(char[] tasks, int n) {
        int result = 0;
        if (n > 100 || n < 0 || tasks == null || tasks.length < 1 || tasks.length > 10000) {
            return result;
        }

        int[] taskCounts = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            taskCounts[tasks[i] - 'A']++;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
        for (int taskCount : taskCounts) {
            if (taskCount > 0) {
                queue.add(taskCount);
            }
        }

        while (!queue.isEmpty()) {
            int i = 0;
            // 一轮循环中队列中的每个值只执行一次
            // 保存当前循环中的队列的值
            // 用于队列下一次处理
            List<Integer> list = new ArrayList<>();
            // n+1个任务
            while (i <= n) {
                if (!queue.isEmpty()) {
                    // 只有一个时不在放入队列处理，只将他移除队列
                    if (queue.peek() > 1) {
                        list.add(queue.poll() - 1);
                    } else {
                        queue.poll();
                    }
                }

                i++;
                result++;

                // 队列为空 AND 不需要下一次处理
                if (queue.isEmpty() && list.isEmpty()) {
                    break;
                }
            }

            // 恢复队列
            for (Integer integer : list) {
                queue.add(integer);
            }
        }

        return result;
    }
}
