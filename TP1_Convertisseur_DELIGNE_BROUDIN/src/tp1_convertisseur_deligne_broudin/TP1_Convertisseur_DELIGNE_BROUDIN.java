/*
BROUDIN
DELIGNE
 */
package tp1_convertisseur_deligne_broudin;

import java.util.Scanner;

/**
 *
 * @author piercebroudin
 */
public class TP1_Convertisseur_DELIGNE_BROUDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // temperature à convertir
        
        double temperature;
        Scanner sr;
        sr = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        temperature = sr.nextFloat();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer");
        
        Scanner cr;
        int option; 
        cr = new Scanner(System.in);
        System.out.println("1) De celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        option = cr.nextInt();
        
                if(option == 1){
            double resultat= CelciusVersKelvin(temperature);
            System.out.println(temperature + "degrés Celsius est égal à "+resultat+"degrés Kelvin");
        }
        if(option == 2){
            double resultat= KelvinVersCelcius(temperature);
            System.out.println(temperature + " degrés Kelvin est égal à "+resultat+"degrés Celsius");
        }    
        if(option == 3){
            double resultat= FarenheitVersCelcius(temperature);
            System.out.println(temperature + " degrés Farenheit est égal à "+resultat+"degrés Celsius");
        }
        if(option == 4){
            double resultat= CelciusVersFarenheit(temperature);
            System.out.println(temperature + " degrés Celsius est égal à "+resultat+"degrés Farenheit");
        }
        if(option == 5){
            double resultat= KelvinVersFarenheit(temperature);
            System.out.println(temperature + " degrés Kelvin est égal à "+resultat+"degrés Farenheit");
        }
        if(option == 6){
            double resultat= FarenheitVersKelvin(temperature);
            System.out.println(temperature + " degrés Farenheit est égal à "+resultat+"degrés Kelvin");
        }
        
    

    }
        public static double CelciusVersKelvin(double tC){
            double tK = tC + 273.15;
            return(tK);
        }
        public static double FarenheitVersCelcius(double tF){
            double tC = 5/9 * (tF-32);
            return(tC);
        }
        public static double KelvinVersCelcius(double tK){
            double tC = tK - 273.15;
            return(tC);
        }
        public static double CelciusVersFarenheit(double tC){
            double tF = 9/5 * tC +32;
            return(tF);
        }
        public static double KelvinVersFarenheit(double tK){
            double tF = CelciusVersFarenheit(KelvinVersCelcius(tK));
            return tF;
        }
        public static double FarenheitVersKelvin(double tF){
            double tK = CelciusVersKelvin(FarenheitVersCelcius(tF));
            return(tK);
        }

   
}
        
        
    

