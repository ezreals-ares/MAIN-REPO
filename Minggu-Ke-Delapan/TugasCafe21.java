import java.util.Scanner;

public class TugasCafe21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan makanan yang anda cari : ");
        String namaMakanan = sc.nextLine();

        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(namaMakanan)) {
                ditemukan = true;
                break;
            }
            
        }

        if (ditemukan) {
            System.out.println("Makanan " + namaMakanan + " ditemukan");
        } else {
            System.out.println("Makanan " + namaMakanan + " tidak ditemukan");
        }

        sc.close();
    }
}