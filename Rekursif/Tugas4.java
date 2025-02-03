package Rekursif;
import java.util.Scanner;

public class Tugas4 {
    public static int jumlahPasanganMarmut(int bulan) {
        if (bulan <= 1) {
            return bulan;
        } else {
            return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke : ");
        int bulanInput = sc.nextInt();
        int totalPasangan = jumlahPasanganMarmut(bulanInput);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulanInput + " adalah " + totalPasangan + " pasangan");

        sc.close();
    }
}