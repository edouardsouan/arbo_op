package FlyWeight;

import FlyWeight.Composite.*;

import java.util.HashMap;


/**
 * Autheur : kimsavinfo
 * Date : 42:01 25 juin 2014
 */
public class FlyWeightFactory
{
    private HashMap<Double, OpNombre> nombresGeneres;
    private HashMap<String, OpVariable> variablesGenerees;

    public FlyWeightFactory()
    {
        nombresGeneres = new HashMap<>();
        variablesGenerees = new HashMap<>();
    }

    // String pour l'opérateur car anticipe "sqrt" pour racine carrée par exemple
    public OpComposite construire(String p_operateur, FlyWeightExpression expGauche, FlyWeightExpression expDroit)
    {
        OpComposite opComposite = null;

        switch (p_operateur)
        {
            case "+" :
                opComposite = construireOpAddition(expGauche, expDroit);
            break;

            case "-" :
                opComposite = construireOpSoustraction(expGauche, expDroit);
            break;

            case "*" :
                opComposite = construireOpMultiplication(expGauche, expDroit);
            break;

            case "/" :
                opComposite = construireOpDivision(expGauche, expDroit);
            break;
        }

        return opComposite;
    }

    public OpNombre construire(Double p_nombre)
    {
        OpNombre opNombre;

        if(!nombresGeneres.containsKey(p_nombre))
        {
            opNombre = new OpNombre(p_nombre);
            nombresGeneres.put(p_nombre, opNombre);
        }
        else
        {
            opNombre = nombresGeneres.get(p_nombre);
        }

        return opNombre;
    }


    public OpVariable construire(String p_variable)
    {
        OpVariable opVariable;

        if(!variablesGenerees.containsKey(p_variable))
        {
            opVariable = new OpVariable(p_variable);
            variablesGenerees.put(p_variable, opVariable);
        }
        else
        {
            opVariable = variablesGenerees.get(p_variable);
        }

        return opVariable;
    }

    private OpAddition construireOpAddition(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        return new OpAddition(p_expressionLeft, p_expressionRight);
    }

    private OpSoustraction construireOpSoustraction(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        return new OpSoustraction(p_expressionLeft, p_expressionRight);
    }

    private OpMultiplication construireOpMultiplication(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        return new OpMultiplication(p_expressionLeft, p_expressionRight);
    }

    private OpDivision construireOpDivision(FlyWeightExpression p_expressionLeft, FlyWeightExpression p_expressionRight)
    {
        return new OpDivision(p_expressionLeft, p_expressionRight);
    }

}
