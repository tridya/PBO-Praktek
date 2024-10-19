package com.polym;

public class Direktur extends Pekerja {
    private double bonus;

    public Direktur(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0.0;
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    public double gajian() {
        double payment = super.gajian() + bonus;
        bonus = 0.0;
        return payment;
    }
}


