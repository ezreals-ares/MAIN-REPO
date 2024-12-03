package Tubes;
import java.util.Scanner;

public class prestasi2 {
    static int Max_prestasi = 100;
    static String[][] dataPrestasi = new String[Max_prestasi][4]; 
    static int[] tahunPrestasi = new int[Max_prestasi];
    static int jumlahPrestasi = 0;
    static Scanner sc = new Scanner(System.in);

    static void tampilkanMenu() {
        System.out.println("\n== PENCATATAN PRESTASI MAHASISWA ==\n");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");
    }

    static void tambahDataPrestasi(Scanner sc) {

        String nama, nim, jenis, tingkat;
        int tahun;
        
        if (jumlahPrestasi >= Max_prestasi) {
            System.out.println("Data prestasi penuh!");
            return;
        }

        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        jenis = sc.nextLine();
       
        
        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkat = sc.nextLine();

            if (tingkat.equalsIgnoreCase("Lokal") || tingkat.equalsIgnoreCase("Nasional") || tingkat.equalsIgnoreCase("Internasional")) {
                break;
            } else {
                System.out.println("Tingkat prestasi tidak valid. Coba lagi.");
                
            }
        }
        
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010-2024): ");
            tahun = sc.nextInt();
            sc.nextLine();
            if (tahun >= 2010 && tahun <= 2024) {
                break;
            } else {
                System.out.println("Tahun tidak valid. Coba lagi.");
            }
        }

        dataPrestasi[jumlahPrestasi][0] = nama;
        dataPrestasi[jumlahPrestasi][1] = nim;
        dataPrestasi[jumlahPrestasi][2] = jenis;
        dataPrestasi[jumlahPrestasi][3] = tingkat;
        tahunPrestasi[jumlahPrestasi] = tahun;

        jumlahPrestasi++;
        System.out.println("Data prestasi berhasil ditambahkan.");
    }

    static void tampilkanSemuaPrestasi() {
        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }

        System.out.println("\n== DAFTAR SEMUA PRESTASI == \n");
        for (int i = 0; i < jumlahPrestasi; i++) {
            System.out.println("Nama: " + dataPrestasi[i][0] + " | " 
                                    + "NIM: " + dataPrestasi[i][1] + " | "
                                    + "Jenis: " + dataPrestasi[i][2] + " | " 
                                    +  "Tingkat: " + dataPrestasi[i][3] + " | "
                                    + "Tahun: " + tahunPrestasi[i]);
        }
    }

    static void analisisPrestasi(Scanner sc) {
        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }

        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
        String jenisAnalisis = sc.nextLine();

        System.out.println("\n== ANALISIS PRESTASI ==\n");
        boolean ditemukan = false;
        for (int i = 0; i < jumlahPrestasi; i++) {
            if (dataPrestasi[i][2].equalsIgnoreCase(jenisAnalisis)) {
                System.out.println("Nama: " + dataPrestasi[i][0] + " | " 
                                    + "NIM: " + dataPrestasi[i][1] + " | "
                                    + "Tingkat: " + dataPrestasi[i][3] + " | " 
                                    +  "Tahun: " + tahunPrestasi[i]);              
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada data prestasi dengan jenis tersebut.");
        }
    }

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahDataPrestasi(sc);
                    break;
                case 2:
                    tampilkanSemuaPrestasi();
                    break;
                case 3:
                    analisisPrestasi(sc);
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
