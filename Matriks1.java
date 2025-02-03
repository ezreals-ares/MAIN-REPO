import java.util.Scanner;

public class Matriks1 {

    static int baris, kolom;
    static int i, j, k;
    static Scanner sc = new Scanner(System.in);

    static void tampilMenu() {
        System.out.println("\n|===================================|");
        System.out.println("|========= OPERASI MATRIKS =========|");
        System.out.println("|===================================|");
        System.out.println("| 1. Operasi (+) dan (-)            |");
        System.out.println("| 2. Operasi Kali (x) antar Matriks |");
        System.out.println("| 3. Menentukan Invers Matriks      |");
        System.out.println("| 4. Menentukan Transpose Matriks   |");
        System.out.println("| 5. keluar                         |");
        System.out.println("|===================================|\n");
    }

    static void operasiTambahKurang() {
        int pilihanTambahKurang;

        do {
            System.out.println("\n== OPERASI (+) DAN (-) ==");
            System.out.println("1. Operasi Tambah");
            System.out.println("2. Operasi Kurang");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihanTambahKurang = sc.nextInt();
            switch (pilihanTambahKurang) {
                case 1:
                    operasiTambah();
                    break;
                case 2:
                    operasiKurang();
                    break;
                case 3:
                    System.out.println("Kembali Ke Menu Utama");
                    return;
                default:
                    System.out.println("Pilihan Tidak Valid, Coba Lagi!");
                    break;
            }

        } while (pilihanTambahKurang != 3);
    }

    static void operasiTambah() {
        boolean valid = false;
        double[][] matriks_1;
        double[][] matriks_2;
        double[][] result;

        do {
            System.out.print("Masukkan jumlah Baris untuk kedua Matriks: ");
            baris = sc.nextInt();
            System.out.print("Masukkan jumlah Kolom untuk kedua Matriks: ");
            kolom = sc.nextInt();

            if (baris <= 0 || kolom <= 0) {
                System.out.println("Matriks tidak valid, coba lagi!");
                continue;
            }

            matriks_1 = new double[baris][kolom];
            matriks_2 = new double[baris][kolom];
            result = new double[baris][kolom];

            System.out.println("\nMasukkan elemen matriks pertama: ");
            inputElemenMatriks(matriks_1, baris, kolom);

            System.out.println("\nMasukkan elemen matriks kedua: ");
            inputElemenMatriks(matriks_2, baris, kolom);

            for (i = 0; i < baris; i++) {
                for (j = 0; j < kolom; j++) {
                    result[i][j] = matriks_1[i][j] + matriks_2[i][j];
                }
            }

            System.out.println("\nTampil Matriks 1 Asli\n");
            tampilMatriks(matriks_1, baris, kolom);

            System.out.println("\nTampil Matriks 2 Asli\n");
            tampilMatriks(matriks_2, baris, kolom);

            System.out.println("\nHasil Operasi Tambah\n");
            tampilMatriks(result, baris, kolom);
            valid = true;

        } while (!valid);

    }

    static void operasiKurang() {
        boolean valid = false;
        double[][] matriks_1;
        double[][] matriks_2; 
        double[][] result;
        do {
            System.out.print("Masukkan jumlah Baris untuk kedua Matriks: ");
            baris = sc.nextInt();
            System.out.print("Masukkan jumlah Kolom untuk kedua Matriks: ");
            kolom = sc.nextInt();

            if (baris <= 0 || kolom <= 0) {
                System.out.println("Matriks tidak valid, coba lagi!");
                continue;
            }

            matriks_1 = new double[baris][kolom];
            matriks_2 = new double[baris][kolom];
            result = new double[baris][kolom];

            System.out.println("\nMasukkan elemen matriks pertama: ");
            inputElemenMatriks(matriks_1, baris, kolom);

            System.out.println("\nMasukkan elemen matriks kedua: ");
            inputElemenMatriks(matriks_2, baris, kolom);

            for (i = 0; i < baris; i++) {
                for (j = 0; j < kolom; j++) {
                    result[i][j] = matriks_1[i][j] - matriks_2[i][j];
                }
            }

            System.out.println("\nTampil Matriks 1 Asli\n");
            tampilMatriks(matriks_1, baris, kolom);

            System.out.println("\nTampil Matriks 2 Asli\n");
            tampilMatriks(matriks_2, baris, kolom);

            System.out.println("\nHasil Operasi Kurang\n");
            tampilMatriks(result, baris, kolom);
            valid = true;

        } while (!valid);
    }


