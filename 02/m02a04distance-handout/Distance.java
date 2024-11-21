import java.util.Scanner;

class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficients a, b, and c of the line: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.print("Enter the coordinates x and y of the point: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        scanner.close();

        double distance = Math.abs((a * x + b * y + c) / Math.sqrt(a * a + b * b));

        if (distance > 0) {
            System.out.println("The distance is " + distance);
        } else {
            System.out.println("The distance is equal to 0");
        }
    }
}
