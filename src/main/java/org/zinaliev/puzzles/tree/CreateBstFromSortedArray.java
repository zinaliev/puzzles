package org.zinaliev.puzzles.tree;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * <p>
 * Example:
 * <p>
 * Given the sorted array: [-10,-3,0,5,9],
 * <p>
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
public class CreateBstFromSortedArray {

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int min, int max) {
        if (min > max)
            return null;

        int mid = (min + max) / 2;

        // System.out.println("item = " + nums[mid]);
        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBST(nums, min, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, max);

        return node;
    }
}
