import java.util.Scanner;
public class MyFirstJavaGithub21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = scanner.nextInt();
        
        int[] angka = new int[jumlah];
        
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            angka[i] = scanner.nextInt();
        }
        
        System.out.println("\nHasil penentuan genap dan ganjil:");
        for (int i = 0; i < jumlah; i++) {
            if (angka[i] % 2 == 0) {
                System.out.println(angka[i] + " adalah bilangan genap");
            } else {
                System.out.println(angka[i] + " adalah bilangan ganjil");
            }
        }
        
        scanner.close();






    }
}


