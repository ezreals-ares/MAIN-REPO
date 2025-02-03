package GradeRepair;

import java.util.Scanner;

public class T3_BilPrima {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int bil, i;

        System.out.print("Masukkan sebuah bilangan : ");
        bil = sc.nextInt(); 

        boolean is_prima = true; 

        if (bil < 2) {
            is_prima = false;
        } else {
         
            for (i = 2; i <= bil / 2; i++) {
                if (bil % i == 0) {
                    is_prima = false;
                    break; 
                }
            }
        }

 
        if (is_prima) {
            System.out.println("Bilangan " + bil + " adalah bilangan prima");
        } else {
            System.out.println("Bilangan " + bil + " adalah bukan bilangan prima");
        }

        sc.close(); 
    }
}
