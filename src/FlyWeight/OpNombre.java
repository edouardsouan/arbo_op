package FlyWeight;

/**
 * Autheur : kimsavinfo
 * Date : 42:01 25 juin 2014
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
