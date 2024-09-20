package com.polban.hirarki;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Rizdan", 19, "Bandung", "231511075", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("Daffa", 19, "Bandung", "231511082", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("Jonat", 19, "Bandung", "231511076", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("Yanto", 19, "Soreang", "231511081", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("Dzaki", 20, "Bandung", "231511083", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("nyok", 19, "Bandung", "231511086", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("fachry", 19, "Kudus", "231511084", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("Dio", 19, "Bandung", "231511073", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("Ryuki", 19, "Garut", "231511091", "Teknik Informatika", "D3 Informatika"));
        mahasiswaList.add(new Mahasiswa("yulina", 19, "Tegal", "231511096", "Teknik Informatika", "D3 Informatika"));
        
        ArrayList<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("Yadhi Aditya P.",-1, "Bandung", "KO052N", "Pemrograman Berorientasi Objek"));//0
        dosenList.add(new Dosen("Yadhi Aditya P.",-1, "Bandung", "KO052N", "Pengantar Rekayasa Perangkat Lunak"));//1
        dosenList.add(new Dosen("Yudi Widhiyasana ", -1, "Bandung", "KO013N", "Komputer Grafik"));//2
        dosenList.add(new Dosen("Suprihanto", -1, "Bandung", "KO022N", "Matematika Diskrit II"));//3
        dosenList.add(new Dosen("Trisna Gelar A", -1, "Bandung", "KO078N", "Komputer Grafik"));//4
        dosenList.add(new Dosen("Trisna Gelar A", -1, "Bandung", "KO078N", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web"));//5
        dosenList.add(new Dosen("Ade Chandra Nugraha", -1, "Bandung", "KO001N", "Basis Data"));//6
        dosenList.add(new Dosen("Muhammad Rizqi S", -1, "Bandung", "KO074N", "Aljabar Linier"));//7
        dosenList.add(new Dosen("Santi Sundari", -1, "Bandung", "KO009N", "Pengantar Rekayasa Perangkat Lunak"));//8
        dosenList.add(new Dosen("Zulkifli Arsyad", -1, "Bandung", "KO061N", "Kecerdasan Buatan"));//9
        dosenList.add(new Dosen("Ade Hodijah", -1, "Bandung", "KO060N", "Basis Data"));//10
        dosenList.add(new Dosen("Irwan Setiawan", -1, "Bandung", "KO045N", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web"));//11
        dosenList.add(new Dosen("Irawan Thamrin", -1, "Bandung", "KO006N", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web"));//12
        
        
        
        ArrayList<JadwalKuliah> jadwalKuliahList = new ArrayList<>();

        // Senin
        jadwalKuliahList.add(new JadwalKuliah("Senin", "08:40-10:40", new Ruangan("D217-Kelas"), dosenList.get(0), new MataKuliah("21IF2011", "Pemrograman Berorientasi Objek")));
        jadwalKuliahList.add(new JadwalKuliah("Senin", "10:40-12:20", new Ruangan("D217-Kelas"), dosenList.get(2), new MataKuliah("21IF2015", "Komputer Grafik")));
        jadwalKuliahList.add(new JadwalKuliah("Senin", "13:00-15:30", new Ruangan("D217-Kelas"), dosenList.get(3), new MataKuliah("21IF2010", "Matematika Diskrit II")));
        jadwalKuliahList.add(new JadwalKuliah("Senin", "15:50-18:20", new Ruangan("D102-Lab"), dosenList.get(4), new MataKuliah("21IF2015", "Komputer Grafik")));
        

        // Selasa
        jadwalKuliahList.add(new JadwalKuliah("Selasa", "07:00-08:40", new Ruangan("D101-Kelas"), dosenList.get(6), new MataKuliah("21IF2012", "Basis Data")));
        jadwalKuliahList.add(new JadwalKuliah("Selasa", "08:40-10:40", new Ruangan("D101-Kelas"), dosenList.get(7), new MataKuliah("21IF2014", "Aljabar Linier")));
        jadwalKuliahList.add(new JadwalKuliah("Selasa", "10:40-12:20", new Ruangan("D101-Kelas"), dosenList.get(8), new MataKuliah("21IF2013", "Pengantar Rekayasa Perangkat Lunak")));


        // Rabu
        jadwalKuliahList.add(new JadwalKuliah("Rabu", "07:00-07:50", new Ruangan("D102-Lab"), dosenList.get(5), new MataKuliah("21IF2016", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web")));
        jadwalKuliahList.add(new JadwalKuliah("Rabu", "07:50-08:40", new Ruangan("D102-Lab"), dosenList.get(11), new MataKuliah("21IF2016", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web")));
        jadwalKuliahList.add(new JadwalKuliah("Rabu", "09:30-12:00", new Ruangan("D102-Lab"), dosenList.get(12), new MataKuliah("21IF2016", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web")));
        jadwalKuliahList.add(new JadwalKuliah("Rabu", "09:30-12:00", new Ruangan("D102-Lab"), dosenList.get(5), new MataKuliah("21IF2016", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web")));
        jadwalKuliahList.add(new JadwalKuliah("Rabu", "07:00-09:30", new Ruangan("D102-Lab"), dosenList.get(11), new MataKuliah("21IF2016", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web")));
        jadwalKuliahList.add(new JadwalKuliah("Rabu", "07:00-09:30", new Ruangan("D102-Lab"), dosenList.get(12), new MataKuliah("21IF2016", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web")));

        //kamis
        jadwalKuliahList.add(new JadwalKuliah("Kamis", "09:50-15:30", new Ruangan("D106-Lab"), dosenList.get(1), new MataKuliah("21IF2013", "Pengantar Rekayasa Perangkat Lunak")));
        jadwalKuliahList.add(new JadwalKuliah("Kamis", "15:50-18:20", new Ruangan("D106-Lab"), dosenList.get(9), new MataKuliah("21IF2011", "Pemrograman Berorientasi Objek")));

        
       //jumat
       jadwalKuliahList.add(new JadwalKuliah("Jumat", "07:00-14:20", new Ruangan("D106-Lab"), dosenList.get(10), new MataKuliah("21IF2012", "Basis Data")));

       

        // ... (tambahkan jadwal untuk hari-hari lainnya)

        // Urutkan jadwal berdasarkan hari
        Collections.sort(jadwalKuliahList, new Comparator<JadwalKuliah>() {
            @Override
            public int compare(JadwalKuliah j1, JadwalKuliah j2) {
                return j1.getHari().compareTo(j2.getHari());
            }
        });

        // Tampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            mhs.getInfo();
            System.out.println();
        }

        // Tampilkan data dosen
        System.out.println("Data Dosen:");
        for (Dosen dsn : dosenList) {
            dsn.getInfo();
            System.out.println();
        }

        // Tampilkan jadwal kuliah dengan pembatas hari
        System.out.println("Jadwal Kuliah:");
        String hariSebelumnya = "";
        for (JadwalKuliah jadwal : jadwalKuliahList) {
            if (!jadwal.getHari().equals(hariSebelumnya)) {
                if (!hariSebelumnya.isEmpty()) {
                    System.out.println("----------------------------------------");
                }
                System.out.println("=== " + jadwal.getHari() + " ===");
                hariSebelumnya = jadwal.getHari();
            }
            jadwal.getInfo();
            System.out.println();
        }
    }
}