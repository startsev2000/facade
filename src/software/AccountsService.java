package software;

import java.io.IOException;
import java.util.Scanner;

public class AccountsService {

    private final Scanner in = new Scanner(System.in);

    public void signInUserAccountInSystem() {
        try {
            System.out.println("Enter the username");
            String username = "";
            while (username.equals("")) {
                username = in.nextLine();
            }
            System.out.println("Hello, " + username + ", enter your password");
            String password = "";
            while (password.equals("")) {
                password = in.nextLine();
            }
            System.out.println("Authorization succeed!");
        } catch (Exception e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
    }

}
