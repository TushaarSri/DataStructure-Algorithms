package com.ds.arrays;


import java.util.*;

public class SearchInUnsortedArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int userInputsize = scanner.nextInt();
        int[] arr = new int[userInputsize];
        for (int i = 0; i < userInputsize ; i++) {
            arr[i] = scanner.nextInt();
        }
        int userInputValueSearch = scanner.nextInt();
        search(arr, userInputValueSearch);
    }

    // Method to search for userValueSearch in an unsorted array
    static void search(int[] arr, int userValueSearch) {
        boolean flag = false;
        // Traverse the array and check if the current element is equal to userValueSearch
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == userValueSearch) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}

