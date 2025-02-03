package GradeRepair;
public class T4_Char {

    public static void main(String[] args) {
        char[] huruf = new char[15];
        int index = 0;
        
        for (char c = 'A'; c <= 'O'; c++) {
            huruf[index++] = c;
        }

        int idx = 0;   
        for (int i = 1; i <= 5; i++) {  

            for (int s = 0; s < 5 - i; s++) {
                System.out.print(" ");  
            }
          
            for (int j = 0; j < i; j++) {
                if (idx < huruf.length) {
                    System.out.print(huruf[idx++]);  
                }
            }
            System.out.println(); 
        }
    }
}
