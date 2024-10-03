import java.util.Scanner;
public class LatihanIndividu3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisKendaraan;
        double jam;
        double biayaMotor = 3000;
        double biayaMobil = 5000;
        double totalbiaya = 0;
        boolean sesuai = true;

        System.out.print("Masukkan Jenis Kendaraan : ");
        jenisKendaraan = sc.nextLine();

        System.out.print("Masukkan waktu (jam) : ");
        jam = sc.nextDouble();

        if (jenisKendaraan.equalsIgnoreCase("Motor")) {
            totalbiaya = biayaMotor * jam;
        } else if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
            totalbiaya = biayaMobil * jam;
        } else {
            System.out.println("Data yang anda berikan salah");
            sesuai = false;
        }
        if (sesuai) {
            System.out.println("Biaya untuk kendaraam " + jenisKendaraan + (" dengan waktu " + jam + " jam adalah " + totalbiaya));
        }
        sc.close();
       
    }
}