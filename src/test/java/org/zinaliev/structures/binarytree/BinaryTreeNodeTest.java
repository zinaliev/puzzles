package org.zinaliev.structures.binarytree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeNodeTest {

    @Test
    public void should_traverse_pre_order() {
        // given
        var root = aBinaryTree();

        // when
        var preOrderedPath = root.traversePreOrder();

        // then
        assertThat(preOrderedPath).containsExactly(
            "D", "B", "A", "C", "E", "F"
        );
    }

    @Test
    public void should_traverse_in_order() {
        // given
        var root = aBinaryTree();

        // when
        var preOrderedPath = root.traverseInOrder();

        // then
        assertThat(preOrderedPath).containsExactly(
            "A", "B", "C", "D", "E", "F"
        );
    }

    @Test
    public void should_traverse_post_order() {
        // given
        var root = aBinaryTree();

        // when
        var preOrderedPath = root.traversePostOrder();

        // then
        assertThat(preOrderedPath).containsExactly(
            "A", "C", "B", "F", "E", "D"
        );
    }

    /**
     *           D
     *          / \
     *         /   \
     *        B     E
     *       / \   /
     *      A  C  F
     */
    private BinaryTreeNode<String> aBinaryTree() {
        var root = new BinaryTreeNode<>("D");

        var rootRight = root.createRight("E");
        var rootLeft = root.createLeft("B");

        rootLeft.createLeft("A");
        rootLeft.createRight("C");
        rootRight.createLeft("F");

        return root;
    }

}