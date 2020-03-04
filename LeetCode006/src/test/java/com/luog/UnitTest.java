package com.luog;

import org.junit.Test;

public class UnitTest {
    private String s = "LEETCODEISHIRING";
    private int numRows = 3;

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();
        String result = solution.convert(s, numRows);
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();
        String result = solution.convert(s, numRows);
    }

    @Test
    public void testSolution3() {
        Solution3 solution = new Solution3();
        String result = solution.convert(s, numRows);
    }
}
