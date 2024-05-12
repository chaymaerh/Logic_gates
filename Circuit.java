import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class Circuit {
    private String nom;
    private List<Composant> composants = new ArrayList<>();
    
    public Circuit(String nom, Composant[] cps) {
        this.nom = nom;
        composants.addAll(Arrays.asList(cps));
        Collections.sort(composants);
        }
        
    public List<String> nomenclature() {
        List<String> ids = new ArrayList<>();
        for (Composant composant : composants) {
            ids.add(composant.getId());
        }
        Collections.sort(ids);
        return ids;
    }
    
    public void description() {
        System.out.println("Nom du circuit " + nom + "Description du circuit : ");
        for (Composant comp : composants) {
            System.out.println(comp.description());
        }
    }
    
    public void traceEtats() {
        for (Composant comp : composants) {
            System.out.println("Nom du circuit " + nom + ": ");
            System.out.println(comp.traceEtat());
        }
    }
    
    public List<Interrupteur> getIns(){
    
        List<Interrupteur> interrupteurs = new ArrayList<>();
        for (Composant composant : composants) {
            if (composant instanceof Interrupteur) {
                interrupteurs.add((Interrupteur) composant);
            }
        }
        return interrupteurs;
    }
    
    public List<Vanne> getOuts() {
        List<Vanne> vannes = new ArrayList<>();
        for (Composant composant : composants) {
            if (composant instanceof Vanne) {
                vannes.add((Vanne) composant);
            }
        }
        return vannes;
    }
    // sondes
    protected SondesTable tableSondes = new SondesTable();
    
    public void probe() {
        for (Composant composant : composants ) {
            if( composant instanceof Porte){
            Porte porte = (Porte) composant;
            porte.probe(tableSondes);
            }
        }
    }
    
    public void unProbe(){
        for (Composant composant : composants ) {
            if( composant instanceof Porte)((Porte)composant).unProbe(tableSondes);
    
    }
    }
}
