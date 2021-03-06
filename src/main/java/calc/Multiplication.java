package calc;

public class Multiplication extends Binary implements Associative {

    public Multiplication(Expression lhs, Expression rhs) {
        super(lhs, rhs);
    }

    @Override
    protected int compute(int a, int b) {
        return a * b;
    }

    @Override
    protected String symbol() {
        return "*";
    }

    @Override
    public int rank() {
        return 1;
    }
}
