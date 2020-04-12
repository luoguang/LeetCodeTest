package com.luog;

/**
 * 二叉树的广度遍历
 */
public class Solution1 {
    public boolean isValidBST(TreeNode root) {
        return checkValidBST(root, null, null);
    }

    private boolean checkValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;

        // 比较左子树时upper一直为null；反之比较右子树时lower一直为null。
        // 每次只比较一个子树
        // 一旦发现不是二叉搜索树，则结束递归
        if (lower != null && val <= lower) {
            return false;
        }

        if (upper != null && val >= upper) {
            return false;
        }

        // 此时传过去的lower实际上是null，只比较左子树的值和当前结点的值
        // 一旦发现不是二叉搜索树，则结束递归
        if (!checkValidBST(node.left, lower, val)) {
            return false;
        }

        // 此时传过去的upper实际上是null，只比较右子树的值和当前结点的值
        // 一旦发现不是二叉搜索树，则结束递归
        if (!checkValidBST(node.right, val, upper)) {
            return false;
        }

        return true;
    }
}
