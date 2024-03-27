// Schreiben Sie eine Klassenmethode, die die Ziffern einer Ganzzahl zählt
// und das Ergebnis ausgibt.

package wissel;
import java.util.Scanner;

public class U01_AFG03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt(), divisor = 10, count = 0;

        System.out.println(zZaehler(dividend, divisor, count));
    }
    public static int zZaehler(int dividend, int divisor, int count){
        while(dividend != 0){
            dividend /= divisor;
            ++count;
        }
        return count;
    }
}
