// Es soll eine Ganzzahl über die Tastatur eingegeben werden.
// Schreiben Sie eine Klassenmethode, die die Anzahl der Ziffern einer Ganzzahl
// rekursiv zählt und das Ergebnis zurückgibt.
package wissel;
import java.util.Scanner;
public class U04_AFG07 {
    public static void print(int erg){
        System.out.println(erg);
    }
    public static int anzahl(int zahl, int z){
        return (zahl > 0) ? anzahl(zahl/10, z+1) : z;
        /*
        if(zahl > 0){
            return anzahl(zahl/10, z+1);
        } else {
            return z;
        }

         */
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int z = 0;
        print(anzahl(sc.nextInt(), z));
    }
}
