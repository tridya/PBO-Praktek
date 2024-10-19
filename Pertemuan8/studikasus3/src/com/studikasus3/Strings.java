package com.studikasus3;

// Strings.java
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int size = scan.nextInt();
        scan.nextLine();  // Consume newline
        String[] strings = new String[size];

        System.out.println("Enter the strings: ");
        for (int i = 0; i < size; i++) {
            strings[i] = scan.nextLine();
        }

        // Sort the array using selectionSort
        Sorting.selectionSort(strings);

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}


