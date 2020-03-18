import java.util.Arrays;

/**
 * 数列排序
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
