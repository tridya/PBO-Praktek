package com.polym;


public class Staff {
    private DaftarPegawai[] staffList;

    public Staff() {
        staffList = new DaftarPegawai[8];
        staffList[0] = new Direktur("Daffa", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Pekerja("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Pekerja("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new PekerjaLepas("Diane", "678 Fifth Ave", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Sukarela("Norm", "987 Suds Blvd", "555-8374");
        staffList[5] = new Sukarela("Cliff", "321 Duds Lane", "555-7282");

        // Commission Employees
        staffList[6] = new Komisi("John", "100 Elm St", "555-1234", "234-56-7890", 6.25, 0.20);
        staffList[7] = new Komisi("Jane", "200 Oak St", "555-5678", "345-67-8901", 9.75, 0.15);

        ((PekerjaLepas) staffList[3]).addHours(40);
        ((Komisi) staffList[6]).addHours(35);
        ((Komisi) staffList[6]).addSales(400);
        ((Komisi) staffList[7]).addHours(40);
        ((Komisi) staffList[7]).addSales(950);
    }

    public void harigajian() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].gajian();

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
