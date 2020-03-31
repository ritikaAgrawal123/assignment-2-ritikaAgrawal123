/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue<T> {
    Node<T> front, rear;

    public void enQueue(T data) {
        Node<T> temp = new Node<>(data);
        temp.data = data;
        if (front == null)
            front = temp;
        else
            rear.next = temp;

        rear = temp;
        rear.next = front;
    }

    public T deQueue() {
        if (front == null) {
            System.out.printf("Queue is empty");
            return null;
        }
        T value;
        if (front == rear) {
            value = front.data;
            front = null;
            rear = null;
        } else {
            Node<T> temp = front;
            value = temp.data;
            front = front.next;
            rear.next = front;
        }

        return value;
    }

    public void print() {
        System.out.println("Elements of queue are:");
        Node<T> temp = front;
        System.out.println(temp.data);
        temp = temp.next;
        while (temp != front) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
