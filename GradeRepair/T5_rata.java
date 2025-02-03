package GradeRepair;

import java.util.Scanner;

public class T5_rata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai_mhs = new int [3][5];
        double[] rataRata = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan Nilai untuk Mahasiswa ke-" + (i + 1) + ": ");
            int total = 0;

            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan Nilai ke-" + (j + 1) + ": ");
                nilai_mhs[i][j] = sc.nextInt();
                total += nilai_mhs[i][j];
            }

            rataRata[i] = total / 5.0;
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Rata-rata nilai mahasiswa ke-" + (i + 1) + ": %.1f\n", rataRata[i]);
            
        }

        sc.close();
    }
}