package FlyWeight;


/**
 * Autheur : kimsavinfo
 * Date : 42:01 25 juin 2014
 */
public class OpVariable extends OpFeuille
{
    private String variable;

    public OpVariable(String p_variable)
    {
        variable = p_variable;
        valeur = Double.NaN;
    }

    @Override
    public Double calculer()
    {
        if(isCalculable())
        {
            return valeur;
        }
        else {
            return null;
        }
    }

    @Override
    public boolean isCalculable()
    {
        if(Double.isNaN(valeur))
        {
            System.out.println("Veuillez évaluer la variable "+variable+" svp : evaluer(\""+variable+"\", [nombre]) ");
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public void evaluer(String p_variable, double p_nombre)
    {
        if(variable.equals(p_variable))
        {
            valeur = p_nombre;
        }
    }

    @Override
    public String toString() {
        return variable;
    }
}
