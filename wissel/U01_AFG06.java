// Schreiben Sie eine Methode, die ermittelt, ob die eingegebene Zahl eine Primzahl ist.
// Das Ergebnis (true oder false), dieser Prüfung soll ausgegeben werden

package wissel;
import java.util.Scanner;

public class U01_AFG06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        boolean erg = primTest(zahl);
        System.out.println(erg);

    }

    public static boolean primTest(int zahl){
        if(zahl <= 1)
            return false;

        for(int i = 1; i <= zahl; ++i)
            if(zahl % i == 0 && i != 1 && i != zahl)
                return false;

        return true;
    }
}
