package com.luog;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
    private int[] nums = new int[]{2, 7, 11, 15};

    private int target = 9;

    @Before
    public void before() {
    }

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    @Test
    public void testSolution3() {
        Solution3 solution = new Solution3();
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    @Test
    public void testSolution4() {
        Solution4 solution = new Solution4();
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
