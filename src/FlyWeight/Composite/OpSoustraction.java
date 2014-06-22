package FlyWeight.Composite;

import FlyWeight.FlyWeightExpression;

/**
 * Created by edouard on 22/06/14.
 */
public class OpSoustraction extends OpComposite
{
    public OpSoustraction(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        super(p_expressionLeft, p_expressionRight);
        signe = "-";
    }

    // Non sûre, à revoir
    public void evaluer(double p_valeur)
    {
        System.out.println("Valeur : " + super.toString() );
    }

    public double calculer()
    {
        return expressionLeft.calculer() - expressionRight.calculer();
    }
}
