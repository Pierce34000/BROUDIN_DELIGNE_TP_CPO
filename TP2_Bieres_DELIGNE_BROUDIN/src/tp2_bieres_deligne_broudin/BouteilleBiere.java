/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_deligne_broudin;

/**
 *
 * @author piercebroudin
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie, boolean uneouverte) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = uneouverte;
    }

    public void Decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            System.out.println("La biere vient d'etre ouverte sante");
        } else {
            System.out.println("La biere est deja ouverte");
            ouverte = false;
        }
    }

    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
        if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}
