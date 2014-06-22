package FlyWeight;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class OpVar extends OpFeuille
{
    String variable;

    public OpVar(String p_variable)
    {
        variable = p_variable;
    }

    @Override
    public String evaluer()
    {
        return variable;
    }

}
