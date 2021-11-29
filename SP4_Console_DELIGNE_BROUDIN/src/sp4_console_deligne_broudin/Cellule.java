/*
SP4 
DELIGNE
BROUDIN
 */
package sp4_console_deligne_broudin;

/**
 *
 * @author piercebroudin
 */
public class Cellule {
    Jeton jetonCourant;
    boolean desintegrateur;
    
    public Cellule() {
        jetonCourant = null;
    }
    
    public boolean affecterJeton (Jeton JC) {
        jetonCourant = JC;
        return jetonCourant != null;
    }
    
    public String lireCouleurDuJeton() {
        if (jetonCourant != null) {
            return(jetonCourant.couleur);
        }
        return "    ";
    }
}
