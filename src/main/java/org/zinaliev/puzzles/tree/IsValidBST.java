package org.zinaliev.puzzles.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IsValidBST {
    public static void main(String[] args) {
        IsValidBST solution = new IsValidBST();

        TreeNode root = new TreeNode(10);

        TreeNode rl = new TreeNode(5);
        TreeNode rr = new TreeNode(15);

        TreeNode rll = new TreeNode(4);
        TreeNode rlr = new TreeNode(11);

        TreeNode rrl = new TreeNode(12);
        TreeNode rrr = new TreeNode(17);

        root.left = rl;
        root.right = rr;

        rl.left = rll;
        rl.right = rlr;

        rr.left = rrl;
        rr.right = rrr;

        for (Integer i : solution.traverseInOrder(root)) {
            System.out.print(i + " ");
        }

        System.out.println("-> isBST = " + solution.isValidBST(root));
    }

    public boolean isValidBSTRecursive(TreeNode root) {
        return isBstRec(root, null, null);
    }

    private boolean isBstRec(TreeNode node, Integer lower, Integer higher) {
        if (node == null)
            return true;

        System.out.println("node=" + node.val + " - (" + lower + "; " + higher + ")");

        if ((lower == null || lower < node.val) && (higher == null || node.val < higher)) {
            return isBstRec(node.left, lower, node.val) &&
                    isBstRec(node.right, node.val, higher);
        }

        return false;
    }

    public boolean isValidBST(TreeNode root) {

        Integer cur = null;

        for (Integer i : traverseInOrder(root)) {
            if (cur == null || cur < i) {
                cur = i;
            } else {
                return false;
            }
        }

        return true;
    }

    private List<Integer> traverseInOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;
    }
}


