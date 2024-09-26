import java.util.Scanner;

public class PemilihanBilangan21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan Angka : ");
        angka = sc.nextInt();

        if (angka %2 == 0) {
            System.out.println("Angka " + angka + " Adalah Bilangan Genap");
        } else {
            System.out.println("Angka " + angka + " Adalah Bilangan Ganjil");
        }
        sc.close();
        
    }
}