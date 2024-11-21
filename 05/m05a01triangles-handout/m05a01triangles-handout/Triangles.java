import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();

        // Check if the triangle is degenerate.
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Degenerate");
            return;
        }

        // Compute the internal angles of the triangle.
        double angleA = Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC));
        double angleB = Math.acos((sideA * sideA + sideC * sideC - sideB * sideB) / (2 * sideA * sideC));
        double angleC = Math.acos((sideA * sideA + sideB * sideB - sideC * sideC) / (2 * sideA * sideB));

        // Determine the type of triangle based on its internal angles.
        String triangleType;
        if (angleA >= Math.PI || angleB >= Math.PI || angleC >= Math.PI) {
            triangleType = "Degenerate";
        } else if (angleA > Math.PI / 2 || angleB > Math.PI / 2 || angleC > Math.PI / 2) {
            triangleType = "Obtuse";
        } else {
            triangleType = "Acute";
        }

        // If one of the internal angles is 90 degrees, then the triangle is right.
        if (angleA == Math.PI / 2 || angleB == Math.PI / 2 || angleC == Math.PI / 2) {
            triangleType = "Right";
        }

        System.out.println(triangleType);

        scanner.close();
    }
}
