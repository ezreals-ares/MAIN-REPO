package Tubes;
import java.util.Scanner;

public class prestasi {
    static int max_Prestasi = 1000;
    static String[][] dataPrestasi = new String[max_Prestasi][4];
    static int [] tahun_Prestasi = new int[max_Prestasi];
    static int data_Mhs = 0;
    static Scanner sc = new Scanner(System.in);
    

    static void tampilkanMenu() {
        System.out.println("\n== PENCATATAN PRESTASI MAHASISWA ==");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi");
        System.out.println("4. Keluar");
       
    }

    static void tambahDataPrestasi() {

        String nama, nim, jenis, tingkat;
        int tahun;
        
        if (data_Mhs >= max_Prestasi) {
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
        
        dataPrestasi[data_Mhs][0] = nama;
        dataPrestasi[data_Mhs][1] = nim;
        dataPrestasi[data_Mhs][2] = jenis;
        dataPrestasi[data_Mhs][3] = tingkat;
        tahun_Prestasi[data_Mhs] = tahun;

        data_Mhs++;
        System.out.println("Data prestasi berhasil ditambahkan.");
    }

    static void tampilkanSemuaPrestasi() {
        int i,j;
        if (data_Mhs == 0) {
            System.out.println("Belum ada data prestasi.");
            return;

        } else {
            System.out.println("\n== DAFTAR SEMUA PRESTASI ==");
            for (i = 0; i < data_Mhs; i++) {
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
                System.out.println("Tahun: " + tahun_Prestasi[i]);      
                
            }
            
        }

    }

    static void analisisPrestasi() {
        String analisis_Jenis;
        int analisis_Tahun;
        boolean ditemukan = false;
       
    
        if (data_Mhs == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }
    
        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
        analisis_Jenis = sc.nextLine();
        System.out.print("Masukkan Tahun Prestasi yang ingin dianalisis: ");
        analisis_Tahun = sc.nextInt();

        System.out.println("\n== ANALISIS PRESTASI BERDASARKAN JENIS & TAHUN ==");
        for (int i = 0; i < data_Mhs; i++) {
            if (dataPrestasi[i][2].equalsIgnoreCase(analisis_Jenis)) {
                if(analisis_Tahun == tahun_Prestasi[i]) {
                    for (int j = 0; j < 5; j++) {
                        switch (j) {
                            case 0:
                                System.out.print("Nama: " + dataPrestasi[i][j] + " | ");
                                break;
                            case 1:
                                System.out.print("NIM: " + dataPrestasi[i][j] + " | ");
                                break;
                            case 2:
                                System.out.print("Jenis: " + dataPrestasi[i][j] + " | ");
                                break;
                            case 3:
                                System.out.print("Tingkat: " + dataPrestasi[i][j] + " | ");
                                break;
                        }
                    }
                    System.out.println("Tahun: " + tahun_Prestasi[i]);
                    ditemukan = true;

                }
                
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada data prestasi dengan Jenis dan Tahun tersebut.");
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
