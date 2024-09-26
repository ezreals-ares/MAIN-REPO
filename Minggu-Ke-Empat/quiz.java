import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        // Menentukan Tipe data dan nama variabel
        double jmlhBeras;
        double totalPembagianBeras;
        int jmlhDesa;
        int jmlhKeluarga;
        int jmlhTotalKeluarga;

        // Menentukan nama variabel Scanner
        Scanner sc = new Scanner(System.in);

        // Mengambil input dari user
        System.out.print("Masukkan jumlah Beras (Kwintal) : ");
        jmlhBeras = sc.nextInt();

        System.out.print("Masukkan jumlah keluarga : ");
        jmlhKeluarga = sc.nextInt();

        System.out.print("Masukkan jumlah Desa : ");
        jmlhDesa = sc.nextInt();

        // Melakukan operasi aritmatika
        jmlhTotalKeluarga = jmlhDesa * jmlhKeluarga;
        totalPembagianBeras = jmlhBeras / jmlhTotalKeluarga;

        // Menampilkan hasil
        System.out.println("Total pembagian tiap keluarga adalah : " + totalPembagianBeras + " Kwintal");
        sc.close();




    
    }
    
}
