import java.util.Scanner;

public class SearchNilai21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlhMhs;
        int key, hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan di input : ");
        jmlhMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlhMhs];
       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang akan dicari : ");
        key = sc.nextInt();

       for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i + 1;
                break;
            }      
       }
       if (hasil > 0) {
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
            System.out.println();       

       } else {
            System.out.println();
            System.out.println("Nilai tidak ditemukan");
            System.out.println();       

       }
       
        sc.close();
    }
}
