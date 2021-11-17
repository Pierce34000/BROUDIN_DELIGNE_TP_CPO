/*
TP2_Ex3
BROUDIN
DELIGNE
*/
package tp2_manip_broudin_deligne;
/**
*
* @author alamassi
*/
public class Moussaka {
    //Ajout d'un attribut:
    int nbCalories;
  public Moussaka (int valeur){
      nbCalories = valeur;
  }
 
  @Override
  public String toString() {
      return String.valueOf(nbCalories);
  }
   
}
