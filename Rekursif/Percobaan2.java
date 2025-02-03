package Rekursif;
import java.util.Scanner;

public class Percobaan2 {

    static int hitungpangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(x + "x");
            return x * hitungpangkat(x, y - 1);
        }
    }

    static int hitungpangkatWithPrint(int x, int y) {
        int result = hitungpangkat(x, y);
        System.out.println(" = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int Pangkat = sc.nextInt();

        hitungpangkatWithPrint(bilangan, Pangkat);

        sc.close();
    }
}
