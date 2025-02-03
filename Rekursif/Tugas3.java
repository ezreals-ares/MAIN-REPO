package Rekursif;

import java.util.Scanner;

public class Tugas3 {

    static boolean cekprima(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return cekprima(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        if (cekprima(n, 2)) {
            System.out.println(n + " adalah bilangan prima");

        } else {
            System.out.println(n + " bukan bilangan prima");
        }
        sc.close();
    }
}