package com.ds.linkedlist;
import java.util.LinkedList;

public class LinkedListGet {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<Student>();
        studentList.add(new Student("Sujata", 1));
        studentList.add(new Student("Sid", 2));
        studentList.add(new Student("preet", 3));
        studentList.add(new Student("Harishyam", 5));

        System.out.println(studentList.get(1).getDetails());

    }

    public static void printStudentList(LinkedList<Student> students) {
        for(Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}
