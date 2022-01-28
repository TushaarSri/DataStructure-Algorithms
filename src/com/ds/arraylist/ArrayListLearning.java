package com.ds.arraylist;
import  java.util.ArrayList;

public class ArrayListLearning {

    public static void main(String[] args) {
        /*Student studentList[] = { issue here we are restricted with the size
        How ArrayList rescue us?
                new Student("name1", 01),
                new Student("name2", 02),
                new Student("name3", 03)
        };*/
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("name1", 01));
        studentList.add(new Student("name2", 02));
        studentList.add(new Student("name3", 03));
        studentList.add(new Student("Hari", 04));
        studentList.add(new Student("Ravishankar", 05));


        printStudentList(studentList);
    }

    public static void printStudentList(ArrayList<Student> students){


        for(Student s : students){
            System.out.println(s.getDetails());
        }
    }
}

class Student{
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails(){
        return "name  =" +this.name + '\n' + "roll Number =" + this.rollNumber;
    }
}