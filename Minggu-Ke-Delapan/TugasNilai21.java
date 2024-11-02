import java.util.Scanner;

public class TugasNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, rata2;
        int nilaiTertinggi, nilaiTerendah;

        System.out.print("Masukkan Banyaknya nilai Mahasiswa : ");
        int jmlNilai = sc.nextInt();

        int[] NilaiMhs = new int[jmlNilai];

        for (int i = 0; i < NilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            NilaiMhs[i] = sc.nextInt();
        }

        nilaiTertinggi = NilaiMhs[0];
        nilaiTerendah = NilaiMhs[0];

        for (int i = 0; i < NilaiMhs.length; i++) {
            total += NilaiMhs[i];

            if (NilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = NilaiMhs [i];
            }

            if (NilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = NilaiMhs[i];
            }
        }

        rata2 = total/NilaiMhs.length;
        System.out.println();
        System.out.println("Nilai mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < NilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + NilaiMhs[i]);
        }

        System.out.println("\nRata-rata nilai mahasiswa adalah " + rata2);
        System.out.println("Nilai tertinggi mahasiswa adalah " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa adalah " + nilaiTerendah);

        sc.close();



    }
}
