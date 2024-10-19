package com.polym;

public class Komisi extends PekerjaLepas {
    private double totalSales;
    private double commissionRate;

    public Komisi(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commission;
        totalSales = 0.0;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    public double gajian() {
        double payment = super.gajian() + (totalSales * commissionRate);
        totalSales = 0;
        return payment;
    }

    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
