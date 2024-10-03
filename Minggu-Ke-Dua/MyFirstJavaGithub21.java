import java.util.Scanner;
public class MyFirstJavaGithub21 {

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
                    System.out.println("Produk Tidak Tersedia" + harga);
                }
                sc.close();
            }
    
        }

    }
}