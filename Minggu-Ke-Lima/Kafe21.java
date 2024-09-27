import java.util.Scanner;
public class Kafe21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        double hargaMenu = 0;

        System.out.print("Masukkan menu : ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup : ");
        ukuranCup = sc.nextLine().charAt(0);
        System.out.print("Masukkan jumlah : ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan Keanggotaan (True/False) : ");
        keanggotaan = sc.nextBoolean();

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
        }
        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default :
                System.out.println("Ukuran yang anda masukkan tidak tersedia");
                break;
        }
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalbayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item Pembelian " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar " + nominalbayar);
        sc.close();
    } 
}