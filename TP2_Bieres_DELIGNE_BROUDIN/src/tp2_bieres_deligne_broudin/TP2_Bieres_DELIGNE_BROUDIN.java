/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_deligne_broudin;

/**
 *
 * @author piercebroudin
 */
public class TP2_Bieres_DELIGNE_BROUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls",7.0,"Dubuisson", true);
        BouteilleBiere uneBiere1 = new BouteilleBiere("Guinness",4.2,"James's Gate Brewery", false);
        //uneBiere.nom = "Cuvée des Trolls";
        //uneBiere.degreAlcool = 7.0;
        //uneBiere.brasserie = "Dubuisson";
        //uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        uneBiere1.lireEtiquette();
        uneBiere1.Decapsuler();
        uneBiere.Decapsuler();
    }
        
        //uneBiere.nom = "Leffe";
        //uneBiere.degreAlcool = 6.6;
        //uneBiere.brasserie = "Abbaye de Leffe";
        //uneBiere.lireEtiquette();
    
        
        
            
    

    
    

}