package FlyWeight;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class OpNombre extends OpFeuille
{
    public OpNombre()
    {
        valeur = 0;
    }

    public OpNombre(double p_valeur)
    {
        valeur = p_valeur;
    }

    // Non sûre, à revoir
    public void evaluer(double p_valeur)
    {
        System.out.println("Valeur : "+valeur);
    }

    public double calculer()
    {
        return valeur;
    }

    @Override
    public String toString() {
        return Double.toString(valeur);
    }
}
