package org.zinaliev.structures.binarytree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeNode<T> {

    public T value;
    public BinaryTreeNode<T> leftChild;
    public BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public BinaryTreeNode<T> createLeft(T value) {
        leftChild = new BinaryTreeNode<>(value);
        return leftChild;
    }

    public BinaryTreeNode<T> createRight(T value) {
        rightChild = new BinaryTreeNode<>(value);
        return rightChild;
    }

    public List<T> traversePreOrder() {
        var path = new LinkedList<T>();

        traversePreOrder(path);

        return path;
    }

    private void traversePreOrder(List<T> path) {
        path.add(value);

        if (leftChild != null) {
            leftChild.traversePreOrder(path);
        }

        if (rightChild != null) {
            rightChild.traversePreOrder(path);
        }
    }

    public List<T> traverseInOrder() {
        var path = new LinkedList<T>();
        traverseInOrder(path);
        return path;
    }

    private void traverseInOrder(List<T> path) {
        if (leftChild != null) {
            leftChild.traverseInOrder(path);
        }

        path.add(value);

        if (rightChild != null) {
            rightChild.traversePreOrder(path);
        }
    }

    public List<T> traversePostOrder() {
        var path = new LinkedList<T>();
        traversePostOrder(path);
        return path;
    }

    private void traversePostOrder(LinkedList<T> path) {
        if (leftChild != null) {
            leftChild.traversePostOrder(path);
        }

        if (rightChild != null) {
            rightChild.traversePostOrder(path);
        }

        path.add(value);
    }
}
