import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamkerja;
        int gaji;
        double totalDiskon = 0;
        int pegawaiCount = 1;
       
        while (true) {
            System.out.print("Pegawai ke-" + pegawaiCount + " : ");
            
            System.out.print("Masukkan jumlah jam kerja : ");
            jamkerja = sc.nextInt();
            
            if (jamkerja <= 0) {
                break;
            }

            System.out.print("Masukkan jumlah gaji kerja : ");
            gaji = sc.nextInt();

            double diskon = 0;
            if (jamkerja > 8) {
                diskon = 0.2 * gaji;
            } else {
                diskon = 0;
            }
            totalDiskon += diskon;
            pegawaiCount++;
        }
        
        System.out.println("Total diskon: " + totalDiskon);
        sc.close();
    }
}
