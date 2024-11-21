// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var a = new double[][]{{1}, {2}};
        var b = new double[][]{{3, 4}};

        System.out.println("Matrix 'a':");
        MatrixUtils.print(a);
        System.out.println("");
        System.out.println("Matrix 'b':");
        MatrixUtils.print(b);

        System.out.println("");
        System.out.println("Multiplying 'a' and 'b'...");
        var c = Matrix.mult(a, b);

        System.out.println("");
        System.out.println("Result of the multiplication:");
        MatrixUtils.print(c);
    }
}
