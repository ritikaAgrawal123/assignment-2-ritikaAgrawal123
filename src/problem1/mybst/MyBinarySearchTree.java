/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<T extends Comparable> {
    private int nodeCount = 0;
    private TreeNode root = null;

    public int size() {
        return nodeCount;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void add(T elem) {
        root = add(root, elem);
        nodeCount++;
    }

    private TreeNode add(TreeNode node, T elem) {
        if (node == null) {
            node = new TreeNode(elem);
        } else {
            if (elem.compareTo(node.data) < 0) {
                node.left = add(node.left, elem);
            } else {
                node.right = add(node.right, elem);
            }
        }
        return node;
    }

    private int leftNodes(TreeNode<T> node) {
        int leftNodes = 0;
        if (node.left != null) {
            leftNodes += 1 + leftNodes(node.left);
        }
        if (node.right != null) {
            leftNodes += leftNodes(node.right);
        }
        return leftNodes;
    }

    private void printLeftNodes(TreeNode<T> node) {
        if (node.left != null) {
            System.out.print(node.left.data + "  ");
            printLeftNodes(node.left);
        }
        if (node.right != null) {
            printLeftNodes(node.right);
        }
    }

    public int leftNodes() {
        return leftNodes(root);
    }

    public void printLeftNodes() {
        printLeftNodes(root);
        System.out.println();
    }

    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void postOrder(TreeNode node) {
        if (node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void postOrder() {
        System.out.println("postOrder traversal:");
        postOrder(root);
        System.out.println();
    }

    public void preOrder() {
        System.out.println("preOrder traversal");
        preOrder(root);
        System.out.println();
    }
}

