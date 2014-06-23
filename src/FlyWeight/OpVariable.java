package FlyWeight;

import java.util.Scanner;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class OpVariable extends OpFeuille
{
    private String variable;

    public OpVariable()
    {
        variable = "x";
        valeur = 0.0;
    }

    public OpVariable(String p_variable)
    {
        variable = p_variable;
    }


    public String evaluer(){
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Saisissez la valeur de x :  ");
        String valeurSaisie = lectureClavier.nextLine();
        this.valeur = Double.valueOf(valeurSaisie);
        return valeurSaisie;
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
