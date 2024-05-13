/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Not extends Porte{
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		
		in = comp;
		
	}
	public String description(){
		String a1;
		if (in != null)
			a1= in.getId();
		else 
			a1= "Non connecté";
		return this.getId() + " in1: " +a1;

	}
	
	public boolean getEtat() throws NonConnecteException {
		
		if (in == null) {
			
			throw new NonConnecteException();
			
		} else {
			
			return !in.getEtat();
			
		}
	
}
}
