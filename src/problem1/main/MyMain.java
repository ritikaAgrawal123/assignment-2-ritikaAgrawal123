/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();
        tree.add(15);
        tree.add(10);
        tree.add(20);
        tree.add(9);
        tree.add(11);
        tree.add(13);
        System.out.println("Left children of the binary search tree: ");
        tree.printLeftNodes();
        System.out.println("No.of Parents not having their left child are:");
        System.out.println(tree.size() - tree.leftNodes());

    }
}

