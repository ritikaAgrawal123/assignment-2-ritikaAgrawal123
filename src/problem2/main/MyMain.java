/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

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
        tree.add(40);
        tree.preOrder();
        tree.postOrder();
        /*OUTPUT
        preOrder traversal
            15 10 9 11 13 20 40
          postOrder traversal:
             10 9 11 13 20 40 15 */
        /*
         * Root element is placed at opposite end, i.e.
         * in pre order root is the first element where as in post order root is the last element.*/
        /*They have not common mid point, i.e.
        both the traversal will give different element at the mid position for odd number of nodes.*/
    }
}
