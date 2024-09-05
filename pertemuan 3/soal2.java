import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        String[] kata = new String[3];
        int[] angka = new int[3];

        for (i = 0; i < 3; i++) {
            String katas = sc.next();
            int angkas = sc.nextInt();
            kata[i] = katas;
            angka[i] = angkas;
        }

        for (i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", kata[i], angka[i]);
        }

        sc.close();
    }
}
