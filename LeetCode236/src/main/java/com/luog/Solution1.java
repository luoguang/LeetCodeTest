package com.luog;

public class Solution1 {
    /**
     * 一下来自CSDN
     * 根据临界条件，实际上可以发现这道题已经被简化为查找以root为根结点的树上是否有p结点或者q结点，如果有就返回p结点或q结点，否则返回null。
     * 这样一来其实就很简单了，从左右子树分别进行递归，即查找左右子树上是否有p结点或者q结点，就一共有4种情况：
     * 第一种情况：左子树和右子树均找没有p结点或者q结点；（这里特别需要注意，虽然题目上说了p结点和q结点必定都存在，但是递归的时候必须把所有情况都考虑进去，因为题目给的条件是针对于整棵树，而递归会到局部，不一定都满足整体条件）
     * 第二种情况：左子树上能找到，但是右子树上找不到，此时就应当直接返回左子树的查找结果；
     * 第三种情况：右子树上能找到，但是左子树上找不到，此时就应当直接返回右子树的查找结果；
     * 第四种情况：左右子树上均能找到，说明此时的p结点和q结点分居root结点两侧，此时就应当直接返回root结点了。
     * <p>
     * 根据题目，一定能找到p q两个节点，所以不存在只能找到一个点的情况。一顶能找到一个点，p q在他的左右子树上
     * 如果p q是在以root为根节点的子数上，那么最近公共节点就是root。
     * 一旦找到这个节点，逐层向上返回
     * 否则，返回null
     * null无意义，后续处理在处理null值是自动过滤
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right == null) {
            return null;
        } else if (left != null && right == null) {
            //左子树上能找到，但是右子树上找不到，此时就应当直接返回左子树的查找结果；
            return left;
        } else if (left == null && right != null) {
            // 右子树上能找到，但是左子树上找不到，此时就应当直接返回右子树的查找结果；
            return right;
        }

        // 左右子树上均能找到，说明此时的p结点和q结点分居root结点两侧，此时就应当直接返回root结点了。
        return root;
    }
}
