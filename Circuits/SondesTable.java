import java.util.HashMap;
import java.util.Map;

public class PorteLogique {
    public void probe(SondesTable tableSondes) {

    }
}
public class SondesTable {
    private Map<LazySonde, Interrupteur> sondesToInterrupteurs;
    private Map<Interrupteur, LazySonde> interrupteursToSondes;
    
    public SondesTable() {
        sondesToInterrupteurs = new HashMap<>();
        interrupteursToSondes = new HashMap<>();
    }
    
    public Interrupteur getInterrupteur(LazySonde sonde) {
        return sondesToInterrupteurs.get(sonde);
    }
    
    public LazySonde getSonde(Interrupteur interrupteur, Composant cible, String entree) {
        LazySonde sonde = interrupteursToSondes.get(interrupteur);
        if (sonde == null) {
            sonde = new LazySonde(cible, entree);
            sondesToInterrupteurs.put(sonde, interrupteur);
            interrupteursToSondes.put(interrupteur, sonde);
        }
        return sonde;
    }
    
    public void resetSondes() {
        for (LazySonde sonde : sondesToInterrupteurs.keySet()) {
            sonde.reset();
        }
    }
    
    public void clear() {
        sondesToInterrupteurs.clear();
        interrupteursToSondes.clear();
    }
}
