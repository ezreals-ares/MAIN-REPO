import java.util.Scanner;
public class PemilihanHariDenganIf21 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int angka;
        String dayTipe = "";

        System.out.print("Input Angka 1-7 : ");
        angka = sc.nextInt();

        if (angka == 1 || angka == 2 || angka == 3 || angka == 4 || angka == 5) {
            dayTipe = "weekday";
        } else if (angka == 6 || angka == 7) {
            dayTipe = "weekend";
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println("Hari ke " + angka + " adalah hari " + dayTipe);
        sc.close();

    }
}