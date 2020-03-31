/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem3.node.Node;

public class MyQueue<T> {
    Node<T> front = null;
    Node<T> rear = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void queueAsBST(MyBinarySearchTree bst) {
        MyQueue<T> queue = new MyQueue<T>();
        preOrder(bst.getRoot(), queue);
        queue.dequeue();
        this.front = queue.front;
        this.rear = queue.rear;
        this.size = queue.getSize();

    }

    private void preOrder(TreeNode<T> node, MyQueue<T> queue) {
        if (node == null) {
            return;
        }
        queue.enqueue(node.data);
        preOrder(node.left, queue);
        preOrder(node.right, queue);
    }

    public void enqueue(T data) {
        size++;
        Node node = new Node<T>(data);
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public T dequeue() {
        T data;
        if (this.front == null) {
            return null;
        } else {
            size--;
            data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        return data;
    }

    public void print() {
        System.out.println("Elements of queue are:");
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
