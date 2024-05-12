/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */
import java.util.List;
import java.util.ArrayList;

public class TestCircuits {
         public static void test(Circuit circ) {
            System.out.println("Nomenclature : " + circ.nomenclature()+"\n");

            System.out.println("Description : ");
            circ.description();
            
        List<Interrupteur> interrupteurs = circ.getIns();
        List<Vanne> vannes = circ.getOuts();

        System.out.println("\nInterrupteurs : ");
        for (Interrupteur interrupteur : interrupteurs) {
            System.out.println(interrupteur.getId());
        }

        System.out.println("\nVannes : ");
        for (Vanne vanne : vannes) {
            System.out.println(vanne.getId());
        }
        if (!interrupteurs.isEmpty()) {
            System.out.println("\nForçage d'interrupteurs : ");
            for (int i = 0; i < interrupteurs.size(); i++) {
                // Par exemple, forcez les interrupteurs pairs à true
                if (i % 2 == 0) {
                    interrupteurs.get(i).forcer(true);
                }
            }
        }
        System.out.println("\nTrace des états : ");
        circ.traceEtats();
    }
	public static void main(String[] args) {
	Composant[] tcomposants = new Composant[7];
        //Construction
        tcomposants[0] = new Interrupteur();
		tcomposants[1] = new Interrupteur();
		tcomposants[2] = new Interrupteur();
		tcomposants[3] = new Or();
		tcomposants[4] = new Not();
		tcomposants[5] = new And();
		tcomposants[6] = new Vanne();
		
		((Or)tcomposants[3]).setIn1(tcomposants[0]);
		((Or)tcomposants[3]).setIn2(tcomposants[1]);
		
		((Not)tcomposants[4]).setIn(tcomposants[2]);
		((And)tcomposants[5]).setIn1(tcomposants[3]);
		((And)tcomposants[5]).setIn2(tcomposants[4]);
		
		//Connexions
        Circuit exemple = new Circuit("Circuit_Expl", tcomposants);
		
		//Affichage
        test(exemple);
		System.out.println("Au revoir!");
	}	
        
}
