package com.polym;

public class Pekerja extends DaftarPegawai {
    protected String socialSecurityNumber;
    protected double payRate;

    public Pekerja(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber;
    }

    public double gajian() {
        return payRate;
    }
}


