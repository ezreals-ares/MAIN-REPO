import java.util.Scanner;
public class PemilihanBilangan21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String hasil;

        System.out.print("Masukkan Angka : ");
        angka = sc.nextInt();

        hasil = (angka %2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " Adalah Bilangan " + hasil);

        sc.close();
        
    }
}