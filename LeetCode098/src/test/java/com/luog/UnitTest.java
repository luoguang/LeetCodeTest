package com.luog;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
    private TreeNode root;

    private Integer[] array;

    @Before
    public void before() {
        array = new Integer[]{1, 1};

        root = createBinaryTreeByArray(array, 0);
    }

    @Test
    public void testSolution1() {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isValidBST(root));
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
            return treeNode;
        }
        return null;
    }
}
