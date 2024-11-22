import java.util.Scanner;

public class TugasJ10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] surveyData = new int[10][6];

        System.out.println("Masukkan data survey(nilai 1-5): ");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nResponden ke-" + (i + 1) + ": ");

            for (int j = 0; j < 6; j++) {
                
                do {
                    System.out.println("Pertanyaan ke-" + (j + 1) + ": ");
                    surveyData[i][j] = sc.nextInt();

                    if (surveyData [i][j] < 1 || surveyData[i][j] > 5) {
                        System.out.println("Nilai harus antara 1-5, silahkan masukkan kembali");
                    }
                } while (surveyData[i][j] < 1 || surveyData [i][j] > 5);
            }
            
        }



        sc.close();
    }
    
}