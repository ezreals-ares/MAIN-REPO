

public class tes {
    public static void main(String[] args) {
      
        int faktor = faktorial(10);
        System.out.println(faktor);
    }

    private static int faktorial(int n) {
        if (n == 0) {
            return n;
        }

        return n + faktorial(n - 1);
    }
    
}
