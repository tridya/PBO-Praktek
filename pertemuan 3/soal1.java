import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();
        System.out.println(kata);  

        
        String d [] = kata.split("[ ,',!,#,@,%]");
        System.out.println(d.length);
        for(String str : d)
        {
            System.out.println(str);
        }

    }
}
