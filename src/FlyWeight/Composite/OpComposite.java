package FlyWeight.Composite;

import FlyWeight.FlyWeightExpression;
import FlyWeight.UnsharedFlyWeightExpression;

/**
 * Autheur : kimsavinfo
 * Date : 42:01 25 juin 2014
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

    public String toString() {
        return "( " + expressionLeft.toString() + " " + signe + " " + expressionRight.toString() + " )";
    }

    public void evaluer(String p_variable, double p_nombre)
    {
        expressionLeft.evaluer(p_variable, p_nombre);
        expressionRight.evaluer(p_variable,  p_nombre);
    }

    public boolean isCalculable()
    {
        return expressionLeft.isCalculable() && expressionRight.isCalculable();
    }
}
