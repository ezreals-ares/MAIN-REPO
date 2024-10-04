import java.util.Scanner;
public class Latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        String merk;
        String kategori;
        byte ukuran;
        double harga = 0;
        
        System.out.print("Masukan Merk: ");
        merk  = sc.nextLine();
        System.out.print("Masukan kategori: ");
        kategori = sc.nextLine();
        System.out.print("Masukan ukuran: ");
        ukuran = sc.nextByte();

        if (merk.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran == 36) {
                    harga = 800000;
                } else if (ukuran == 37) {
                    harga =  800000;
                } else if (ukuran == 38) {
                    harga =  800000;
                } else if (ukuran == 39) {
                    harga =  800000;
                } else if (ukuran == 40) {
                    harga =  800000;
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran == 40) {
                    harga = 1200000;
                } else if (ukuran == 41) {
                    harga = 1200000;
                } else if (ukuran == 42) {
                    harga = 1200000;
                } else if (ukuran == 43) {
                    harga = 1200000;
                } else if (ukuran == 44) {
                    harga = 1200000;
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else {
                System.out.println("kategori tidakk tersedia");
            }
    
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran == 36) {
                    harga = 1000000;
                } else if (ukuran == 37) {
                    harga = 1000000;
                } else if (ukuran == 38) {
                    harga = 1000000;
                } else if (ukuran == 39) {
                    harga = 1000000;
                } else if (ukuran == 40) {
                    harga =  1000000;
                } else if (ukuran == 41) {
                    harga =  1000000;
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
                
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran == 41) {
                    harga = 1800000;
                } else if (ukuran == 42) {
                    harga = 1800000;
                } else if (ukuran == 43) {
                    harga = 1800000;
                } else if (ukuran == 44) {
                    harga = 1800000;
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
            
        } else if (kategori.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran == 36) {
                    harga = 750000;
                } else if (ukuran == 37) {
                    harga = 750000;
                } else if (ukuran == 38) {
                    harga = 750000;
                } else if (ukuran == 39) {
                    harga = 750000;
                } else if (ukuran == 40) {
                    harga = 750000;
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
                
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran == 40) {
                    harga = 1500000;
                } else if (ukuran == 41) {
                    harga = 1500000;
                } else if (ukuran == 42) {
                    harga = 1500000;
                } else if (ukuran == 43) {
                    harga = 1500000;
                } else if(ukuran == 40) {
                    harga = 1500000;
                } else {
                    System.out.println("Ukuran Tidak Tersedia"); 
                }
               
            
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else {
            System.out.println("merk tidak tersedia");
        }
        System.out.println("Total harga adalah : " + harga);
        sc.close();
    }
}