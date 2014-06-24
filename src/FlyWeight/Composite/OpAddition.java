package FlyWeight.Composite;

import FlyWeight.FlyWeightExpression;

/**
 * Created by edouard on 22/06/14.
 */
public class OpAddition extends OpComposite
{
    public OpAddition(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        super(p_expressionLeft, p_expressionRight);
        signe = "+";
    }

    @Override
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
