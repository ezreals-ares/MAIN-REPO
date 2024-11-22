import java.util.Scanner;

public class TugasKubus11 {
    static int volKubus(int s){
        int hasil = s*s*s;
        return hasil;
    }
    static int lPermukaanKubus(int s){
        int hasil = 6 * (s * s) ;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi;
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc.nextInt();
        int luas = lPermukaanKubus(sisi);
        int volume = volKubus(sisi);

        System.out.println("Luas Permukaan kubus dengan panjang sisi "+ sisi +" Adalah "+luas);
        System.out.println("Volume kubus dengan panjang sisi "+ sisi + " Adalah "+ volume);

        sc.close();
    }
}