package com.ds.arraylist;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Ram");
        studentList.add("Shyam");
        studentList.add("Tejas");
        studentList.add("Hari");
        studentList.add("Durga");

        printArray(studentList);
    }

    public static void printArray(ArrayList<String> studentList){
        for(String s : studentList){
            System.out.println(s);
        }
    }
}
