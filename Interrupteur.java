/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */


public class Interrupteur extends Composant {
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

    protected boolean etat;
	
	public void on() {
		
		etat = true;
		
	}    
	
	public void off() {
		
		etat = false;
		
	}
	
	public boolean getEtat() throws NonConnecteException {
		
		return etat;
		
	}
	public void forcer(boolean NVEtat){
		this.etat = NVEtat;
	}
}
