import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password, newPassword, decision;

        Scanner s = new Scanner(System.in);

        //Take the username
        System.out.print("Username: ");
        userName = s.nextLine();

        //Take the password
        System.out.print("Password: ");
        password = s.nextLine();

        //Check if username and password matches
        if(userName.equals("Patikadev") && password.equals("Path1234")) System.out.println("Access granted.");

        //If they don't match, ask if user wants to reset the password
        //Check if the new password is same with the old one
        else{
            System.out.println("Access denied. Password does not match the username " + userName);
            System.out.println("Reset password?\n Y or N");
            decision = s.nextLine();
            switch (decision) {
                case "Y", "y" -> {
                    System.out.print("New password: ");
                    newPassword = s.nextLine();
                    while (newPassword.equals("Path1234")) {
                        System.out.print("New password cannot be the same with the old one. Try again: ");
                        newPassword = s.nextLine();
                    }
                    System.out.println("New password is set.");
                }
                case "N", "n" -> System.out.println("Please try logging in again.");
            }
        }

    }
}
