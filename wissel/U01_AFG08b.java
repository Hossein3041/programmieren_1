// Die Ziffern einer Ganzzahl sollen in umgekehrter Reihenfolge ausgegeben werden.
// Erstellen Sie dazu eine entsprechende Methode.

package wissel;
import java.util.Scanner;

public class U01_AFG08b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        int divisor = 10;
        int modulo = 10;

        int erg = umkehrZahl(zahl, divisor, modulo);
        System.out.println(erg);
    }

    public static int umkehrZahl(int zahl, int divisor, int modulo){
        int restWert;
        int umkehrZahl = 0;

        while(zahl != 0){
            restWert = zahl % modulo;
            umkehrZahl = umkehrZahl * 10 + restWert;
            zahl = zahl/divisor;
        }

        return umkehrZahl;
    }

}
