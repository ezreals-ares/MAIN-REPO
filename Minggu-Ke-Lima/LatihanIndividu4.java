import java.util.Scanner;
public class LatihanIndividu4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short usia;
        String kategori;

        System.out.print("Masukkan Usia : ");
        usia = sc.nextShort();

        if (usia >= 0 && usia <= 12) {
            // System.out.println("Umur " + usia + " adalah usai Anak-anak");
            kategori = "anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "remaja";
            // System.out.println("Umur " + usia + " adalah usai Remaja");
        } else if (usia >=20 && usia <= 64) {
            kategori = "dewasa";
            // System.out.println("Umur " + usia + " adalah usai Dewasa");
        } else if (usia >= 64) {
            kategori = "lansia";
            // System.out.println("Umur " + usia + " adalah usai Lansia");
        } else {
            kategori = "tidak valid";
            // System.out.println("Data yang anda masukkan salah");
        }
        System.out.println("Usia " + usia + " berada pada kategori " + kategori);
        sc.close();


    }
}