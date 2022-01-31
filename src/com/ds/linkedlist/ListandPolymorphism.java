package com.ds.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListandPolymorphism {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<Student>();
        List<Student> studentList2 = new LinkedList<Student>();

        Student s1 = new Student("Listname1",1);
        Student s2 = new Student("Listname2",2);
        Student s3 = new Student("Listname3",3);
        Student s4 = new Student("Listname4",5);
        Student s5 = new Student("Listname5",4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);

        studentList2.add(s4);
        studentList2.add(s5);
        printStudent(studentList1);
        printStudent(studentList2);
    }
    public static void printStudent(List<Student> students){
        System.out.println("**********" );

        for(Student s : students){
            System.out.println(s.getDetails());
        }
    }

}
