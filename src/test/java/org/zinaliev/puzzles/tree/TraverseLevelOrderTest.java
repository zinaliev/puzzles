package org.zinaliev.puzzles.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TraverseLevelOrderTest {

    @Test
    public void testTraverse_NullTree_ReturnsEmptyList() {
        List<List<Integer>> nodes = TraverseLevelOrder.levelOrder(null);

        assertNotNull(nodes);
        assertTrue(nodes.isEmpty());
    }

    @Test
    public void testTraverse_Bst() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode tree = CreateBstFromSortedArray.sortedArrayToBST(array);

        List<List<Integer>> nodes = TraverseLevelOrder.levelOrder(tree);

        assertNotNull(nodes);
        assertEquals(4, nodes.size());

        assertArrayEquals(new Integer[]{4}, nodes.get(0).toArray());
        assertArrayEquals(new Integer[]{1, 7}, nodes.get(1).toArray());
        assertArrayEquals(new Integer[]{0, 2, 5, 8}, nodes.get(2).toArray());
        assertArrayEquals(new Integer[]{3, 6, 9}, nodes.get(3).toArray());
    }
}