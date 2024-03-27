// Zum Lösen dieser Aufgabe benötigen Sie den sogenannten Modulo Operator %.
// Der Operator gibt den Rest nach der Division zweier Zahlen aus.
// Beispiel: 10%3 = 3 Rest 1. Das Ergebnis ist also 1.
// Schreiben Sie ein Java-Programm, das eine vierstellige Ganzzahl von der Tastatur einliest,
// und prüft und ausgibt, ob es sich bei der Zahl um ein Schaltjahr handelt oder nicht.

package kelb;
import java.util.Scanner;

public class U04_AFG03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jahr = sc.nextInt();

        if((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            System.out.println( jahr + " ist ein Schaltjahr");
        } else {
            System.out.println( jahr + " ist kein Schaltjahr");
        }
    }
}
