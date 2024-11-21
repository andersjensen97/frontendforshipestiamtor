class Statistics {
    public static void main(String[] args) {
        double[] values = parseInput();
        double sum = 0.0, standardDeviation = 0.0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        double mean = sum / values.length;

        for(int i = 0; i < values.length; i++) {
            standardDeviation += Math.pow(values[i] - mean, 2);
        }

        standardDeviation = Math.sqrt(standardDeviation / values.length);

        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + standardDeviation);
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