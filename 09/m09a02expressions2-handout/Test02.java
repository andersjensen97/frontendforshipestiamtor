// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var e1 = new Constant(40);
        var e2 = new Constant(2);

        var eAdd = new Addition(e1, e2);

        System.out.println("Formatted addition: " + eAdd.format());
        System.out.println("Result of the addition: " + eAdd.result());

        var eSub = new Subtraction(e1, e2);

        System.out.println("");
        System.out.println("Formatted subtraction: " + eSub.format());
        System.out.println("Result of the subtraction: " + eSub.result());

        var eMul = new Multiplication(e1, e2);

        System.out.println("");
        System.out.println("Formatted multiplication: " + eMul.format());
        System.out.println("Result of the multiplication: " + eMul.result());

        var eDiv = new Division(e1, e2);

        System.out.println("");
        System.out.println("Formatted multiplication: " + eDiv.format());
        System.out.println("Result of the multiplication: " + eDiv.result());
    }
}
