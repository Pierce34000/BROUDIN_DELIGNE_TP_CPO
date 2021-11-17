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
        
       Scanner ch;
       int choix;
       ch= new Scanner(System.in);
       System.out.println("Choisissez la difficulté : ");
       System.out.println("1) Facile) 2) Normal 3) Difficile 4) Cauchemar;");
       choix = ch.nextInt();
       
       if (choix == 1){
            System.out.println("FACILE");
            int x = generateurAleat.nextInt(101); 
            int nombretentatives=0;
            int tentative;
            Scanner sc;
            sc=new Scanner(System.in);
            System.out.println("Devinez le nombre (compris entre 1 et 100) : ");
            tentative=sc.nextInt();
            while (tentative != x){
                nombretentatives += 1;        
                if (tentative == x){
                    System.out.println("gagné:");
                }
                if (tentative > x){
                    if (tentative >x+x*1/2){ 
                        System.out.println("vraiment trop grand");
                    }
                    else{
                        System.out.println("trop grand");
                    }
                }
                if (tentative<x){
                    if (tentative<x-x*1/2){ //si la saisie est inférieure au nb aléatoire plus sa moitié alors la valeur est vraiment trop petite
                        System.out.println("vraiment trop petit");
                    }else{
                        System.out.println("trop petit");
                    }
                }
                sc=new Scanner(System.in);
                System.out.println("saisissez une valeur entre 0 et 100:");
                tentative =sc.nextInt();
            }
            System.out.println("Le nombre de tentatives à été de: "+nombretentatives);
        }
       
       
       
       
        //mode normal
       
         if (choix == 2){
            System.out.println("NORMAL");
            int x = generateurAleat.nextInt(101); 
            int nombretentatives=0;
            int tentative;
            Scanner sc;
            sc=new Scanner(System.in);
            System.out.println("Devinez le nombre (compris entre 0 et 100) : ");
            tentative=sc.nextInt();
            while (tentative != x){
            nombretentatives += 1;        
                if (tentative == x){
                    System.out.println("gagné:");
                }
                if (tentative > x){ 
                     System.out.println("trop grand");
                }
                if (tentative < x){
                    System.out.println("trop petit");
                }
                sc=new Scanner(System.in);
                System.out.println("saisissez une valeur entre 0 et 100:");
                tentative= sc.nextInt();
            }
            System.out.println("Le nombre de tentatives à été de: "+nombretentatives);
        }
       
        //mode diffiile
          if (choix == 3){
            System.out.println("DIFFICILE:Vous n'avez que 10 essais pour 200 possibilités");
            int x = generateurAleat.nextInt(201); 
            int nombretentatives=0;
            int tentative;
            Scanner sc;
            sc=new Scanner(System.in);
            System.out.println("Saissisez une valeur entre 0 et 200: ");
            tentative=sc.nextInt();
            while (tentative != x && nombretentatives<10){
                nombretentatives += 1;        
                if (tentative == x){
                    System.out.println("gagné:");
                }
                if (tentative > x){
                    System.out.println("trop grand");
                }
                if (tentative<x){
                    System.out.println("trop petit");
                }
                sc=new Scanner(System.in);
                System.out.println("saisissez une valeur entre 0 et 200:");
                tentative= sc.nextInt();
            }
            System.out.println("Le nombre de tentatives à été de: "+nombretentatives);
        }
    } 
}
    
