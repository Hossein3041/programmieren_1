// Schreiben Sie eine rekursive Methode, die die Wurzel
// zu einer gegebenen int-Zahl mittels der fortgesetzten
// Intervallhalbierung ermittelt.
package kelb;
import java.util.Scanner;
public class U09_AFG03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = sc.nextDouble();
        System.out.println("Root of " + num + " = " + findRoot(num, 0, num, 0.001));
    }
    public static double findRoot(double num, double a, double b, double tolerance){
        double m = (a + b) / 2; // Mittelpunkt berechnen
        if(Math.abs(m*m - num) < tolerance) // Prüfen, ob Nährung genug ist
            return m; // m ist ausreichend genau für Wurzel
        boolean big = (m*m > num); // Quadrat von Mittelpunkt größer als Wurzel
        return findRoot(num, big ? a : m, big ? m : b, tolerance);
        // Linke Hälfte des Intervalls wählen oder
        // Rechte Hälfte des Intervalls wählen
    }
}
