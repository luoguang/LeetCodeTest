import java.util.Arrays;

/**
 * 数列排序
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
public class Solution1 {
    public int leastInterval(char[] tasks, int n) {
        int result = 0;
        if (n > 100 || n < 0 || tasks == null || tasks.length < 1 || tasks.length > 10000) {
            return result;
        }

        int[] taskCounts = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            taskCounts[tasks[i] - 'A']++;
        }

        // 升序
        Arrays.sort(taskCounts);

        while (taskCounts[25] > 0) {
            int i = 0;
            // n+1个任务
            while (i <= n) {
                // 当taskCounts[25] == 0 但是任务并没有调度完成时，跳出当前循环，重新排序，
                // 排序后后面的非零值会占据taskCounts[25]的位置
                // 直到所有值都为0
                // 注：taskCounts[25] == 0后重新排序的写法只能用于计算执行时间，若要打印执行队列不能在taskCounts[25] == 0
                // 后重新排序，一旦重新排序，最后一个任务的值会改变
                if (taskCounts[25] == 0) {
                    break;
                }

                if (i < 26 && taskCounts[25 - i] > 0) {
                    taskCounts[25 - i]--;
                }
                result++;
                i++;
            }
            Arrays.sort(taskCounts);
        }

        return result;
    }
}
