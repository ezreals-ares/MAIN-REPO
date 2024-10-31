import java.util.Scanner;

public class SquareLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        
        do {
            System.out.print("Masukkan angka (0 untuk keluar): ");
            N = sc.nextInt();
            if (N <= 2 && N > 0) {
                System.out.println("Masukkan minimal angka 3");
                continue;
            }
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N);
                    } else {
                        System.out.print(" ");
                        if (N >= 10) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        } while (N !=0);
        System.out.println("Program selesai");
        sc.close();
    }
}