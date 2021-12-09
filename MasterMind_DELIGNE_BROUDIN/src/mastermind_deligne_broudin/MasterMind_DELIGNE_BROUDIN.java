/*
BROUDIN
DELIGNE
Mastermind
 */

package mastermind_deligne_broudin;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class MasterMind_DELIGNE_BROUDIN {

    
    public static void main(String[] args) {
        Random nb = new Random();
        ArrayList<Integer> nombreSecret = new ArrayList<Integer>();
        for (int j = 0; j <= 3; j++) {
            int a = nb.nextInt(6) + 1;
            nombreSecret.add(a);
            int b = nombreSecret.get(j);
            String c = Integer.toString(b);
            System.out.print(c);
        }
        System.out.println("\n");
        
        Scanner imp = new Scanner(System.in);
        String nombre = imp.nextLine();
        for (int i = 0; i <= nombre.length() - 1; i++) {
            System.out.print(nombre.charAt(i));
        }
    }
}

