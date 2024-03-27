// In den folgenden Übungen sollen Sie ein Java Programm "Rational" entwickeln,
// das das Rechnen mit rationalen Zahlen implementiert. Eine rationale Zahl soll
// durch ein int-Array der Länge zwei implementiert werden.
// An der Position 0 ist der Zähler gespeichert, an der Position 1 der Nenner.
// Ihr Programm soll zunächst die zwei rationalen Zahlen 4/6 und 15/24 anlegen,
// diese dann automatisch kürzen und dann ausgeben.

package kelb;

public class U05_AFG02 {
    public static void main(String[] args){
        int[] a = {4, 6};
        System.out.println("Bruch a: " + a[0] + " / " + a[1]);
        int a1Alt = a[0], a2Alt = a[1];
        if(a[0] < a[1]){
            int tmp = a[0];
            a[0] = a[1];
            a[1] = tmp;
        }

        while(a[1] != 0){
            int rest = a[0] % a[1];
            a[0] = a[1];
            a[1] = rest;
        }

        int ggta = a[0];
        a[0] = a1Alt/ggta;
        a[1] = a2Alt/ggta;
        System.out.println("Bruch a gekuerzt: " + a[0] + " / " + a[1]);


        int[] b = {15, 24};
        System.out.println("Bruch b: " + b[0] + " / " + b[1]);
        int b1Alt = b[0], b2Alt = b[1];
        if(b[0] < b[1]){
            int tmp = b[0];
            b[0] = b[1];
            b[1] = tmp;
        }

        while(b[1] != 0){
            int rest = b[0] % b[1];
            b[0] = b[1];
            b[1] = rest;
        }

        int ggtb = b[0];
        b[0] = b1Alt/ggtb;
        b[1] = b2Alt/ggtb;
        System.out.println("Bruch b gekuerzt: " + b[0] + " / " + b[1]);

    }
}
