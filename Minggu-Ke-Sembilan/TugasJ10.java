import java.util.Scanner;

public class TugasJ10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahRes = 10;
        int jumlahPert = 6;
        int[][] hasilSurvei = new int[jumlahRes][jumlahPert];

       
        System.out.println("Masukkan hasil survei (nilai antara 1-5):");
        
        for (int i = 0; i < jumlahRes; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");

            for (int j = 0; j < jumlahPert; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
             
                while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5) {
                    System.out.print("Nilai harus antara 1-5. Masukkan kembali: ");
                    hasilSurvei[i][j] = sc.nextInt();
                }
            }
        }

        
        System.out.println("\nRata-rata kepuasan untuk setiap responden:");

        for (int i = 0; i < jumlahRes; i++) {
            double totalResp = 0;

            for (int j = 0; j < jumlahPert; j++) {
                totalResp += hasilSurvei[i][j];
            }

            double rataResp = totalResp / jumlahPert;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResp);
        }

      
        System.out.println("\nRata-rata kepuasan untuk setiap pertanyaan:");

        for (int j = 0; j < jumlahPert; j++) {
            double totalPert = 0;

            for (int i = 0; i < jumlahRes; i++) {
                totalPert += hasilSurvei[i][j];
            }

            double rataPert = totalPert / jumlahRes;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPert);
        }

       
        double totalSeluruh = 0;

        for (int i = 0; i < jumlahRes; i++) {

            for (int j = 0; j < jumlahPert; j++) {
                totalSeluruh += hasilSurvei[i][j];
            }
        }

        double rataSeluruh = totalSeluruh / (jumlahRes * jumlahPert);
        System.out.println("\nRata-rata kepuasan secara keseluruhan: " + rataSeluruh);

        sc.close();
    }
}
