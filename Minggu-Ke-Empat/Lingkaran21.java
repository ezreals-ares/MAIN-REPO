import java.util.Scanner;
public class Lingkaran21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double phi = 3.14, keliling, luas;

        System.out.print("Masukan jari jari : ");
        r = input.nextInt();

        keliling = 2 * phi * r;
        luas = phi * r * r;

        System.out.println("\nKeliling lingkarann adalah : " + keliling);
        System.out.println("luas lingkarann adalah : " + luas);

        input.close();
        
    } 
    
}
