/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode<T> {
    public T data;
    public TreeNode<T> left = null;
    public TreeNode<T> right = null;

    public TreeNode(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
