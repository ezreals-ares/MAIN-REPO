import java.util.Scanner;

public class fungsi {
    static int x, y;

    static int hitunghasil(int x, int y) {
        int hasil = (x * y) + x;
        return hasil;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai x: ");
        x = sc.nextInt();
        System.out.print("masukkan nilai y: ");
        y = sc.nextInt();

        System.out.println(hitunghasil(x, y));
        sc.close();
        
    }
}