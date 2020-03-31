/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<Student> queue = new MyPriorityQueue<>();
        queue.enqueue(new Student("Ritika", 49));
        queue.enqueue(new Student("Sakshi", 53));
        queue.enqueue(new Student("Priya", 38));
        queue.enqueue(new Student("Aditi", 1));
        queue.enqueue(new Student("Ruchira", 50));
        queue.enqueue(new Student("Vedika", 63));

        queue.print();
        queue.dequeue();
        queue.print();
    }
}
