import java.util.Scanner;

public class BioskopWhithScanner21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    boolean kursiTerisi = true;
                    String nama = "";
                    int baris = 0;
                    int kolom = 0;

                    while (kursiTerisi) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                kursiTerisi = false; 
                            } else {
                                System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Baris atau kolom tidak valid. Silakan coba lagi.");
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Penonton ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton pada baris ke-" + (i + 1) + ": " +
                                           (penonton[i][0] != null ? penonton[i][0] : "***") + ", " +
                                           (penonton[i][1] != null ? penonton[i][1] : "***"));
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
