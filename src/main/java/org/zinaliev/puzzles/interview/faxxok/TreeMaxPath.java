package org.zinaliev.puzzles.interview.faxxok;

public class TreeMaxPath {

    public static void main(String[] args) {
        TreeMaxPath solution = new TreeMaxPath();

        TreeNode root = new TreeNode("r");

        root.left = new TreeNode("l");
        root.right = new TreeNode("r");

        root.right.right = new TreeNode("rr");

        root.left.left = new TreeNode("ll");
        root.left.left.right = new TreeNode("llr");
        root.left.left.right.right = new TreeNode("llrr");
        root.left.left.right.right.left = new TreeNode("llrrl");


        root.left.left.left = new TreeNode("lll");
        root.left.right = new TreeNode("lr");
        root.left.right.right = new TreeNode("lrr");
        root.left.right.right.right = new TreeNode("lrrr");
        root.left.right.right.left = new TreeNode("lrrl");
        root.left.right.right.right.right = new TreeNode("lrrrr");

        System.out.println(solution.maxPathLength(root));
    }

    public int maxPathLength(TreeNode root) {
        if (root == null)
            return -1;

        return maxPathLength(root, 0);
    }

    private int maxPathLength(TreeNode node, int curMax) {

        if (node == null)
            return curMax;

        int heightLeft = node.left != null ? height(node.left) : 0;
        int heightRight = node.right != null ? height(node.right) : 0;

        if (heightLeft + heightRight > curMax) {
            curMax = heightLeft + heightRight;
            System.out.println(node.val);
        }

        return Math.max(
                heightLeft + heightRight,
                Math.max(maxPathLength(node.left, curMax), maxPathLength(node.right, curMax))
        );
    }

    private int height(TreeNode node) {
        return heightRec(node, 0);
    }

    private int heightRec(TreeNode node, int curHeight) {
        if (node == null)
            return curHeight;

        return Math.max(heightRec(node.left, curHeight + 1), heightRec(node.right, curHeight + 1));
    }

}

class TreeNode {
    public String val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(String val) {
        this.val = val;
    }
}
