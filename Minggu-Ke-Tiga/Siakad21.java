import java.util.Scanner;
public class Siakad21 {
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
        
        sc.close();
        

    }
}
