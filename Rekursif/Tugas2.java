package Rekursif;

import java.util.Scanner;

public class Tugas2{

    static int penjumlahanRekursif(int f) {
        if (f <= 0) {
            return 0;
        } else {
            return f + penjumlahanRekursif(f - 1);
        }
    }

    static String prosesPenjumlahan(int f) {
        if (f == 1) {
            return "1";
        } else {
            return prosesPenjumlahan(f - 1) + "+" + f;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        String proses = prosesPenjumlahan(f);
        int hasil = penjumlahanRekursif(f);

        System.out.println(proses + " = " + hasil);

        sc.close();
    }
}
