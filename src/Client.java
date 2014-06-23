import FlyWeight.FlyWeightExpression;
import FlyWeight.FlyWeightFactory;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class Client
{
    public static void main (String[] args)
    {
        System.out.println("==== DESIGN PATTERN ====");

        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeightExpression e1 = factory.construire("+", factory.construire("x"), factory.construire(2.0));
        FlyWeightExpression e2 = factory.construire("-", factory.construire(2.0), factory.construire("x"));
        FlyWeightExpression e3 = factory.construire("/", factory.construire(1.0), e2);
        FlyWeightExpression e = factory.construire("*", e1, e3);

        String equation = e.toString();
        System.out.print(equation);
        System.out.println(e.calculer().toString());
    }
}
