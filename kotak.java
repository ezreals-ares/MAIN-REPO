import java.util.Scanner;

public class kotak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        do {
            System.out.print("Masukan Angka (ketik 0 untuk keluar) : ");
            n = sc.nextInt();
            if (n <= 2 && n > 0) {
                System.out.println("Masukkan Angka lebih dari 2");
                continue;
            }
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n);
                    } else {
                        System.out.print(" ");
                        if (n >= 10) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }

        }while (n != 0);
        System.out.println("Program selesai");
        sc.close();
    }
}
