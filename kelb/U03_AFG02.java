// Schreiben Sie ein Programm mit dem Namen Life, dass die folgende Ausgabe produziert:
// X_X_X_X_X_X
// X__X__X__X_
// X___X___X__
// X____X____X
// X_____X____
// Zeile: 5
// Spalte: 11
// Dabei soll die Anzahl der Zeilen und Spalten jeweils
// von der Tastatur eingelesen werden (siehe nächste Aufgabe).
// Testen Sie Ihr Programm mit unterschiedlichen Spalten und Zeilen.

package kelb;
import java.util.Scanner;

public class U03_AFG02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Zeile an: ");
        int zeile = sc.nextInt();

        System.out.println("Geben Sie die Spalte an: ");
        int spalte = sc.nextInt();

        int i = 0;
        while(i < zeile){
            int j = 0;
            while(j < spalte){
                if(j % (2+i) == 0){
                    System.out.print("x");
                } else {
                    System.out.print("_");
                }
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
}
