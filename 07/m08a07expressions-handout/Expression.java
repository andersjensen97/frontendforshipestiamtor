public interface Expression {
    double result();
    String format();
}

class Constant implements Expression {
    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double result() {
        return value;
    }

    @Override
    public String format() {
        return Double.toString(value);
    }
}

class Addition implements Expression {
    private Expression e1;
    private Expression e2;

    public Addition(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double result() {
        return e1.result() + e2.result();
    }

    @Override
    public String format() {
        return "(" + e1.format() + " + " + e2.format() + ")";
    }
}

class Subtraction implements Expression {
    private Expression e1;
    private Expression e2;

    public Subtraction(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double result() {
        return e1.result() - e2.result();
    }

    @Override
    public String format() {
        return "(" + e1.format() + " - " + e2.format() + ")";
    }
}

class Multiplication implements Expression {
    private Expression e1;
    private Expression e2;

    public Multiplication(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double result() {
        return e1.result() * e2.result();
    }

    @Override
    public String format() {
        return "(" + e1.format() + " * " + e2.format() + ")";
    }
}

class Division implements Expression {
    private Expression e1;
    private Expression e2;

    public Division(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double result() {
        return e1.result() / e2.result();
    }

    @Override
    public String format() {
        return "(" + e1.format() + " / " + e2.format() + ")";
    }
}
