/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();
        tree.add(15);
        tree.add(10);
        tree.add(20);
        tree.add(9);
        tree.add(11);
        tree.add(13);
        MyQueue<Integer> queue = new MyQueue<>();
        queue.queueAsBST(tree);
        queue.print();
    }
}
