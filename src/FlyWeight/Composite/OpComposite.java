package FlyWeight.Composite;

import FlyWeight.FlyWeightExpression;
import FlyWeight.UnsharedFlyWeightExpression;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public abstract class OpComposite extends UnsharedFlyWeightExpression
{
    protected String signe;
    protected FlyWeightExpression expressionLeft;
    protected FlyWeightExpression expressionRight;

    public OpComposite(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        expressionLeft = p_expressionLeft;
        expressionRight = p_expressionRight;
    }

    @Override
    public String toString() {
        return "( " + expressionLeft.toString() + " " + signe + " " + expressionRight.toString() + " )";
    }

    @Override
    public void evaluer(String p_variable, double p_nombre)
    {
        expressionLeft.evaluer(p_variable, p_nombre);
        expressionRight.evaluer(p_variable,  p_nombre);
    }

    @Override
    public boolean isCalculable()
    {
        return expressionLeft.isCalculable() && expressionRight.isCalculable();
    }

    @Override
    public abstract Double calculer();
}
