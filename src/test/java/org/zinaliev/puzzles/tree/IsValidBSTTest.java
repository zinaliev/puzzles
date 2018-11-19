package org.zinaliev.puzzles.tree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsValidBSTTest {

    private final IsValidBST solution = new IsValidBST();

    @Test
    public void testValid() {
        TreeNode root = new TreeNode(10);

        TreeNode rl = new TreeNode(5);
        TreeNode rr = new TreeNode(15);

        TreeNode rll = new TreeNode(4);
        TreeNode rlr = new TreeNode(6);

        TreeNode rrl = new TreeNode(12);
        TreeNode rrr = new TreeNode(17);

        root.left = rl;
        root.right = rr;

        rl.left = rll;
        rl.right = rlr;

        rr.left = rrl;
        rr.right = rrr;

        assertTrue(solution.isValidBST(root));
        assertTrue(solution.isValidBSTRecursive(root));
    }

    @Test
    public void testInvalid() {
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

        assertFalse(solution.isValidBST(root));
        assertFalse(solution.isValidBSTRecursive(root));
    }

    @Test
    public void test_EmptyTree_IsValid() {
        assertTrue(solution.isValidBST(null));
        assertTrue(solution.isValidBSTRecursive(null));
    }

    @Test
    public void test_SingleNodeTree_IsValid() {
        assertTrue(solution.isValidBST(new TreeNode(1)));
        assertTrue(solution.isValidBSTRecursive(new TreeNode(1)));
    }
}