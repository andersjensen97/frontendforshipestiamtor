// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var e = new Subtraction(new Addition(new Constant(1.0),
                                             new Constant(2.0)),
                                new Constant(3.0));

        System.out.println("Formatted expression: " + e.format());
        System.out.println("Result of the expression: " + e.result());
    }
}
