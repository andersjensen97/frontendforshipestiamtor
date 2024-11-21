import java.util.Scanner;

public class Ssttrriinngg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < n; j++) {
                output.append(input.charAt(i));
            }
        }
        System.out.println(output);

        scanner.close();
    }
}
