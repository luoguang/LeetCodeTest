import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 优先队列
 * <p>
 * 思路
 * 完成所有任务的最短时间取决于出现次数最多的任务数量。
 * <p>
 * 看下题目给出的例子
 * <p>
 * 输入: tasks = ["A","A","A","B","B","B"], n = 2
 * 输出: 8
 * 执行顺序: A -> B -> (待命) -> A -> B -> (待命) -> A -> B.
 * 因为相同任务必须要有时间片为 n 的间隔，所以我们先把出现次数最多的任务 A 安排上（当然你也可以选择任务 B）。例子中 n = 2，那么任意两个任务 A 之间都必须间隔 2 个单位的时间：
 * <p>
 * A -> (单位时间) -> (单位时间) -> A -> (单位时间) -> (单位时间) -> A
 * 中间间隔的单位时间可以用来安排别的任务，也可以处于“待命”状态。当然，为了使总任务时间最短，我们要尽可能地把单位时间分配给其他任务。现在把任务 B 安排上：
 * <p>
 * A -> B -> (单位时间) -> A -> B -> (单位时间) -> A -> B
 * 很容易观察到，前面两个 A 任务一定会固定跟着 2 个单位时间的间隔。最后一个 A 之后是否还有任务跟随取决于是否存在与任务 A 出现次数相同的任务。
 * <p>
 * 该例子的计算过程为：
 * <p>
 * (任务 A 出现的次数 - 1) * (n + 1) + (出现次数为 3 的任务个数)，即：
 * <p>
 * (3 - 1) * (2 + 1) + 2 = 8
 * 所以整体的解题步骤如下：
 * <p>
 * 计算每个任务出现的次数
 * 找出出现次数最多的任务，假设出现次数为 x
 * 计算至少需要的时间 (x - 1) * (n + 1)，记为 min_time
 * 计算出现次数为 x 的任务总数 count，计算最终结果为 min_time + count
 * 特殊情况
 * 然而存在一种特殊情况，例如：
 * <p>
 * 输入: tasks = ["A","A","A","B","B","B","C","C","D","D"], n = 2
 * 输出: 10
 * 执行顺序: A -> B -> C -> A -> B -> D -> A -> B -> C -> D
 * 此时如果按照上述方法计算将得到结果为 8，比数组总长度 10 要小，应返回数组长度。
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
