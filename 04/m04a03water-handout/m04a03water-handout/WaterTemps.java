class WaterTemps {
    public static void main(String[] args) {
        double[] temp = parseInput();
        double maxTemp = temp[0];
        int tempDrops = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > maxTemp){
                maxTemp = temp[i];
            }
        }


        // Iterate over the array of temperature values, and count the number of temperature drops.
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] > temp[i + 1]) {
                tempDrops++;
            }
        }

        System.out.println("Maximum water temperature: " + maxTemp);
        System.out.println("Number of temperature drops: " + tempDrops);
    }

    /**
     * Reads a line from the console and splits it into integer and floating-point values.
     * 
     * @return an array of integer and floating-point values read from the console
     */
    private static double[] parseInput() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        var input = scanner.nextLine();
        scanner.close();

        var split = input.split("; ");
        var values = new double[split.length];
        for (int i = 0; i < values.length; i++) {
            try {
                values[i] = Integer.parseInt(split[i]);
            } catch (NumberFormatException e) {
                values[i] = Double.parseDouble(split[i]);
            }
        }
        return values;
    }
}

