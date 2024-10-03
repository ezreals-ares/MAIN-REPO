import java.util.Scanner;

public class LatihanIndividu2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "Admin";
        String password = "1234";
        String username_user, password_user;

        System.out.print("Masukkan Username Anda : ");
        username_user = sc.nextLine();

        System.out.print("Masukkan Password Anda : ");
        password_user = sc.nextLine();

        if (username_user.equalsIgnoreCase(username) && password_user.equalsIgnoreCase(password)) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("login Gagal");
        }
        sc.close();
    }
}