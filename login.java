import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name => ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();

            if ("akasha".equals(userName) && "password".equals(1234)) {
                System.out.println(" User successfully logged-in.. ");
            } else {
                System.out.println(" In valid userName of password ");
            }
        }
    }
}