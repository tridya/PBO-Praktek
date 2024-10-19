package com.polym;

public class PekerjaLepas extends Pekerja {
    private int hoursWorked;

    public PekerjaLepas(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    public double gajian() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    public String toString() {
        return super.toString() + "\nCurrent hours: " + hoursWorked;
    }
}

