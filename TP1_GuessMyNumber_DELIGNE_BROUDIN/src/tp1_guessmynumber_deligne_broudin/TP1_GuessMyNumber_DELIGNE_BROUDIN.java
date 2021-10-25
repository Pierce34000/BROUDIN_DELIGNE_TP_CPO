/*
BROUDIN
DELIGNE
TP1_Ex3
 */
package tp1_guessmynumber_deligne_broudin;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author piercebroudin
 */
public class TP1_GuessMyNumber_DELIGNE_BROUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        // 1)
        int n = generateurAleat.nextInt(100);
        int a = generateurAleat.nextInt(100);
        int b = generateurAleat.nextInt(100);
        int c = generateurAleat.nextInt(100);
        int d = generateurAleat.nextInt(100);
        
        // System.out.println(n + " " + a + " " + b + " " + c + " " + d );
        
        // 2)
        
       Scanner e;
       int choix;
       e = new Scanner(System.in);
       System.out.println("Choisissez la difficulté : ");
       System.out.println("1) Facile) 2) Normal 3) Difficile 4) Cauchemar;");
       choix = e.nextInt();
       
       
       
       
       
    
       
        
    }
    
}
