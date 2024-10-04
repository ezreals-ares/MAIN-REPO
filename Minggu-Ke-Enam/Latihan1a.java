import java.util.Scanner;
public class Latihan1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            double bil1, bil2, bil3;

            System.out.print("Masukkan Bilangan 1 : ");
            bil1 = sc.nextDouble();

            System.out.print("Masukkan Bilangan 2 : ");
            bil2 = sc.nextDouble();

            System.out.print("Masukkan Bilangan 3 : ");
            bil3 = sc.nextDouble();

            if (bil1 > bil2) {
                if (bil1 > bil3) {
                    System.out.println("Bilangan 1 adalah bilangan terbesar");
                } else {
                    System.out.println("Bilangan 3 adalah bilangan terbesar");
                }
            } else if (bil2 > bil3) {
                System.out.println("Bilangan 2 adalah bilangan terbesar");
            } else {
                System.out.println("Bilangan 3 adalah bilangan terbesar");
            }
            sc.close();

        }
    }
}
