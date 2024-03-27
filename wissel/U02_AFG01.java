// Wandeln Sie eine Dezimalzahl in ihre binaere Darstellung
// mit Hilfe der arithmethischen Operatoren % und / um und geben diese
// in der richtigen Reihenfolge aus.
// Beispiel: 42 -> 101010

package wissel;
import java.util.Scanner;

public class U02_AFG01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        int divisor = 2;
        int modulo = 2;

        int umZahl = dInbRechner(zahl, divisor, modulo);
        System.out.println("Endergebnis: " + umZahl);
    }

    public static int dInbRechner(int zahl, int divisor, int modulo){
        int bZahl = 0;
        int umkehr = 1;
        while(zahl != 0){
            int rest = zahl % modulo;
            zahl = zahl / divisor;
            bZahl = bZahl + rest * umkehr;
            umkehr = umkehr * 10;
        }

        return bZahl;
    }
}
