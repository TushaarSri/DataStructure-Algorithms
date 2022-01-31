package com.ds.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*Iterator is an interface in Java, which is used to iterate over a collection of objects. You can think of an ‘iterator’ as a cursor to an element in a collection. Also, you can use the ‘iterator’ (or the cursor) to move to the next element in the collection.
ListIterator is a subinterface of the Iterator interface, which is used to iterate over a list. It has a lot more features than the Iterator interface. These features are given below:
It is used to traverse a list in any direction, i.e. forward or backward, very easily.
It doesn’t point to any current element; its cursor position always lies between the previous and next elements (Figure 1 given below).
It has methods to find out if there exists a next or previous element and to find the value of this next or previous element, as well as its indices.*/

public class ListIteratorClass {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<Student>();
        Student s1 = new Student("Listname1", 1);
        Student s2 = new Student("Listname2", 2);
        Student s3 = new Student("Listname3", 3);
        Student s4 = new Student("Listname4", 5);
        Student s5 = new Student("Listname5", 4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList1.add(s4);
        studentList1.add(s5);

        iterateFws(studentList1);
        iteratebckward(studentList1);

    }

    public static void iterateFws(List<Student> students) {
        ListIterator<Student> it = students.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
    }

    public static void iteratebckward(List<Student> students) {
        System.out.println("++++ Backward ++++");
        ListIterator<Student> it = students.listIterator(students.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous().getDetails());
        }
    }
}
