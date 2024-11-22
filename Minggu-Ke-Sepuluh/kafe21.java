import java.util.Scanner;

public class kafe21 {

    public static int hitungTotalHarga(int totalHarga, String kodePromo, boolean isMember) {

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga = totalHarga / 2; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga = totalHarga - (totalHarga * 30 / 100); 
        } else {
            System.out.println("Kode promo yang anda masukkan tidak berlaku, tidak ada diskon yang diterapkan.");
        }

        if (isMember) {
            totalHarga = totalHarga - (totalHarga * 10 / 100); 
        }

        return totalHarga;
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        int totalHarga = 0;
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        boolean selesai = false;

        while (!selesai) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();

            totalHarga += hargaItems[pilihMenu - 1] * banyakItem;

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                selesai = true;
            }
        }

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        totalHarga = hitungTotalHarga(totalHarga, kodePromo, true);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
        sc.close();
    }
}
