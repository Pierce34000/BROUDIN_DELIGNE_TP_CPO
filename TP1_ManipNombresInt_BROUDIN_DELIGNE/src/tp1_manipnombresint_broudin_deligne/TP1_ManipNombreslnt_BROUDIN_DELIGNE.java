/* TP1 exerice 1
DELIGNE
BROUDIN
*/
package tp1_manipnombresint_broudin_deligne;
import java.util.Scanner;
/**
*
* @author delig
*/
public class TP1_ManipNombreslnt_BROUDIN_DELIGNE {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Question1:
    int a;
    int b;
    Scanner entier ;
    entier = new Scanner(System.in);
    System.out.println("Saisissez le premier entier");    
    a=entier.nextInt();
    System.out.println(a);
   
    System.out.println("Saisissez le deuxième entier");    
    b=entier.nextInt();
    System.out.println(b);
   
    // Question2:
    int somme=a+b;
    System.out.println("La somme des deux entiers est: "+somme);   
    int diff=a-b;
    System.out.println("La différence des deux entiers est: "+diff);   
    int prod=a*b;
    System.out.println("Le produit des deux entiers est: "+prod);  
    
    // Question3:
    int quot=a/b;
    System.out.println("Le quotient entier des deux entiers est: "+quot);
    int reste=a%b;
    System.out.println("Le reste de la division de l'entier 1 par l'entier 2: "+reste);
    }
       
}
