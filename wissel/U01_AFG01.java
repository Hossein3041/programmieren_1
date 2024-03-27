// Erstellen Sie eine Klassenmethode, die einen Dividenden und einen Divisor
// übergeben bekommt. Die Methode soll nichts anderes machen, als den Quotienten
// berechnen und ausgeben. Nicht nur einmal!

// Eine Klassenmethode ist gekennzeichnet durch static
// Zwei Arten von Variablen: - Klassenvariablen/Globale Variablen, Lokale variablen.
package wissel;
import java.util.Scanner;

public class U01_AFG01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eine Zahl eingeben: ");
        int dividend = sc.nextInt();
        int divisor = 10;
        while(dividend > 0) {
            System.out.println("Ergebnis ist: " + dividend);
            dividend = qRechner(dividend, divisor);
        }
    }
    public static int qRechner(int dividend, int divisor){

        dividend = dividend/divisor;

        return dividend;
    }
}
