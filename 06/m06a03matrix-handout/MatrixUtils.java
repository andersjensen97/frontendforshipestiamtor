// Do not modify this file!

class MatrixUtils {
    public static void print(double[][] m) {
        if (m.length == 0) {
            System.out.println("Dimensions: 0 x 0");
            return;
        }

        var rows = m.length;
        var cols = m[0].length;
        System.out.println("Dimensions: " + rows + " x " + cols);

        for (var i = 0; i < rows; i++) {
            System.out.print("[ ");
            for (var j = 0; j < cols; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("]");
        }
    }    
}
