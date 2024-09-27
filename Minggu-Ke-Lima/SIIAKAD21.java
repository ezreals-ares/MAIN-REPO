import java.util.Scanner;
public class SIIAKAD21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAkir, nilaiKuis, nilaiTugas, nilaiUjian;
        String nama, nim;
        char kelas;
        byte absen;

        System.out.print("Masukan Nama : ");
        nama = sc.nextLine();

        System.out.print("Masukan Nim : ");
        nim = sc.nextLine();

        System.out.print("Masukan kelas : ");
        kelas = sc.nextLine().charAt(0);

        System.out.print("Masukkan Absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Ujian : ");
        nilaiUjian = sc.nextDouble();

        nilaiAkir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;

        System.out.print("Mahasiswa dengan nama " + nama);
        System.out.print(" (NIM " + nim + ")");
        System.out.print(" Kelas " + kelas);
        System.out.print(" No Absen " + absen);
        System.out.println("\nNilai Akhir : " + nilaiAkir);

        if (nilaiAkir > 80 && nilaiAkir <= 100) {
            System.out.println("Nilai Akhir Huruf : A");
            System.out.println("Kualifikasi : Sangat Baik");

        } else if (nilaiAkir > 73 && nilaiAkir <= 80) {
            System.out.println("Nilai Akhir Huruf : B+");
            System.out.println("Kualifikasi : Lebih dari Baik");
        } else if (nilaiAkir > 65 && nilaiAkir <= 63) {
            System.out.println("Nilai Akhir Huruf : B");
            System.out.println("Kualifikasi : Baik");
        } else if (nilaiAkir > 60 && nilaiAkir <= 65) {
            System.out.println("Nilai Akhir Huruf : C+");
            System.out.println("Kualifikasi : Lebih dari Cukup");
        } else if (nilaiAkir > 50 && nilaiAkir <= 60) {
            System.out.println("Nilai Akhir Huruf : C");
            System.out.println("Kualifikasi : Cukup");
        } else if (nilaiAkir > 39 && nilaiAkir <= 50) {
            System.out.println("Nilai Akhir Huruf : D");
            System.out.println("Kualifikasi : Kurang");
        } else {
            System.out.println("Nilai Akhir huruf : E");
            System.out.println("Kualifikasi : Gagal");
        }
        
        sc.close();
        

    }
}
