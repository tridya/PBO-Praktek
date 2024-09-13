package com.polban.jtk.inventori;

public class Barang{
    private String kode_barang;
    private String nama_barang;
    private int stok;

    // Constructor
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        setStok(stk); // Menggunakan setter untuk validasi stok
    }

    // Getter untuk kode_barang dan nama_barang
    public String getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getStok() {
        return stok;
    }

    // Setter untuk stok dengan validasi
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak bisa negatif!");
        }
    }

    // Method untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Jumlah yang ditambahkan harus positif!");
        }
    }
}
