package mastermind_deligne_broudin;
import java.util.Random;

/*
BROUDIN
DELIGNE
MasterMind
 */


public class CodeSecret {
    String codeSecret[];
    String couleursTab[] = {"Rouge","Bleu","Vert","Jaune","Orange","Gris"};
    String nouveauTableau[] = {"Rouge","Bleu","Vert","Jaune","Orange","Gris"};
    
    /* On définit ce tableau pour éviter que le code ne contienne plusieurs fois la même couleur, 
    ce qui compliquerait le code.
    */
    
    CodeSecret() {
        codeSecret = new String[4];
    }
    public String[] combinaisonCouleurs() {
        Random rd = new Random();
        for (int i = 0; i <= 5; i++) {
            int index = rd.nextInt(6);
            while (nouveauTableau[index] == null) {
                index = rd.nextInt(6);
            }
            codeSecret[i] = nouveauTableau[index];
            nouveauTableau[index] = null;
        }
        return codeSecret;   
    }  
}
  
    
