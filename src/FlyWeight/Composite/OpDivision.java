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
      return super.toString();
    }

    public Double calculer()
    {
        // Attention à la division par zéro
        try {
            double diviseur = expressionRight.calculer();

            if (diviseur != 0)
            {
                return expressionLeft.calculer() / diviseur;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return 0.0;
    }
}
