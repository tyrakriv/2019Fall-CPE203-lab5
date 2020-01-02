public class DivideExpression
   extends BinaryExpression
{

   public DivideExpression(final Expression lft, final Expression rht)
   {
      super( "+", lft, rht);
   }

   protected double _applyOperator(double a, double b){
      return a/b;
   }

}

