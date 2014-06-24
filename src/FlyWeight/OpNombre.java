package FlyWeight;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class OpNombre extends OpFeuille
{
    public OpNombre(double p_valeur)
    {
        valeur = p_valeur;
    }

    @Override
    public boolean isCalculable()
    {
        return true;
    }

    @Override
    public Double calculer()
    {
        return valeur;
    }

    @Override
    public void evaluer(String p_variable, double p_nombre)
    {
        // Ne rien faire
    }

    @Override
    public String toString() {
        return Double.toString(valeur);
    }
}
