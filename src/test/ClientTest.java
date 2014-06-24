package test;

import FlyWeight.FlyWeightExpression;
import FlyWeight.FlyWeightFactory;
import FlyWeight.OpVariable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientTest
{
    private FlyWeightFactory factory;

    @Before
    public void setUp()
    {
        factory = new FlyWeightFactory();
    }

    @Test
    public void evalVariableNotDefienedVariable()
    {
        OpVariable opVariable = new OpVariable("x");

        Assert.assertNull(opVariable.calculer());
    }

    @Test
    public void evalVariableNotDefienedAddition()
    {
        FlyWeightExpression exp = factory.construire("+", factory.construire("x"), factory.construire(2.0));

        Assert.assertNull(exp.calculer());
    }

    @Test
    public void evalVariableNotDefienedSoustraction()
    {
        FlyWeightExpression exp = factory.construire("-", factory.construire("x"), factory.construire(2.0));

        Assert.assertNull(exp.calculer());
    }

    @Test
    public void evalVariableNotDefienedMultiplication()
    {
        FlyWeightExpression exp = factory.construire("*",factory.construire("x"), factory.construire(2.0));

        Assert.assertNull(exp.calculer());
    }

    @Test
    public void evalVariableNotDefienedDivision()
    {
        FlyWeightExpression exp = factory.construire("/", factory.construire("x"), factory.construire(2.0));

        Assert.assertNull(exp.calculer());
    }


    @Test
    public void divisionZero()
    {
        FlyWeightExpression exp = factory.construire("/", factory.construire(5.0), factory.construire("x"));

        exp.evaluer("x", 0);

        Assert.assertNull(exp.calculer());
    }
}