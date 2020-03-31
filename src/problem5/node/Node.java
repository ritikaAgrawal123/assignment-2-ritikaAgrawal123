/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties
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
