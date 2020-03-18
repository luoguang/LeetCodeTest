package com.luog;

import org.junit.Test;

import java.util.List;

public class UnitTest {
    private int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();

        long start = System.currentTimeMillis();
        List<List<Integer>> result = solution.threeSum(nums);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        print(result);
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();

        long start = System.currentTimeMillis();
        List<List<Integer>> result = solution.threeSum(nums);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        print(result);
    }

    @Test
    public void testSolution3() {
        Solution3 solution = new Solution3();

        long start = System.currentTimeMillis();
        List<List<Integer>> result = solution.threeSum(nums);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        print(result);
    }

    private void print(List<List<Integer>> result) {
        StringBuffer buffer = new StringBuffer();
        for (List<Integer> list : result) {
            for (Integer integer : list) {
                buffer.append(integer).append(" ");
            }
            buffer.append("\r\n");
        }
        System.out.println(buffer);
    }
}
