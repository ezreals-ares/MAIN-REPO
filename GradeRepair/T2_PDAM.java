package GradeRepair;

import java.util.Scanner;

public class T2_PDAM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meter_kubik, total_harga = 0;
        System.out.print("Masukkan jumlah meter kubik air PDAM yang digunakan : ");
        meter_kubik = sc.nextInt();

        if (meter_kubik <= 50) {
            total_harga = meter_kubik * 1000;
        } else if (meter_kubik <= 100) {
            total_harga = 50 * 1000 + (meter_kubik - 50) * 1500;
        } else if (meter_kubik <= 150) {
            total_harga = (50 * 1000) + (50 * 1500) + (meter_kubik - 100) * 2000;
        } else {
            total_harga = (50 * 1000) + (50 * 1500) + (50 * 2000) + (meter_kubik - 150) * 3000;
        }

        System.out.println("Harga total yang harus dibayar adalah : " + "Rp "+ total_harga);
        sc.close();
    }
}   