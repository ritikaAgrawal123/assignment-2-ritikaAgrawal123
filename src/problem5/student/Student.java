/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student implements Comparable<Student> {
    private String name;
    private Integer rollNo;
    private int backLog;
    private int appearingCount;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.backLog = 0;
        this.appearingCount = 0;
    }

    public Student(String name, int rollNo, int backLog, int appearingCount) {
        this.appearingCount = appearingCount;
        this.backLog = backLog;
        this.name = name;
        this.rollNo = rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getBackLog() {
        return backLog;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    public String toString() {
        return getRollNo() + ". " + getName();
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo.compareTo(o.rollNo);
    }
}
