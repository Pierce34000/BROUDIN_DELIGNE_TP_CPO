/*
SP4
DELIGNE
BROUDIN
 */
package sp4_console_deligne_broudin;


public class Grille {
    Cellule[][]CellulesJeu = new Cellule [6][7];
    
    public boolean ajouterJetonsDansColonne(Jeton JC, int k) {
        for (int i = 5; i < 6; i++) {
            if (CellulesJeu[i][k]).recupererJeton() == null) {
            CellulesJeu[i][k].affecterJeton(JC);
            return true;
            
            }
        }
        return false;
    }
    

    public boolean etreRemplie(){
        for (int i=5; i<6; i++){
            for(int k=0; i<7;i++){
                if Cellules[i][k].recupererJeton()==null {
            }
        }
    }    
        
    
}
