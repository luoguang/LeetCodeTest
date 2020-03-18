package com.luog;

import org.junit.Test;

public class UnitTest {
    private int[] nums = new int[]{1, 5, 1};

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();

        long start = System.currentTimeMillis();
        solution.nextPermutation(nums);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        print(nums);
    }

    private void print(int[] nums) {
        StringBuffer buffer = new StringBuffer();
        for (Integer integer : nums) {
            buffer.append(integer).append(" ");
        }
        System.out.println(buffer);
    }
}
