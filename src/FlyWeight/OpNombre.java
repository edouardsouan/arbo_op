package FlyWeight;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class OpNombre extends OpFeuille
{
    public OpNombre()
    {
        valeur = 0.0;
    }

    public OpNombre(double p_valeur)
    {
        valeur = p_valeur;
    }

    public String evaluer(){ return Double.toString(valeur); }

    public Double calculer()
    {
        return valeur;
    }

    @Override
    public String toString() {
        return Double.toString(valeur);
    }
}
