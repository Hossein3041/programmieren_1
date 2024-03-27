// Schreiben Sie eine Klassenmethode, die die Quersumme einer Ganzzahl berechnet und ausgibt.
// Beispiel: 12345 -> 1+2+3+4+5=15

package wissel;
import java.util.Scanner;

public class U01_AFG04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt(), divisor = 10, modulo = 10;
        System.out.println("Ergebnist ist: " + qsRechner(dividend, divisor, modulo));
    }
    public static int qsRechner(int dividend, int divisor, int modulo){
        int result = 0;
        while( dividend != 0){
            result += dividend % modulo;
            dividend /= divisor;
        }
        return result;
    }
}
