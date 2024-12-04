package Tubes;
import java.util.Scanner;

public class prestasi2 {
    static int Max_prestasi = 1000;
    static String[][] dataPrestasi = new String[Max_prestasi][4]; 
    static int[] tahunPrestasi = new int[Max_prestasi];
    static int jumlahPrestasi = 0;
    static  Scanner sc = new Scanner(System.in);
    

    static void tampilkanMenu() {
        System.out.println("\n== PENCATATAN PRESTASI MAHASISWA ==");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");
       
        
    }

    static void tambahDataPrestasi() {

        String nama, nim, jenis, tingkat;
        int tahun;
        
        if (jumlahPrestasi >= Max_prestasi) {
            System.out.println("Data prestasi penuh!");
            return;

        } else { 
           System.out.print("Masukkan Nama Mahasiswa: ");
           nama = sc.nextLine();
           System.out.print("Masukkan NIM Mahasiswa: ");
           nim = sc.nextLine();
           System.out.print("Masukkan Jenis Prestasi: ");
           jenis = sc.nextLine();
        }

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
        int i,j;
        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
            return;

        } else {
            System.out.println("\n== DAFTAR SEMUA PRESTASI ==");
            for (i = 0; i < jumlahPrestasi; i++) {
                for (j = 0; j < 4; j++) {
                    switch (j) {
                        case 0:
                            System.out.print("Nama: " + dataPrestasi[i][j] + " | ");
                            break;
                        case 1:
                            System.out.print("NIM: " + dataPrestasi[i][j] + " | ");
                            break;
                        case 2:
                            System.out.print("Jenis: " + dataPrestasi[i][j] + " | " );
                            break;
                        case 3:
                            System.out.print("Tingkat: " + dataPrestasi[i][j] + " | ");
                            break;
                    }
                    
                }         
                System.out.println("Tahun: " + tahunPrestasi[i]);
                
            }
            
        }

       
    }

    static void analisisPrestasi() {
        String jenisAnalisis;
        boolean ditemukan = false;

        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
            return;

        } else {
            System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
           jenisAnalisis = sc.nextLine();   

            System.out.println("\n== ANALISIS PRESTASI ==");
            for (int i = 0; i < jumlahPrestasi; i++) {
                if (dataPrestasi[i][2].equalsIgnoreCase(jenisAnalisis)) {
                    System.out.println("Nama: " + dataPrestasi[i][0] + " | " 
                                        + "NIM: " + dataPrestasi[i][1] + " | "
                                        + "Tingkat: " + dataPrestasi[i][3] + " | " 
                                        +  "Tahun: " + tahunPrestasi[i]);              
                    ditemukan = true;
            }

            if (!ditemukan) {
                System.out.println("Tidak ada data prestasi dengan jenis tersebut.");
            }
        }
    }
}
        
    

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahDataPrestasi();
                    break;
                case 2:
                    tampilkanSemuaPrestasi();
                    break;
                case 3:
                    analisisPrestasi();
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (pilihan != 4);

        sc.close();
    }
}
