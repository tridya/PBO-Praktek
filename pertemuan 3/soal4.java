import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        double gajiPokok = 800000;
        double bonus = 100000;
        double hargaItem = 50000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah penjualan: ");
        int jumlahJual = sc.nextInt();

        if (jumlahJual >= 40) {
            if (jumlahJual > 80) {
                bonus = 0.35 * jumlahJual * hargaItem;
            } else {
                bonus = 0.25 * jumlahJual * hargaItem;
            }
            gajiPokok += bonus;

        } else if (jumlahJual < 15) {
            gajiPokok -= 0.15 * (15 - jumlahJual) * hargaItem;

        } else {
            bonus = 0.1 * jumlahJual * hargaItem;
            gajiPokok += bonus;
        }

        int gajiFinal = (int) gajiPokok;

        System.out.println("Gaji final: " + gajiFinal);

        sc.close();
    }
}
