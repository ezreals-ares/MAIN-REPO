package GradeRepair;
import java.util.Scanner;

public class T1_Suhu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cls, fhr;

        System.out.print("Masukkan suhu dalam celcius : ");
        cls = sc.nextDouble();

        fhr = (cls * 9/5) + 32;
        System.out.println("Suhu dalam fahrenheit adalah " + fhr);
        sc.close();


    }
}