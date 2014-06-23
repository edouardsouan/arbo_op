package FlyWeight;

import FlyWeight.Composite.OpAddition;
import FlyWeight.Composite.OpComposite;
import Library.Operateurs;

import java.util.HashMap;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class FlyWeightFactory
{
    HashMap<Double, OpNombre> nombresGeneres;
    HashMap<String, OpComposite> operateursGeneres;
    Operateurs operateursAcceptes;
    // Sujet ne demande qu'une varaible "x" mais on anticipe l'évolution
    // d'une équation à 2 inconnues par exemple
    HashMap<String, OpVariable> variablesGenerees;

    public FlyWeightFactory()
    {
        nombresGeneres = new HashMap<Double, OpNombre>();
        operateursGeneres = new HashMap<String, OpComposite>();
        operateursAcceptes = new Operateurs();
        variablesGenerees = new HashMap<String, OpVariable>();
    }

    public void construire(signe, expA, expB)
    {

    }

    public OpNombre construire(Double p_nombre)
    {
        OpNombre opNombre = null;

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


    public OpVariable construire(String p_expression)
    {
        OpVariable opVariable = null;

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

    private OpComposite construire(String p_expression)
    {
        OpComposite opComposite = null;

        if(!operateursGeneres.containsKey(p_expression))
        {
            opComposite = new OpComposite(p_expression);
            nombresGeneres.put(p_nombre, opNombre);
        }
        else
        {
            opNombre = nombresGeneres.get(p_nombre);
        }

        switch (p_expression)
        {
            case "+":

            break;
        }
    }

    private OpAddition construireOpAddition()
    {

    }



}
