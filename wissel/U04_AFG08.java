// Es soll eine Ganzzahl über die Tastatur eingegeben werden.
// Schreiben Sie eine Klassenmethode, die die Quersumme der Ziffern
// berechnet und zurückgibt.
package wissel;
import java.util.Scanner;
public class U04_AFG08 {
    public static void print(int erg){
        System.out.println(erg);
    }
    public static int querSumme(int zahl, int erg){
        return (zahl > 0) ? (erg = zahl % 10) + querSumme(zahl/10, erg) : 0;
        /*
        if(zahl > 0){
            int rest = zahl % modulo;
            zahl /= divisor;
            return rest + querSumme((zahl), divisor, modulo);
        } else {
            return 0;
        }

         */
    }
    public static int doit(int number){
        return (number > 0) ? number % 10 + doit(number/10) : 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int divisor = 10, modulo = 10;
        int erg = 0;
        //print(querSumme(sc.nextInt(), erg));
        print(doit(12345));
    }
}
