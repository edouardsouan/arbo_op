package FlyWeight.Composite;

import FlyWeight.FlyWeightExpression;

/**
 * Created by edouard on 22/06/14.
 */
public class OpDivision extends OpComposite
{
    public OpDivision(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        super(p_expressionLeft, p_expressionRight);
        signe = "/";
    }

    public String evaluer()
    {
        return super.evaluer();
    }

    public Double calculer()
    {
        // Attention à la division par zéro
         double diviseur;

        do
        {
            expressionRight.evaluer();
            diviseur = expressionRight.calculer();

            System.out.println("Diviseur : "+diviseur);

        }while (diviseur == 0.0);

        return expressionLeft.calculer() / diviseur;
    }
}
