package org.zinaliev.puzzles.tree;

public class BTMaxDepth {

  public int maxDepth(TreeNode root) {
    return maxDepthRec(root, 0);
  }

  private int maxDepthRec(TreeNode node, int depth){
    if(node == null)
      return depth;

    depth++;

    int leftDepth = maxDepthRec(node.left, depth);
    int rightDepth = maxDepthRec(node.right, depth);

    return leftDepth > rightDepth ? leftDepth : rightDepth;
  }
}
