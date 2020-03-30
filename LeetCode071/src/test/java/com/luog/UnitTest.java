package com.luog;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UnitTest {
    private List<String> pathList = Arrays.asList("/home/", "/../",
            "/home//foo/", "/a/./b/../../c/", "/a/../../b/../c//.//", "/a//b////c/d//././/..");


    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();
        long start;
        long end;
        String ret;

        for (String path : pathList) {
            start = System.currentTimeMillis();
            ret = solution.simplifyPath(path);
            end = System.currentTimeMillis();
            System.out.println("path: [" + path + "], ret: [" + ret + "], time: [" + (end - start) + "]ms");
        }
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();
        long start;
        long end;
        String ret;

        for (String path : pathList) {
            start = System.currentTimeMillis();
            ret = solution.simplifyPath(path);
            end = System.currentTimeMillis();
            System.out.println("path: [" + path + "], ret: [" + ret + "], time: [" + (end - start) + "]ms");
        }
    }
}
