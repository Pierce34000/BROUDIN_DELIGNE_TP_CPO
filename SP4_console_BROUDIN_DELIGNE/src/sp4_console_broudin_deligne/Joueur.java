/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_broudin_deligne;

/**
 *
 * @author delig
 */
public class Joueur {
    String nom;
    String couleur;
    Jeton[]ListeJetons;
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    
    public Joueur (String N) {
        nom=N;
        nombreJetonsRestants=0;
        nombreDesintegrateurs=0;
        ListeJetons=new Jeton[21];
    }
    
    public void affecterCouleur (String C){
        couleur=C ;
    }
    
    public boolean ajouterJeton (Jeton J){
        if (nombreJetonsRestants < 21){
            ListeJetons [nombreJetonsRestants]=J;
            nombreJetonsRestants +=1;
            return true;
        }
        else {
            return false;
        }
    }
   
}
