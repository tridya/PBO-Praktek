package com.studikasus3;

// Sorting.java
public class Sorting {
    // Selection Sort (unchanged)
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    // Modified Insertion Sort to sort in descending order
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            // Shift larger values to the right
            while (position > 0 && list[position - 1].compareTo(key) < 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }
}

