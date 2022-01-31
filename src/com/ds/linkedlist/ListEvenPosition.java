package com.ds.linkedlist;

/*a code that prints the elements stored at the even positions of ArrayList,
i.e. print alternate elements, starting from index 1.*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListEvenPosition {
    public static void main(String[] args) {
        List<Float> number = new ArrayList<Float>();
        number.add(1F);
        number.add(2F);
        number.add(3F);
        number.add(4F);
        number.add(5F);
        number.add(6F);
        number.add(7F);
        number.add(8F);

        iterateEven(number);
    }
    public static void iterateEven(List<Float> num){
        ListIterator<Float> listIterator = num.listIterator();
        while (listIterator.hasNext()){
            listIterator.next();
            if (listIterator.hasNext()){
                System.out.println(listIterator.next());
            }
        }
    }
}
