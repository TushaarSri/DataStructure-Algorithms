package com.ds.arrays;

/*You are given an unsorted array with n integers. You need to move all zeros(if any) to the end of the array and the order of the non-zero integers shouldn’t be altered.

Example:
array = [5, 8, 0, 15, 6, 0, 1, 0, 13]
Output:
array = [5, 8, 15, 6, 1, 13, 0, 0, 0]
*/

import java.util.Scanner;

public class MoveAllZerosToTheEndofTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for(int i =0 ; i < sizeOfArray ; i++){
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for(int i = 0; i <array.length ; i++){
            if(array[i] != 0){
                array[count++] = array[i];
            }
        }
        while (count < array.length){
            array[count++] = 0;
        }

        for(int i=0; i< array.length; i++){
            System.out.println(array[i]+ " ");
        }
    }
}
