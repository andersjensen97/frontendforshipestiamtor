import java.util.Scanner;

public class Characters {
    // This program reads characters from standard input and prints their description.

    public static void main(String[] args) {
        // Create a scanner to read from standard input.
        var scanner = new Scanner(System.in);

        // Loop until the standard input stream is closed.
        while (scanner.hasNextLine()) {
            // Read a line from standard input.
            String sentence = scanner.nextLine();

            // Iterate over the characters in the line.
            for (int i = 0; i < sentence.length(); i++) {
                // Get the current character.
                char x = sentence.charAt(i);

                // Print the description of the character.
                if (Character.isUpperCase(x)) {
                    System.out.println("The character '" + x + "' is an uppercase letter");
                } else if (Character.isLowerCase(x)) {
                    System.out.println("The character '" + x + "' is a lowercase letter");
                } else if (Character.isDigit(x)) {
                    System.out.println("The character '" + x + "' is a digit");
                } else if (x == '#' || x == '!' || x == '+' || x == '\\') {
                    System.out.println("The character '" + x + "' is a special symbol");
                } else {
                    System.out.println("The character '" + x + "' is not known");
                }
            }
        }

        // Close the scanner.
        scanner.close();
    }
}




//import java.util.Scanner;
//
//public class Characters {
//    // This program reads characters from standard input and prints their description.
//
//    public static void main(String[] args) {
//        // Create a scanner to read from standard input.
//        var scanner = new Scanner(System.in);
//
//        // Loop until the standard input stream is closed.
//        while (scanner.hasNextLine()) {
//            // Read a line from standard input.
//            String sentence = scanner.nextLine();
//
//            // Iterate over the characters in the line.
//            for (int i = 0; i < sentence.length(); i++) {
//                // Get the current character.
//                char x = sentence.charAt(i);
//
//                // Determine the description of the character.
//                String description;
//                if (Character.isUpperCase(x)) {
//                    description = "uppercase letter";
//                } else if (Character.isLowerCase(x)) {
//                    description = "lowercase letter";
//                } else if (Character.isDigit(x)) {
//                    description = "digit";
//                } else if (x == '#' || x == '!' || x == '+' || x == '\\') {
//                    description = "special symbol";
//                } else {
//                    description = "not known";
//                }
//
//                // Print the description of the character.
//                System.out.println("The character '" + x + "' is a " + description);
//            }
//        }
//
//        // Close the scanner.
//        scanner.close();
//    }
//}
