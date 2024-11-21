// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var e1 = new Addition(new Constant(3), new Constant(8));

        System.out.println("Formatted expression 1: " + e1.format());
        System.out.println("Result of the expression 1: " + e1.result());

        var e2 = new Division(e1, new Constant(2));

        System.out.println("");
        System.out.println("Formatted expression 2: " + e2.format());
        System.out.println("Result of the expression 2: " + e2.result());

        var e3 = new Multiplication(new Constant(4), e2);

        System.out.println("");
        System.out.println("Formatted expression 3: " + e3.format());
        System.out.println("Result of the expression 3: " + e3.result());

        var e4 = new Subtraction(new Addition(new Constant(3),
                                              new Constant(1)), e3);

        System.out.println("");
        System.out.println("Formatted expression 4: " + e4.format());
        System.out.println("Result of the expression 4: " + e4.result());
    }
}
