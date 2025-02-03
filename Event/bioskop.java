package Event;

import java.util.Scanner;

public class bioskop {
    static Scanner sc = new Scanner(System.in);
    static int stok1 = 50, stok2 = 40, stok3 = 20;
    static double total = 0;
    static int HargaT1 = 40000, HargaT2 = 20000, HargaT3 = 60000;
    static int idx1 = 0, idx2 = 0, idx3 = 0;

    static void tampilMenu() {
        System.out.println("\n=== Sistem Penjualan Tiket Bioskop ===");
        System.out.println("1. Tampilkan daftar Tiket");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Lihat Total Pendapatan");
        System.out.println("4. Keluar");
    }

    static void tampildaftar() {
        System.out.println("\n== Daftar Tiket ==");
        System.out.println("No \t Nama Film \t Harga \t \t Stok");
        System.out.println("1. \t Lion \t \t\sRp40.000 \t " + stok1);
        System.out.println("2. \t Kamis \t \t\sRp20.000 \t " + stok2);
        System.out.println("3. \t Home \t \t\sRp60.000 \t " + stok3);
    }

    static void pembelian () {
        int beliTiket;
        int pilihanBeli;
        String lanjut;
        do {
            System.out.print("Pilih tiket yang ingin anda beli: ");
            pilihanBeli = sc.nextInt();
            sc.nextLine();
            switch (pilihanBeli) {
                case 1:
                    System.out.print("Berapa banyak yang ingin anda beli: ");
                    beliTiket = sc.nextInt();
                    sc.nextLine();

                    if (beliTiket <= stok1) {
                        hitungTotalHarga(1, beliTiket, HargaT1);
                        idx1 += beliTiket;
                    } else {
                        System.out.println("Stok tidak mencukupi!");
                    }

                    break;

                case 2:
                    System.out.print("Berapa banyak yang ingin anda beli: ");
                    beliTiket = sc.nextInt();
                    sc.nextLine();

                    if (beliTiket <= stok2) {
                        hitungTotalHarga(2, beliTiket, HargaT1);
                        idx2 += beliTiket;
                    } else {
                        System.out.println("Stok tidak mencukupi!");
                    }
                    
                    break;

                case 3:
                    System.out.print("Berapa banyak yang ingin anda beli: ");
                    beliTiket = sc.nextInt();
                    sc.nextLine();

                    if (beliTiket <= stok3) {
                        hitungTotalHarga(3, beliTiket, HargaT1);
                        idx3 += beliTiket;
                    } else {    
                        System.out.println("Stok tidak mencukupi!");
                    }
                    
                    break;

                default:
                    System.out.println("Menu tidak ada, masukan lagi!");
                    break;
            }

            System.out.print("\nApakah anda ingin Melanjutkan Pembelian? (y/t): ");
            lanjut = sc.nextLine();
            
            if (lanjut.equalsIgnoreCase("t")) {
                System.out.println("Kembali ke menu utama");
            }

        } while(lanjut.equalsIgnoreCase("y"));
    }

    static void hitungTotalHarga(int jenisTiket, int beliTiket, int hargaT) {
        switch (jenisTiket) {
            case 1:
                stok1 -= beliTiket;
                break;  
            case 2:
                stok2 -= beliTiket;
                break;
            case 3:
                stok3 -= beliTiket;
                break;
        }
        double subTotal = beliTiket * hargaT;
        total += subTotal;
        System.out.println("\n== Struk Pembelian ==");
        System.out.printf("Harga Tiket: %d\n", hargaT);
        System.out.printf("Total Jumlah Pembelian: %d\n", beliTiket);
        System.out.printf("Total Harga Pembelian: Rp%,.2f\n", subTotal);
    }

    static void tampilPendapatan() {
        System.out.println("\n== Pendapatan ==");
        System.out.printf("Total Pendapatan Sebesar Rp%,.2f\n", total);
        System.out.printf("\nDengan Penjualan tiket 1 sebanyak: %d buah\n", idx1);
        System.out.printf("Dengan Penjualan tiket 2 sebanyak: %d buah\n", idx2);
        System.out.printf("Dengan Penjualan tiket 3 sebanyak: %d buah\n", idx3);
        System.out.printf("\nDengan Stok tiket 1 tersisa sebanyak: %d pcs\n", stok1);
        System.out.printf("Dengan Stok tiket 2 tersisa sebanyak: %d pcs\n", stok2);
        System.out.printf("Dengan Stok tiket 3 tersisa sebanyak: %d pcs\n", stok3);

    }

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilMenu();
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tampildaftar();
                    break;

                case 2:
                    pembelian();
                    break;

                case 3:
                    tampilPendapatan();
                    break;

                case 4:
                    System.out.println("Keluar dari program!");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
                    break;
            }
        
        } while(pilihan != 4);
        
    }
}