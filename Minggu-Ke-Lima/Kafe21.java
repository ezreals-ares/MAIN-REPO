import java.util.Scanner;

public class Kafe21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        double hargaMenu = 0;

        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        ukuranCup = sc.nextLine().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan Keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        boolean menuValid = true;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu tidak tersedia");
                menuValid = false;
                break;
        }

        double totalHarga = hargaMenu * jumlah;
        boolean ukuranValid = true;
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Ukuran yang Anda masukkan tidak tersedia");
                ukuranValid = false;
                break;
        }

        if (menuValid && ukuranValid) {
            double diskon = keanggotaan ? 0.1 : 0;
            double nominalbayar = totalHarga - (diskon * totalHarga);

            System.out.println("\nItem Pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
            System.out.println("Nominal bayar: " + nominalbayar);
        }
        
        sc.close();
    }
}
