import java.util.Scanner;
public class Square21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.err.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}