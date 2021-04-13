import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String userName = scanner.nextLine();
        System.out.println("Enter Password");
        String password = scanner.nextLine();


        if (login(userName, password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }

    private static boolean login(String userName, String password) {
        if (userName.equals("alex") && password.equals("sunshine")) {
            return true;
        } else if (userName.equals("emma") && password.equals("haskell")){
            return true;
        }
        return false;
    }
}
