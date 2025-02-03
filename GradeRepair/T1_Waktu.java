package GradeRepair;

import java.util.Scanner;

public class T1_Waktu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int detik_awal, jam, menit, sisa_detik, sisa_detik_last; 

        System.out.print("Masukkan waktu dalam detik: ");
        detik_awal = sc.nextInt();

        jam = detik_awal / 3600;
        sisa_detik = detik_awal % 3600;

        menit = sisa_detik / 60;
        sisa_detik_last = sisa_detik % 60;

        System.out.println("Hasil konversnya adalah " + jam + " jam " + menit + " menit " + sisa_detik_last + " detik");

        sc.close();


    }
}