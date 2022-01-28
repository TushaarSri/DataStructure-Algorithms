package com.ds.arraylist;

//ArrayList library imported
import java.util.ArrayList;

public class ArrayListSolution {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        name.add("Raam");
        name.add("Joseph");
        name.add("Ali");
        name.add("karun");
        name.add("Shyam");

        printArray(name);
    }

    public static void printArray(ArrayList name){
        for(Object studentName : name ){
            System.out.println(studentName);
        }
    }
}