    static void operasiPerkalian() {
        boolean valid = false;
        int baris1, baris2, kolom1, kolom2;
        double[][] matriks1;
        double[][] matriks2;
        double[][] result;

        do {
            System.out.print("Masukkan baris matriks pertama: ");
            baris1 = sc.nextInt();
            System.out.print("Masukkan kolom matriks pertama: ");
            kolom1 = sc.nextInt();
            System.out.print("Masukkan baris matriks kedua: ");
            baris2 = sc.nextInt();
            System.out.print("Masukkan kolom matriks kedua: ");
            kolom2 = sc.nextInt();

            if (baris1 <= 0 || kolom1 <= 0 || baris2 <= 0 || kolom2 <= 0) {
                System.out.println("Matriks tidak valid, coba lagi!");
                continue;
            }
            if (kolom1 != baris2) {
                System.out.println("Matriks tidak dapat dikalikan, coba lagi!");
                continue;
            }

            System.out.println("\nMasukkan elemen matriks pertama: ");
            matriks1 = new double[baris1][kolom1];
            inputElemenMatriks(matriks1, baris1, kolom1);

            System.out.println("\nMasukkan elemen matriks kedua: ");
            matriks2 = new double[baris2][kolom2];   
            inputElemenMatriks(matriks2, baris2, kolom2);

            result = new double[baris1][kolom2];
            for (i = 0; i < baris1; i++) {
                for (j = 0; j < kolom2; j++) {
                    for (k = 0; k < baris2; k++) {
                        result[i][j] += matriks1[i][k] * matriks2[k][j];
                    }
                }
            }
            System.out.println("\nTampil Matriks 1 Asli\n");
            tampilMatriks(matriks1, baris1, kolom1);

            System.out.println("\nTampil Matriks 2 Asli\n");
            tampilMatriks(matriks2, baris2, kolom2);

            System.out.println("\nHasil Perkalian Matriks\n");
            tampilMatriks(result, baris1, kolom2);

            valid = true;

        } while (!valid);

    }

    static void transposeMatriks() {
        double[][] matriksAwal_Ts;
        double[][] transpose;
        boolean valid = false;

        do{
            System.out.print("Masukkan jumlah Baris Matriks: ");
            baris = sc.nextInt();
            System.out.print("Masukkan jumlah Kolom Matriks: ");
            kolom = sc.nextInt();

            if (baris <= 0 || kolom <= 0) {
                System.out.println("Matriks tidak valid, coba lagi!");
                continue;
            }

            matriksAwal_Ts = new double[baris][kolom];
            System.out.println("\nMasukkan Elemen Matriks: ");
            inputElemenMatriks(matriksAwal_Ts, baris, kolom);

            transpose = hitungTranspose(matriksAwal_Ts);

            System.out.println("\nMatriks Asli: \n");
            tampilMatriks(matriksAwal_Ts, baris, kolom);

            System.out.println("\nTranspose Matriks: \n");
            tampilMatriks(transpose, kolom, baris);

            valid = true;

        }while(!valid);

        
    }

