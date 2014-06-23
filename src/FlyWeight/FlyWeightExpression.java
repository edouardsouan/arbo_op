package FlyWeight;

import Interface.IExpression;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public abstract class FlyWeightExpression implements IExpression
{
    @Override
    public Double calculer()
    {
        return 0.0;
    }

    @Override
    public String evaluer()
    {
        return "vide";
    }

    @Override
    public abstract String toString();
}
