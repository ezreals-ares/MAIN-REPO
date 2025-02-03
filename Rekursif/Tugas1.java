package Rekursif;

import java.util.Scanner;

public class Tugas1 {

    static void tampilkanrekursif(int n) {
        if (n < 0) {
            return;
        } else {
            System.out.print(n + " ");
            tampilkanrekursif(n - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Deret bilangan dari " + n + " samppai 0 (Rekursif): ");
        tampilkanrekursif(n);

        sc.close();
    }


}