// Berechnen sie mithilfe einer while Schleife die Summe der ersten 100 natürlichen Zahlen.
// Es sollen immer 10 Zahlen in einer Zeile, getrennt durch einen Tabulator ausgegeben werden.
// Die println() Anweisung darf nicht zum Zeilenumbruch benutzt werden.

package kelb;

public class U04_AFG04 {
    public static void main(String[] args){
        int zahl = 100;
        int count = 0;
        int erg = 0;
        while(count <= zahl){
            erg += count;
            if(count % 10 == 0){
                System.out.print(erg + "\n");
            } else {
                System.out.print(erg + "\t");
            }
            ++count;
        }
    }
}
