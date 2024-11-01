import java.util.Scanner;

public class ArrayRataNilai21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total_lulus = 0, total_tidaklulus = 0;
        double rata2_lulus = 0, rata2_tidaklulus = 0;
        int lulus = 0, tidaklulus = 0;

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                total_lulus += nilaiMhs[i];
                lulus++;
            } else {
                total_tidaklulus += nilaiMhs[i];
                tidaklulus++;
            }
        }

        
        if (lulus > 0) {
            rata2_lulus = total_lulus / lulus;
        }

        if (tidaklulus > 0) {
            rata2_tidaklulus = total_tidaklulus / tidaklulus;
        }

        System.out.println("Rata-rata nilai mahasiswa yang lulus: " + rata2_lulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus: " + rata2_tidaklulus);

        sc.close();
    }
}
