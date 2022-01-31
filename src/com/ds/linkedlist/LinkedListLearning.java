package com.ds.linkedlist;

import java.util.LinkedList;

public class LinkedListLearning {

    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<Student>();
        studentList.add(new Student("LinkedListname1", 01));
        studentList.add(new Student("LinkedListname2", 02));
        /* adding values to particular index */
        studentList.add(0, new Student("LinkedListname3", 03));
        studentList.add(new Student("LinkedListHari", 04));
        /* remove the value from List */
        studentList.remove(3);
        System.out.println("Index 2 = "+studentList.get(2).getDetails());

        //printStudentList(studentList);
    }

    public static void printStudentList(LinkedList<Student> students) {


        for (Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return "name  =" + this.name + '\n' + "roll Number =" + this.rollNumber + '\n';
    }
}