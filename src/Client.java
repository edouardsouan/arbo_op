import FlyWeight.FlyWeightExpression;
import FlyWeight.FlyWeightFactory;

/**
 * Autheur : kimsavinfo
 * Date : 42:01 25 juin 2014
 */
public class Client
{
    private static Double valeurX = 3.0;

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
        System.out.println(); // soucis de présentation

        e.evaluer("x", valeurX);

        System.out.println(e.calculer().toString());
    }
}
