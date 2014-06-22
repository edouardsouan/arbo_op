package FlyWeight;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class OpVariable extends OpFeuille
{
    private String variable;

    public OpVariable()
    {
        variable = "x";
        valeur = 0;
    }

    public OpVariable(String p_variable)
    {
        variable = p_variable;
    }

    public void evaluer(double p_valeur)
    {
        valeur = p_valeur;
    }

    public double calculer()
    {
        return valeur;
    }

    @Override
    public String toString() {
        return variable;
    }

}
