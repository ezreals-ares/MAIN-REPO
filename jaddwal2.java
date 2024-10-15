import java.util.Scanner;
public class jaddwal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hari = 1;
        int jmlhjam = 0;
        double total = 0;

        while (hari <= 7) {
            System.out.print("Masukkan jumlah jam belajar hari ke -" + hari +" : " );
            jmlhjam = sc.nextInt();

            if (jmlhjam > 0 && jmlhjam < 10) {
                total = total + jmlhjam;
                hari++;

            } else{
                System.out.println("jam belajar tidak valid");
            }
        }
        System.out.println("total jam belajar = " + total);
        sc.close();
    }
}
