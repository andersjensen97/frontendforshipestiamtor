import java.util.Scanner;

class Conversion2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        scanner.close();

        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = (seconds % 86400 % 3600) / 60;
        int secondsRemainder = (seconds % 86400 % 3600) % 60;

        System.out.printf("%d seconds equals %d days, %d hours, %d minutes and %d seconds.",
                seconds, days, hours, minutes, secondsRemainder);

                System.out.printf(seconds+" seconds equals "+days+" days, "+hours+" hours, "+minutes+" minutes and "+secondsRemainder+" seconds.");
    }
}
