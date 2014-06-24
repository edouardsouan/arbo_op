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

    @Override
    public boolean isCalculable()
    {
        boolean divisionPossible;

        // <!> Attention à la divions par zéro <!>
        if(expressionRight.calculer() == 0.0)
        {
            System.out.println("Division par zéro, veuillez redéfinir votre équation ou révaluer vos variables svp");
            divisionPossible = false;
        }
        else
        {
            divisionPossible = true;
        }

        return divisionPossible && expressionLeft.isCalculable() && expressionRight.isCalculable();
    }

    @Override
    public Double calculer()
    {
        if( isCalculable() )
        {
            return expressionLeft.calculer() / expressionRight.calculer();
        }
        else
        {
            return null;
        }
    }
}
