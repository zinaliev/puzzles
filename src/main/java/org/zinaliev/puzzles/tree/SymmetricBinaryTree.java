package org.zinaliev.puzzles.tree;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * Example :
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * The above binary tree is symmetric.
 * But the following is not:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
public class SymmetricBinaryTree {

    public int isSymmetric(TreeNode a) {
        if (a == null)
            return 0;

        return isSymmetric(a.left, a.right) ? 1 : 0;
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        if (left.val != right.val)
            return false;

        return isSymmetric(left.left, right.right) &&
                isSymmetric(left.right, right.left);
    }

    /**
     * Definition for a tree node
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
