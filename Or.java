/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Or extends Porte2Entrees {
     /*public boolean getEtat() throws NonConnecteException {

        if (in1 == null || in2 == null) {

            throw new NonConnecteException();

        } else {

            return in1.getEtat() || in1.getEtat();

        }
    }*/
    protected boolean eval() {

        try { 
        return (in1.getEtat() || in1.getEtat()); 
        }
        catch(NonConnecteException e){
        return false;
        }
    }
}
