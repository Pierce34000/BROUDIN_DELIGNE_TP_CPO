/*
SP4
DELIGNE
BROUDIN
 */
package sp4_console_deligne_broudin;

// Création des attributs

public class Joueur {
    String nom;
    String couleur;
    Jeton[]ListeJetons;
    int nombreJetonsRestants;
    
    public Joueur (String N) {
        nom = N;
        nombreJetonsRestants = 0;
        ListeJetons = new Jeton[21];
    }
    
    public void affecterCouleur (String C) {
        couleur = C;
    }
    
    public boolean ajouterJeton (Jeton J) {
        if (21 > nombreJetonsRestants) {
            ListeJetons [nombreJetonsRestants] = J;
            return true;
        }
        else {
            return false;
        }
    }
}




