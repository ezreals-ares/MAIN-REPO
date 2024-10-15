import java.util.Scanner;
public class jadwal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hari = 1;
        double total = 0;
        int jmlhjam;

        while (hari <= 7) {
            System.out.print("Masukkan jumlah jam belajar hari ke " + hari + ": ");
            jmlhjam = sc.nextInt();
            
            if (jmlhjam > 0 && jmlhjam < 10) {
                total += jmlhjam;
                hari++;
            } else {
                System.out.println("Jam belajar tidak valid. Masukkan angka antara 1 dan 10.");
            }
        }

        System.out.println("Total jam belajar seminggu: " + total);
        double rataRata = total / 7;
        System.out.printf("Rata-rata jam belajar per hari: %.2f\n", rataRata);

        sc.close();
    }
}