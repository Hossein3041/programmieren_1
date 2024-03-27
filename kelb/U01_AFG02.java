// Modifizieren Sie das Programm aus der Vorlesung, so dass
// - die Summe von 1 bis 5 berechnet wird. WICHTIG: Sie dürfen nur die Zeile
// mit dem while verändern.
// - das Produkt von 1 bis 10 berechnet wird,
// - bei der Summen- bzw. Produktbildung die Zwischenergebnisse
// auch mit auf dem Bildschirm ausgegeben werden

package kelb;

public class U01_AFG02 {
    /*
    public static void main(String[] args){
        int n = 6;
        int erg = 0;
        int i = 0;
        while(i <= n){
            erg = erg + i;
            i = i + 1;
        }
        System.out.println(erg);
    }

     */

    /*
    public static void main(String[] args){
        // Summe von 1 bis 5
        int n = 6;
        int erg = 0;
        int i = 0;
        while(i < n){
            erg = erg  + i;
            i = i + 1;
            System.out.println(erg);
        }
        System.out.println(erg);
    }

     */

    public static void main(String[] args){
        // Produkt von 1 bis 10
        int n = 10;
        int erg = 1;
        int i = 1;
        while(i <= n){
            erg = erg * i;
            i = i + 1;
            System.out.println(erg);
        }
        System.out.println(erg);
    }
}
