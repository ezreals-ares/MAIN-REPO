import java.util.Scanner;

public class uts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Memasukkan jam keberangkatan: ");
        int jamber = sc.nextInt();
        System.out.print("Memasukkan Menit keberangkatan: ");
        int meBer = sc.nextInt();
        System.out.print("Memasukkan Detik keberangkatan: ");
        int deBer = sc.nextInt();
        System.out.print("Memasukkan jam kedatangan: ");
        int jamKed = sc.nextInt();
        System.out.print("Memasukkan Menit kedatangan: ");
        int meKed = sc.nextInt();
        System.out.print("Memasukkan detik kedatangan: ");
        int deKet = sc.nextInt();

        int DejamBer = jamber * 3600;
        int Demeber = meBer * 60;

        int jumlDeber = DejamBer + Demeber + deBer;

        int Dejamked = jamKed * 3600;
        int Demeked = meKed * 60;
        
        int jumlDeked = Dejamked + Demeked + deKet;

        int selisihDetik = jumlDeked - jumlDeber;
        
        int totaljadijam = selisihDetik /3600;
        int sisaDetik = selisihDetik % 3600;

        int totalmenit = sisaDetik /60;
        int sisaDetiklast = sisaDetik % 60;

        System.out.println("Jadi waktu yang ditempuh adalah " + totaljadijam + " jam " + totalmenit + " Menit " + sisaDetiklast + " detik");
        sc.close();
    }
}