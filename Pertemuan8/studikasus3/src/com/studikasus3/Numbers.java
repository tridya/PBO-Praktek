package com.studikasus3;
// Numbers.java
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int size = scan.nextInt();
        Integer[] numbers = new Integer[size];  // Use Integer instead of int

        System.out.println("Enter the integers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();  // Autoboxing will handle int to Integer conversion
        }

        // Sort the array using selectionSort
        Sorting.selectionSort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
