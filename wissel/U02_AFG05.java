// Erstellen Sie ein Programm, das Ganzzahl mit Hilfe der Bit-Operatoren >> und &
// in eine Binaerzahl umwandelt und diese in einem Array speichert.
// Das Array soll dann ausgegeben werden. Beachten Sie die Reihenfolge bei der Ausgabe!

package wissel;
import java.util.Scanner;

public class U02_AFG05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        int[] zahlBit = deziInBit(zahl);
        for(int i : zahlBit){
            System.out.print(i + "");
        }

        /*
        for(int i = 0; i < zahlBit.length; ++i){
            System.out.print(zahlBit[i] + " ");
        }
         */
    }

    public static int[] deziInBit(int zahl){
        int[] zahlBit = new int[32];
        int i = zahlBit.length-1;

        while(zahl != 0){
            zahlBit[i] = zahl & 1;
            zahl >>>= 1;
            --i;
        }
        /*
        for(int i = zahlBit.length-1; i >= 0; --i){
            zahlBit[i] = zahl & 1;
            zahl >>>= 1;
        }
         */

        return zahlBit;
    }
}
