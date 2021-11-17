/*TP2 Ex3
BROUDIN 
DELIGNE
*/
package tp2_convertisseur_deligne_broudin;
 
import java.util.Scanner;
 

public class TP2_Convertisseur_DELIGNE_BROUDIN {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur temperature = new Convertisseur (); //création de l'objet
        float result=temperature.CelciusVersKelvin(45);
        System.out.println(result);
        float result2=temperature.KelvinVersCelcius(100);
        System.out.println(result2);
        float result3=temperature.KelvinVersFarenheit(-12);
        System.out.println(result3);
        System.out.println(temperature);
       
        
        //Saisie de la valeur à convertir
    float valeur;
    Scanner sc;
    sc=new Scanner(System.in);
    System.out.println("Bonjour, saisissez une valeur:");
    valeur=sc.nextFloat();
    System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
      //choix d'une opération //création du menu
        Scanner ch;
        int rep;
        ch = new Scanner(System.in);
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        rep = ch.nextInt();
       
        //exécution de la méthode:
        if (rep==1){
            float sortie= temperature.CelciusVersKelvin(valeur); // On appelle la méthode CelciusVersKelvin dans notre main pour l'exécuter
            System.out.println(valeur+" degré Celcius est égal à "+sortie+" degrés Kelvin"); 
        }
        if (rep==2){
            float sortie= temperature.KelvinVersCelcius(valeur); // On appelle la méthode KelvinVersCelcius dans notre main pour l'exécuter
            System.out.println(valeur+" degré Kelvin est égal à "+sortie+" degrés Celcius"); 
        }
        if (rep==3){
            float sortie= temperature.FarenheitVersCelcius(valeur); // On appelle la méthode FarenheitVersCelcius dans notre main pour l'exécuter
            System.out.println(valeur+" degré Farenheit est égal à "+sortie+" degrés Celcius"); 
        }
        if (rep==4){
            float sortie= temperature.CelciusVersFarenheit(valeur); // On appelle la méthode CelciusVersFarenheit dans notre main pour l'exécuter
            System.out.println(valeur+" degré Celcius est égal à "+sortie+" degrés Farenheit"); 
        }
        if (rep==5){
            float sortie= temperature.KelvinVersFarenheit(valeur); // On appelle la méthode KelvinVersFarenheit dans notre main pour l'exécuter
            System.out.println(valeur+" degré Kelvin est égal à "+sortie+" degrés Farenheit"); 
        }
        if (rep==6){
            float sortie= temperature.FarenheitVersKelvin(valeur); // On appelle la méthode FarenheitVersKelvin dans notre main pour l'exécuter
            System.out.println(valeur+" degré Farenheit est égal à "+sortie+" degrés Kelvin"); 
        }
    }
   
}
