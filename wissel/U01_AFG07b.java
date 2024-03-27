// Erstellen Sie eine Klassenmethode, die prüft,
// ob es sich bei der Zahl um ein Palindrom handelt.
// Beispiel: 11211 ist ein Palindrom. Ausgabe wäre true.

package wissel;
import java.util.Scanner;

public class U01_AFG07b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        int divisor = 10;
        int modulo = 10;

        boolean erg = palindromTest(zahl, divisor, modulo);

        System.out.println(erg);
    }

    public static boolean palindromTest(int zahl, int divisor, int modulo){

        int orgZahl = zahl;
        int restWert;
        int umkehrZahl = 0;

        while(zahl != 0){
            restWert = zahl % modulo;
            umkehrZahl = umkehrZahl * 10 + restWert;
            zahl = zahl/divisor;

        }

        if(orgZahl == umkehrZahl){
            return true;
        } else {
            return false;
        }
    }
}
