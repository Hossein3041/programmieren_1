// Erstellen Sie ein Java Programm, das eine Binaerzahl einliest,
// diese in eine Dezimalzahl umwandelt und ausgibt.
// Die Dezimalzahl muss nicht gespeichert werden.
// Beispiel: Eingabe 1111 -> Ausgabe 15

package wissel;
import java.util.Scanner;

public class U02_AFG03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bZahl = sc.nextInt();
        int d = 10;
        int m = 10;

        System.out.println(bIndRechner(bZahl, d, m));
    }

    public static int bIndRechner(int bZahl, int d, int m){
        int  basis = 1;
        int dZahl = 0;

        while(bZahl != 0){
            int r = bZahl % m;
            bZahl /= d;
            dZahl += r * basis;
            basis *= 2;
        }

        return dZahl;
    }
}
