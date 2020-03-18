import org.junit.Test;

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

    private void print(int i) {
        System.out.println(i);
    }
}