    static double[][] hitungTranspose(double[][] matriks) {
        double[][] hasilTranspose = new double[kolom][baris];
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                hasilTranspose[j][i] = matriks[i][j];
            }
        }
        return hasilTranspose;
    }

    static void inversMatriks() {
        int pilihanivers;
        do {
            System.out.println("\n== INVERS MATRIKS ==");
            System.out.println("1. Invers 2x2");
            System.out.println("2. Invers 3x3");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihanivers = sc.nextInt();

            switch (pilihanivers) {
                case 1:
                    inversOrdo2();
                    break;
                case 2:
                    inversOrdo3();
                    break;
                case 3:
                    System.out.println("Kembali ke menu utama");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
                    break;
            }

        } while (pilihanivers != 3);
    }

    static void inversOrdo2() {
        boolean valid = false;
        double[][] matriksAwal_inv;
        baris = 2;
        kolom = 2;
        do {
            System.out.println("\nMasukkan Elemen-Elemen Matriks: ");
            matriksAwal_inv = new double[baris][kolom];
            inputElemenMatriks(matriksAwal_inv, baris, kolom);

            double determinant = matriksAwal_inv[0][0] * matriksAwal_inv[1][1] - matriksAwal_inv[0][1] * matriksAwal_inv[1][0];

            if (determinant != 0) {
                double[][] inverse = new double[2][2];
                inverse[0][0] = matriksAwal_inv[1][1] / determinant;
                inverse[0][1] = -matriksAwal_inv[0][1] / determinant;
                inverse[1][0] = -matriksAwal_inv[1][0] / determinant;
                inverse[1][1] = matriksAwal_inv[0][0] / determinant;

                System.out.println("\nTampil Matriks Asli\n");
                tampilMatriks(matriksAwal_inv, baris, kolom);

                System.out.println("\nHasil Invers Matriks\n");
                tampilMatriks(inverse, baris, kolom);

                valid = true;

            } else {
                System.out.println("Matriks tidak memiliki invers, coba lagi!");
                continue;
            }

        } while (!valid);

    }

    static void inversOrdo3() {
        double[][] matriks_inv3 = new double[3][3];
        double[][] kofaktor = new double[3][3];
        double[][] adjoint = new double[3][3];
        double[][] invers = new double[3][3];
        double determinant;
        int baris = 3;
        int kolom = 3;
    
        System.out.println("\nMasukkan elemen-elemen matriks 3x3:");
        inputElemenMatriks(matriks_inv3, baris, kolom);
    
        determinant = matriks_inv3[0][0] * (matriks_inv3[1][1] * matriks_inv3[2][2] - matriks_inv3[1][2] * matriks_inv3[2][1])
                     - matriks_inv3[0][1] * (matriks_inv3[1][0] * matriks_inv3[2][2] - matriks_inv3[1][2] * matriks_inv3[2][0])
                     + matriks_inv3[0][2] * (matriks_inv3[1][0] * matriks_inv3[2][1] - matriks_inv3[1][1] * matriks_inv3[2][0]);
        
        if (determinant == 0) {
            System.out.println("Matriks tidak memiliki invers (determinannya 0).");
            return;
        }
    
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                kofaktor[i][j] = ((matriks_inv3[(i+1)%3][(j+1)%3] * matriks_inv3[(i+2)%3][(j+2)%3]) 
                                  - (matriks_inv3[(i+1)%3][(j+2)%3] * matriks_inv3[(i+2)%3][(j+1)%3]));
            }
        }
    
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                adjoint[i][j] = kofaktor[j][i];
                adjoint[i][j] /= determinant;
                invers[i][j] = adjoint[i][j];
            }
        }

        System.out.println("\nTampil Matriks Asli\n");
        tampilMatriks(matriks_inv3, baris, kolom);
        System.out.println("\nMatriks Invers adalah:");
        tampilMatriks(invers, baris, kolom);
    }
    

    static void tampilMatriks(double[][] matriks, int baris, int kolom) {
        for (i = 0; i < baris; i++) {
            System.out.printf("| \t\t");
            for (j = 0; j < kolom; j++) {
                System.out.printf("%.1f \t", matriks[i][j]);
            }
            System.out.println("\t\s|");
        }
    }

    static void inputElemenMatriks(double[][] matriks, int baris, int kolom) {
        for (i = 0; i < baris; i++) {   
            for (j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = sc.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilMenu();
            System.out.print("Masukkan Pilihan: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    operasiTambahKurang();
                    break;

                case 2:
                    operasiPerkalian();
                    break;

                case 3:
                    inversMatriks();
                    break;

                case 4:
                    transposeMatriks();
                    break;

                case 5:
                    System.out.println("Keluar");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
                    break;
            }

        } while (pilihan != 5);
    }
}
