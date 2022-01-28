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
        ArrayList studentList = new ArrayList();
        studentList.add(new Student("name1", 01));
        studentList.add(new Student("name2", 02));
        studentList.add(new Student("name3", 03));

        printStudentList(studentList);
    }

    public static void printStudentList(/*Student[]*/ ArrayList students){


        for(/*Student s*/ Object o : students){
            /*we are going through students StudentList which is an ArrayList of objects  */
            /*therefore elements of the students AL are of type Object and
             in order to be able to access getDetails method OF THE STUDENT OBJECT WHICH WE ARE OBTAINING WE
             NEED TOT tYPECAST*/
            Student s= (Student) o ;
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