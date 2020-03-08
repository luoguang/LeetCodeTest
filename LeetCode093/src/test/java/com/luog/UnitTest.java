package com.luog;

import org.junit.Test;

import java.util.List;

public class UnitTest {
    private String s = "01001010";

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();
        List<String> resultList = solution.restoreIpAddresses(s);

        StringBuffer buffer = new StringBuffer();
        resultList.forEach(item -> buffer.append(item).append(", "));
        System.out.println(buffer.toString());
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();
        List<String> resultList = solution.restoreIpAddresses(s);

        StringBuffer buffer = new StringBuffer();
        resultList.forEach(item -> buffer.append(item).append(", "));
        System.out.println(buffer.toString());
    }
}
