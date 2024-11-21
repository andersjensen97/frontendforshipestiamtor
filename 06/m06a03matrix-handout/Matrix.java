public class Matrix {
    public static double[][] mult(double[][] a, double[][] b) {

        if (a[0].length != b.length) {
            System.out.println("ERROR: the matrices cannot be multiplied");
            return new double[0][0];
        }

        int numRowsA = a.length;
        int numColsA = a[0].length;
        int numColsB = b[0].length;
        double[][] result = new double[numRowsA][numColsB];

        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}
