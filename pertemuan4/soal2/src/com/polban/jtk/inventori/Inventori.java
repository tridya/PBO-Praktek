package com.polban.jtk.inventori;

public class Inventori {
    private Barang[] barangs;

    // Method untuk menginisialisasi barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    // Method untuk menampilkan barang
    void showBarang() {
        System.out.println(barangs[0].getNama_barang() + " (" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNama_barang() + " (" + barangs[1].getStok() + ")");
    }

    // Method untuk pengadaan barang
    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);
        // Pengurangan stok, perkalian, atau operasi lain tidak diperbolehkan
        // barangs[0].stok -= 30; // Ini akan menyebabkan kesalahan
        // barangs[0].stok *= 30; // Ini juga akan menyebabkan kesalahan
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
