package GradeRepair;
import java.util.Scanner;

public class T3_KPK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();

        int max;
        if (bil1 > bil2) {
            max = bil1;
        } else {
            max = bil2;
        }
        
        int kpk = max;
        while (true) {
            if (kpk % bil1 == 0 && kpk % bil2 == 0) {
                break;
            }
            kpk += max;
        }

        System.out.println("KPK dari " + bil1 + " dan " + bil2 + " adalah: " + kpk);

        sc.close();
    }
}
