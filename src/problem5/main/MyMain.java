/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        MyCircularQueue<Student> queue = new MyCircularQueue<>();
        arr.add(new Student("Ritika", 49));
        arr.add(new Student("Sakshi", 53, 1, 0));
        arr.add(new Student("Priya", 38, 2, 1));
        arr.add(new Student("Aditi", 1, 2, 2));
        arr.add(new Student("Ruchira", 50, 1, 1));
        arr.add(new Student("Vedika", 63));
        System.out.println(arr);
        for (Student s : arr) {
            if (s.getBackLog() != 0 && s.getAppearingCount() <= 2) {
                queue.enQueue(s);
            }
        }
        queue.print();
    }
}
