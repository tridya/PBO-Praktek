package com.polym;

public abstract class DaftarPegawai {
    protected String name;
    protected String address;
    protected String phone;

    public DaftarPegawai(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }

    public abstract double gajian();
}

