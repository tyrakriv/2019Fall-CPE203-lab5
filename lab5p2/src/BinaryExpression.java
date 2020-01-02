public abstract class BinaryExpression implements Expression {

    private final String operator;
    private final Expression lft;
    private final Expression rht;

    public BinaryExpression(String operator, final Expression lft, final Expression rht){
        this.operator = operator;
        this.lft = lft;
        this.rht = rht;
    }
    public String toString()
    {
        return "(" + lft +" " + operator + " " + rht + ")";
    }
    public double evaluate(final Bindings bindings)
    {
            return _applyOperator(lft.evaluate(bindings), rht.evaluate(bindings));
    }

    protected abstract double _applyOperator (double lft, double rht);
}
