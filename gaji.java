import java.util.Scanner;

public class gaji {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan jumlah angka: ");
        int angka = sc.nextInt();
        
        int[] a = new int[angka];
        System.out.println("Masukkan " + angka + " angka");
       

        // Meminta input pengguna untuk setiap elemen array
        for (int i = 0; i < a.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Menampilkan array yang dimasukkan
        System.out.println("\nArray yang Anda masukkan:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}