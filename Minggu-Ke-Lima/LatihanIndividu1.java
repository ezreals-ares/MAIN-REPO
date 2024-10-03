import java.util.Scanner;

public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String warnaLampu;

        System.out.print("Masukkan warna lampu: ");
        warnaLampu = sc.nextLine();

        switch (warnaLampu.toLowerCase()) {
            case "merah":
                System.out.println("Berhenti");
                break;
            case "kuning":
                System.out.println("Hati-hati");
                break;
            case "hijau":
                System.out.println("Jalan");
                break;
            default:
                System.out.println("Warna yang Anda masukkan salah");
                break;
        }
        sc.close();
    }
}
