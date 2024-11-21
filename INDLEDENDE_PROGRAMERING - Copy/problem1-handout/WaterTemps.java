// If the user specifies the operation average , your program must print the average of all the
// temperatures written by the user.
import java.util.Scanner;
import java.util.Locale;

public class WaterTemps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double sum = 0;
        int count = 0;
        boolean printAverage = false;
        boolean printDrops = false;
        double prevTemp = 0;
        boolean isFirst = true;
        int numDrops = 0;
        String[] operations = null;
        
        if (in.hasNextLine()) {
            String line = in.nextLine();
            operations = line.split(",");
            for (String operation : operations) {
                if (operation.contains("average")) {
                    printAverage = true;
                }
                if (operation.contains("drops")) {
                    printDrops = true;
                }
            }
        }
        
        while (in.hasNextLine()) {
            String line = in.nextLine();
            try {
                double temp = Double.parseDouble(line);
                sum += temp;
                count++;
                if (!isFirst && temp < prevTemp) {
                    numDrops++;
                }
                prevTemp = temp;
                isFirst = false;
            } catch (NumberFormatException e) {
                // handle exception
            }
        }
        
        for (String operation : operations) {
            if (operation.contains("average") && printAverage) {
                System.out.println("Average temperature: " + (sum / count));
            }
            if (operation.contains("drops") && printDrops) {
                System.out.println("Number of temperature drops: " + numDrops);
            }
        }
    }
}