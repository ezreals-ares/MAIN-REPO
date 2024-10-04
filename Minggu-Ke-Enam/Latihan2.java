import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diskon = 0;
        String jenisBuku;
        int jumlah;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlah = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlah < 2 && jumlah > 0) {
                diskon = 0.1;
            } else if (jumlah > 2) {
                diskon = 0.12;
            } else {
                System.out.println("jumlah tidak valid");
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlah < 3 && jumlah > 0) {
                diskon = 0.7;
            } else if (jumlah <= 3) {
                diskon = 0.8;
            } else if (jumlah > 3) {
                diskon = 0.9;
            }
        } else if ((jenisBuku != "kamus") && (jenisBuku != "novel")) {
            if (jumlah < 3 && jumlah > 0)  {
                diskon = 0.5;
            } else if (jumlah < 3){
                diskon = 0;
            } else {
                System.out.println("jumlah tidak valid");
            }
           

        }
        System.out.println("Diskon yang anda dapatkan adalah : " + diskon);
        sc.close();
    }
    
}
