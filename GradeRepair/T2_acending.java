package GradeRepair;

import java.util.Scanner;

public class T2_acending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil_1, bil_2, bil_3;

        System.out.print("Masukkan Bilangan Pertama: ");
        bil_1 = sc.nextInt();

        System.out.print("Masukkan Bilangan Kedua: ");
        bil_2 = sc.nextInt();

        System.out.print("Masukkan Bilangan Ketiga: ");
        bil_3 = sc.nextInt();

        if (bil_1 <= bil_2 && bil_1 <= bil_3 && bil_2 <= bil_3) {
            System.out.printf("Bilangan Ascending adalah: %d %d %d", bil_1, bil_2, bil_3);
           
        } else if (bil_1 <= bil_2 && bil_1 <= bil_3 && bil_3 <= bil_2) {
            System.out.printf("Bilangan Ascending adalah: %d %d %d", bil_1, bil_3, bil_2);
           
        } else if (bil_2 <= bil_1 && bil_2 <= bil_3 && bil_1 <= bil_3) {
            System.out.printf("Bilangan Ascending adalah: %d %d %d", bil_2, bil_1, bil_3);
            
        } else if (bil_2 <= bil_1 && bil_2 <= bil_3 && bil_3 <= bil_1) {
            System.out.printf("Bilangan Ascending adalah: %d %d %d", bil_2, bil_3, bil_1);

        } else if (bil_3 <= bil_1 && bil_3 <= bil_2 && bil_2 <= bil_1) {
            System.out.printf("Bilangan Ascending adalah: %d %d %d", bil_3, bil_1, bil_2);

        } else {
            System.out.printf("Bilangan Ascending adalah: %d %d %d", bil_3, bil_2, bil_1);
        }

        sc.close();
    }
}