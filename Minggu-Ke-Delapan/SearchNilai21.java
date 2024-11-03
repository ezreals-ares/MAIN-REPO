import java.util.Scanner;

public class SearchNilai21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlhMhs;
        int key;
        boolean ditemukan = false;

        System.out.print("Masukkan banyaknya nilai yang akan di input : ");
        jmlhMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlhMhs];
       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.print("\nMasukkan nilai yang akan dicari : ");
        key = sc.nextInt();

       for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                ditemukan = true;
            }      
       }

       if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan");
       }
       
       
        sc.close();
    }
}
