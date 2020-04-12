package com.luog;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
    private TreeNode root;

    private Integer[] array;

    private TreeNode p;

    private int pVal;

    private TreeNode q;

    private int qVal;

    @Before
    public void before() {
        pVal = 5;

        qVal = 1;

        array = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};

        root = createBinaryTreeByArray(array, 0);
    }

    @Test
    public void testSolution1() {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.lowestCommonAncestor(root, p, q));
    }

    private TreeNode createBinaryTreeByArray(Integer[] array, int index) {
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }

            TreeNode treeNode = new TreeNode(value);
            treeNode.left = createBinaryTreeByArray(array, 2 * index + 1);
            treeNode.right = createBinaryTreeByArray(array, 2 * index + 2);

            if (value == pVal) {
                p = treeNode;
            }

            if (value == qVal) {
                q = treeNode;
            }

            return treeNode;
        }
        return null;
    }
}
