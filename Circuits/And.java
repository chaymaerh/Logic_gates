/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */


public class And extends Porte2Entrees {
    public boolean getEtat() throws NonConnecteException {
    
        if (in1 == null || in2 == null) {

            throw new NonConnecteException();
        }
        else {
            return in1.getEtat() && in2.getEtat();

        }
    }
    protected boolean eval() {

        try { 
        return (in1.getEtat() && in2.getEtat()); 
        }
        catch(NonConnecteException e){
        return false;
        }
    }
}
