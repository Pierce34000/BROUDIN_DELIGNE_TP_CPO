// TP1 exercice4  
//DELIGNE et Broudin
package tp_stats_deligne_broudin;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author delig
 */
public class TP_stats_DELIGNE_BROUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Création du tableau:
    int [] tableau = new int [6]; // on crée un tableau et gardons sa mémoire pour 6 cases
    for (int i=0;i<tableau.length;i++){
        tableau[i]=0;
    }
    
        //Saisie utilisateur
    int m;
    Scanner sc;
    sc=new Scanner(System.in);
    System.out.println("Saisissez un nombre entier");
    m=sc.nextInt();
    
        //Boucle
        Random generateurAleat = new Random();
    for (int i=0 ; i<=m; i++){ // on réalise m lancés de dés
        int nombreAle = generateurAleat.nextInt(6); //car random est exclusif avec la borne sup
        tableau[nombreAle]+=1; //on ajoute 1 à chaque fois que la position du tableau est tirée au sort pour comptabiliser les résulats des tours de dé
               
    }
        //Affichage du tableau
    System.out.print("["); //on affiche le début du tableau
    for (int i=0;i<tableau.length;i++){
        if (i==tableau.length-1){
            System.out.println(tableau[i]+"]");   // a la fin du tableau il faut juste afficher le dernier nombre suivit de ']'
        }
        else{
            System.out.print(tableau[i]+" ; "); // a l'intérieur du tableau les nombres sont séparés par des ';'
    }
            
    }
    
        //Résultats en pourcentages
    float [] tab_pourcent = new float [6];   //on crée un nouveau tableau pour mettre les valeurs en float
    System.out.print("["); //on affiche le début du tableau
    for (int i=0;i<tab_pourcent.length;i++){
        tab_pourcent[i]=tableau[i]*1.0f; //il faut transformer les valeurs du tableau en float pour que la division s'effectue correctement
        tab_pourcent[i]=(tab_pourcent[i]*100)/m; //on fait le calcul du pourcentage en divisant par m, le nombre total d'essais
        if (i==tab_pourcent.length-1){
            System.out.println(tab_pourcent[i]+"]");  
        }
        else{
            System.out.print(tab_pourcent[i]+" ; ");
    }
}
}
}

