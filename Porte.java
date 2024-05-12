/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public abstract class Porte extends Composant {

    abstract void probe(SondesTable TableSondes);
    abstract void unProbe(SondesTable TableSondes);
    
}
