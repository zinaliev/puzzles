package org.zinaliev.puzzles.tree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BTMaxDepthTest {

  private final BTMaxDepth solution = new BTMaxDepth();

  @Test
  public void testEmptyTree() {
    assertEquals(0, solution.maxDepth(null));
  }

  @Test
  public void testSingleNodeTree() {
    assertEquals(1, solution.maxDepth(new TreeNode(1)));
  }

  @Test
  public void testBalancedTree() {
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

    assertEquals(3, solution.maxDepth(root));
  }

  @Test
  public void testUnbalancedTree_LR() {
    TreeNode root = new TreeNode(10);
    TreeNode rl = new TreeNode(5);
    TreeNode rlr = new TreeNode(11);

    root.left = rl;
    rl.right = rlr;

    assertEquals(3, solution.maxDepth(root));
  }

  @Test
  public void testUnbalancedTree_RL() {
    TreeNode root = new TreeNode(10);
    TreeNode rr = new TreeNode(15);
    TreeNode rrl = new TreeNode(13);

    root.right = rr;
    rr.left = rrl;

    assertEquals(3, solution.maxDepth(root));
  }
}