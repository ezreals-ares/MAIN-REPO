// Nama : Nawaf Azril Annaufal
// NIM : 244107020047
// Kelas : TI 1E
// Absen : 21

package Event;

import java.util.Scanner;

public class UASTI1E21 {
    static Scanner sc = new Scanner(System.in);
    static int jumlahTim21 = (47 % 3) + 4;
    static String[] namaTim21;
    static int[][] skorTim21;
    static int[] totalSkor21;

    static void tampilMenu21() {
        System.out.println("\n== MENU UTAMA ==");
        System.out.println("1. Input Data Skor Tim");
        System.out.println("2. Tampilkan Tabel Skor");
        System.out.println("3. Tentukan Juara");
        System.out.println("4. Keluar");
    }

    static void inputSkorTim21() {
        namaTim21 = new String[jumlahTim21];
        skorTim21 = new int[jumlahTim21][2];
        totalSkor21 = new int[jumlahTim21];

        for (int i = 0; i < jumlahTim21; i++) {
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            namaTim21[i] = sc.nextLine();

            for (int level21 = 0; level21 < 2; level21++) {
                System.out.print("Masukkan skor " + namaTim21[i] + " untuk Level " + (level21 + 1) + ": ");
                skorTim21[i][level21] = sc.nextInt();

                if (skorTim21[i][level21] < 0) {
                    System.out.println("Input tidak valid, coba lagi");
                    return;
                }

                if (skorTim21[i][0] < 35) {
                    skorTim21[i][0] = 0;
                }

                totalSkor21[i] += skorTim21[i][level21];
                
                

            }

            sc.nextLine(); 
        }
    }

    static void tampilSkor21() {
        for (int i = 0; i < jumlahTim21; i++) {
            if(skorTim21[i][0] % 2 == 0) {
                skorTim21[i][0] -= 15;
            }

            if(skorTim21[i][1] % 2 == 0) {
                skorTim21[i][1] -= 15;
            }

            if(skorTim21[i][1] < 50) {
                skorTim21[i][1] += 21;
            }
            
        }
        System.out.println("Nama Tim \t Level 1 \t Level 2 \t Total Skor");
        for (int i = 0; i < jumlahTim21; i++) {
            System.out.print(namaTim21[i] + " \t \t " + skorTim21[i][0] + " \t \t " + skorTim21[i][1] + " \t \t " + totalSkor21[i]);
            System.err.println();
        }
    }

    static void tentukanJuara21() {
        if (jumlahTim21 == 0) {
            System.out.println("Data Tim Belum Ada");
            return;
        }

        int maxSkor21 = totalSkor21[0];
        int indeksJuara21 = 0;

        for (int i = 1; i < jumlahTim21; i++) {
            if (totalSkor21[i] > maxSkor21) {
                maxSkor21 = totalSkor21[i];
                indeksJuara21 = i;
            }
        }

        System.out.println("Juara adalah: " + namaTim21[indeksJuara21] + " dengan total skor: " + maxSkor21);
        System.out.println("Selamat kepada tim yang menang!");
    }

    public static void main(String[] args) {
        int pilihmenu21;
        do {
            tampilMenu21();
            System.out.print("Pilih menu (1-4): ");
            pilihmenu21 = sc.nextInt();
            sc.nextLine(); 

            switch (pilihmenu21) {
                case 1:
                    inputSkorTim21();
                    break;
                case 2:
                    if (jumlahTim21 == 0) {
                        System.out.println("Data Tim Belum Ada");
                    } else {
                        tampilSkor21();
                    }
                    break;
                case 3:
                    tentukanJuara21();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid, Coba Lagi!");
                    break;
            }
        } while (pilihmenu21 != 4);
    }
}
