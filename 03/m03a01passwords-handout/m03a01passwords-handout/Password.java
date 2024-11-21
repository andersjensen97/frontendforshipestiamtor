import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        // `password` stores the password entered by the user
        String password = "";
        // `attempt` stores the number of attempts made by the user
        int point = 0;

        // Loop until the user enters a valid password
        while (true) {

            // Read the password from the user
            password = scanner.nextLine();
            point++;

            // Check if the password is valid
            // The password is valid if it is between 5 and 8 characters long
            if (password.length() >= 5 && password.length() <= 8) {
                // The password is valid, so break out of the loop
                break;
            } else if (password.length() < 5) {
                // The password is too short
                // Print a message to the user
                System.out.println("Password too short");
            } else {
                // The password is too long
                // Print a message to the user
                System.out.println("Password too long");
            }
        }

        // Print the number of attempts
        // The `attempt` variable stores the number of times the user entered an invalid password
        System.out.println("Password length OK" + point);

        scanner.close();
    }
}

