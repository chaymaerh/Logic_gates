/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public abstract class Composant implements Comparable<Composant>{

		public int compareTo(Composant other){
			return this.getId().compareTo(other.getId());
		}
	public String getId() {
		
		return super.toString(); // class@numero renvoye par Object
		
	}
	public String description(){
	
		return "composant" + getId() ;
		
	}
	public abstract boolean getEtat() throws NonConnecteException;
	
	public String traceEtat(){
			try {
				return this.description() + "Etat : " + this.getEtat();}
		    catch(NonConnecteException e){
				return this.description() +"composant non connecte";
			}
		}
	
}

