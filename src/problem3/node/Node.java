/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node<T> {
    public T data;
    public Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
