package Event;

import java.util.Scanner;

public class latihanquiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan baris matriks pertama: ");
        int baris1 = sc.nextInt();
        System.out.print("Masukkann kolom matriks pertama: ");
        int kolom1 = sc.nextInt();
        System.out.print("Masukkan baris matriks kedua: ");
        int baris2 = sc.nextInt();
        System.out.print("Masukkan kolom matriks kedua: ");
        int kolom2 = sc.nextInt();

        if (kolom1 != baris2) {
            System.out.println("Matriks tidak dapat dikalikan");
            sc.close();
            return;
        }

        System.out.println("Masukkan elemen matriks pertama: ");
        int[][] matriks1 = new int[baris1][kolom1];
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom1; j++) {
                System.out.print("Elemen " + "[" + i + "]" + "[" + j + "]" + "= ");
                matriks1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks kedua: ");
        int[][] matriks2 = new int[baris2][kolom2];
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print("Elemen " + "[" + i + "]" + "[" + j + "]" + "= ");
                matriks2[i][j] = sc.nextInt();
            }
        }

        int[][] hasil = new int[baris1][kolom2];
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                for (int k = 0; k < baris2; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                    
                }
                
            }
            
        }

        System.out.println("Hasil perkalian matriks: ");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print(hasil[i][j] + " ");
                
            }
            System.out.println();
            
        }
        sc.close();

        
    }
}