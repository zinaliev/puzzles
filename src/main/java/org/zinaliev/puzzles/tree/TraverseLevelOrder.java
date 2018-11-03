package org.zinaliev.puzzles.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class TraverseLevelOrder {

  public static List<List<Integer>> levelOrder(TreeNode node) {
    List<List<Integer>> result = new ArrayList<>();
    if(node == null)
      return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);

    int rowSize = 1;

    while(!queue.isEmpty()){
      List<Integer> row = new ArrayList<>();

      while(rowSize > 0){

        node = queue.poll();
        row.add(node.val);
        rowSize--;

        if(node.left != null){
          queue.add(node.left);
        }

        if(node.right != null){
          queue.add(node.right);
        }
      }

      rowSize = queue.size();
      result.add(row);
    }

    return result;
  }
}
