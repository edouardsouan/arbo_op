package FlyWeight.Composite;

import FlyWeight.FlyWeightExpression;

/**
 * Autheur : kimsavinfo
 * Date : 42:01 25 juin 2014
 */
public class OpAddition extends OpComposite
{
    public OpAddition(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        super(p_expressionLeft, p_expressionRight);
        signe = "+";
    }

    public Double calculer()
    {
        if( isCalculable() )
        {
            return expressionLeft.calculer() + expressionRight.calculer();
        }
        else
        {
            return null;
        }
    }
}
