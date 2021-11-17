/*
TP2_Ex3
BROUDIN
DELIGNE
*/
package tp2_relation_1_broudin_deligne;
 
/**
*
* @author alamassi
*/
public class Voiture {
     //Attributs:
    String Modèle;
    String Marque;
    int PuissanceCV;
    Personne Propriétaire;
 
    public Voiture (String leModele, String laMarque, int laPuissance, Personne P){
        Modèle = leModele;
        Marque = laMarque;
        PuissanceCV = laPuissance;
        Propriétaire = P;
    }
   
    @Override
    public String toString() {
        return Modèle+" de la marque "+Marque+" de puissance "+PuissanceCV;
    }
}
