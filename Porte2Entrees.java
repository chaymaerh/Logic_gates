/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public abstract class Porte2Entrees extends Composant {
    protected Composant in1, in2 ;
    
    public void setIn1(Composant comp) {
		
		in1 = comp;
	}
	public void setIn2(Composant comp) {
		in2 = comp;
		
	}
	public String description(){
		String a1,a2;
		if (in1 != null)
			a1= in1.getId();
		else 
			a1= "Non connecté";
		if (in2 != null)
			a2= in2.getId();
		else 
			a2= "Non connecté";
		return this.getId() + " in1: " +a1+ " in2:" + a2;
	}
	protected abstract boolean eval();
	
	public boolean getEtat() throws NonConnecteException {
	if (in1 == null || in2 == null) {

            throw new NonConnecteException();
        }
        else {
        return this.eval();
    }
  }
  
}
