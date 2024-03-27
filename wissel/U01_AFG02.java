// Erstellen SIe eine Klassenmethode, die einen Dividenden, einen Divisor
// und einen Modulo Wert übergeben bekommt. Die Methode soll nichts anderes machen,
// als den Restwert einer Ganzzahl berechnen und ausgeben. Alle Restwerte.
// Welche Werte sind für den Divisor und Modulo Operator sinnvoll?

package wissel;
import java.util.Scanner;

public class U01_AFG02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt(), divisor = 10, modulo = 10;

        while(dividend > 0){
            int rest = rRechner(dividend, modulo);
            System.out.println(rest);
            dividend = qRechner(dividend, divisor);
        }
    }
    public static int qRechner(int dividend, int divisor){
        return dividend/divisor;
    }

    public static int rRechner(int dividend, int modulo){
        return dividend % modulo;
    }
}
