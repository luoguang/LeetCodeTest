package com.luog;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UnitTest {
    private TreeNode root;

    private Integer[] array;

    @Before
    public void before() {
        array = new Integer[]{3, 9, 20, null, null, 15, 7};

        root = createBinaryTreeByArray(array, 0);
    }

    @Test
    public void testSolution1() {
        Solution1 solution1 = new Solution1();
        List<List<Integer>> list = solution1.levelOrderBottom(root);
        print(list);
    }

    private TreeNode createBinaryTreeByArray(Integer[] array, int index) {
        TreeNode treeNode;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            treeNode = new TreeNode(value);
            treeNode.left = createBinaryTreeByArray(array, 2 * index + 1);
            treeNode.right = createBinaryTreeByArray(array, 2 * index + 2);
            return treeNode;
        }
        return null;
    }

    private void print(List<List<Integer>> list) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for (List<Integer> subList : list) {
            buffer.append("[");
            for (Integer val : subList) {
                buffer.append(val).append(", ");
            }
            buffer.deleteCharAt(buffer.length() - 1);
            buffer.deleteCharAt(buffer.length() - 1);
            buffer.append("], ");
        }
        buffer.append("]");
        System.out.println(buffer);
    }
}
