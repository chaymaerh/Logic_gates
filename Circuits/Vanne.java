/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Vanne extends Composant {
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		
		in = comp;
		
	}
	public String description()
	{
		String a1;
        
        if(this.in != null) 
			a1 = this.in.getId();
		else
			a1 = "non connecté";
		
		return  this.getId() + " in1 : " + a1 ;
	}
	
	public boolean getEtat() throws NonConnecteException {
		
		if (in == null) {
			
			throw new NonConnecteException();
			
		} else {
			
			return in.getEtat();
			
		}
	}
	public Composant getIn() {
		return in;
	}

	
}
