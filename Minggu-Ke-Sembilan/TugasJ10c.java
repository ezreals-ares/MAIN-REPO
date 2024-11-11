import java.util.Scanner;

public class TugasJ10c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inisialisasi array 2 dimensi untuk menyimpan data survei
        // 10 responden x 6 pertanyaan
        int[][] surveyData = new int[10][6];
        
        // a. Menyimpan hasil survey
        System.out.println("Masukkan data survei (nilai 1-5):");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nResponden " + (i + 1) + ":");

            for (int j = 0; j < 6; j++) {

                do {
                    System.out.print("Pertanyaan " + (j + 1) + ": ");
                    surveyData[i][j] = scanner.nextInt();

                    if (surveyData[i][j] < 1 || surveyData[i][j] > 5) {
                        System.out.println("Nilai harus antara 1-5. Silakan masukkan kembali.");
                    }

                } while (surveyData[i][j] < 1 || surveyData[i][j] > 5);
            }
        }
        
        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nRata-rata nilai per responden:");

        for (int i = 0; i < 10; i++) {
            double sum = 0;

            for (int j = 0; j < 6; j++) {
                sum += surveyData[i][j];
            }

            double average = sum / 6;
            System.out.printf("Responden %d: %.2f\n", (i + 1), average);
        }
        
        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata nilai per pertanyaan:");

        for (int j = 0; j < 6; j++) {
            double sum = 0;

            for (int i = 0; i < 10; i++) {
                sum += surveyData[i][j];
            }

            double average = sum / 10;
            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), average);
        }
        
        // d. Menampilkan nilai rata-rata secara keseluruhan
        double totalSum = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 6; j++) {
                totalSum += surveyData[i][j];
            }
        }
        
        double totalAverage = totalSum / (10 * 6);
        System.out.printf("\nRata-rata keseluruhan: %.2f\n", totalAverage);
        
        scanner.close();
    }
}