import java.util.Scanner;

public class TugasJ10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];

       
        System.out.println("Masukkan hasil survei (nilai antara 1-5):");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
             
                while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5) {
                    System.out.print("Nilai harus antara 1-5. Masukkan kembali: ");
                    hasilSurvei[i][j] = sc.nextInt();
                }
            }
        }

        
        System.out.println("\nRata-rata kepuasan untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalNilaiResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalNilaiResponden += hasilSurvei[i][j];
            }
            double rataRataResponden = totalNilaiResponden / jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataRataResponden);
        }

      
        System.out.println("\nRata-rata kepuasan untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalNilaiPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalNilaiPertanyaan += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = totalNilaiPertanyaan / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

       
        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata kepuasan secara keseluruhan: " + rataRataKeseluruhan);

        sc.close();
    }
}
