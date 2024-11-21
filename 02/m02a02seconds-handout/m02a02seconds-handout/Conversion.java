
class Conversion {
    public static void main(String[] args) {

        var scan = new java.util.Scanner(System.in);

        var seconds = scan.nextInt();

        scan.close();

        var days = seconds / 86400;
        var hours = (seconds % 86400) / 3600;
        var minutes = (seconds % 86400 % 3600) / 60;
        var secondsRemainder = (seconds % 86400 % 3600) % 60;

        System.out.printf("%d seconds equals %d days, %d hours, %d minutes and %d seconds.", seconds, days, hours, minutes, secondsRemainder);

    }
}
