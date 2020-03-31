/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue<T extends Comparable<T>> {
    private int size = 0;
    private Node<T> head = null;

    public int size() {
        return size;
    }

    public void enqueue(T data) {
        size++;
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node<T> start = head;
        Node<T> var = start;
        if ((head).data.compareTo(data) > 0) {
            temp.next = head;
            head = temp;
        } else {
            Node<T> cur = head;
            while (cur.next != null) {
                if (data.compareTo(cur.next.data) <= 0) {
                    temp.next = cur.next;
                    cur.next = temp;
                    return;
                }
                cur = cur.next;
            }
            temp.next = null;
            cur.next = temp;
        }
    }

    public T dequeue() {
        size--;
        Node temp = head;
        (head) = head.next;
        return head.data;
    }

    public void print() {
        System.out.println("Elements of queue are:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
