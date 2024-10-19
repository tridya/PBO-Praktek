package com.studikasus3;

// Salesperson.java
public class Salesperson implements Comparable<Salesperson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;
        } else {
            return other.lastName.compareTo(this.lastName);  // Reverse alphabetical order
        }
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}

