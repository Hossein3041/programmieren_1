/*
Aufgabe: Filtern nach Bitwert:

Ziel: Schreiben Sie ein Programm, das ein 1D Array von Ganzzahlen (int[]) und eine spezifische Bit-position erhält.
Das Programm soll alle Zahlen aus dem Array herausfiltern, bei denen das Bit an der gegebenen Position auf 1 gesetzt ist.
Die gefilterten Zahlen sollen in einem neuen Array zurückgesetzt werden.

Beispiel: Gegeben sei das Array [3,5,8,10] und die Bit-position 1 (wobei die Zählung bei 0 beginnt).
Das Ergebnis sollte [3,5,8] sein, da diese Zahlen an der Bit-position 1 eine 1 haben.

Iterative Lösung:
1. Zähle, wie viele Elemente das Kriterium erfüllen, um die Größe des Ergebnisarrays zu bestimmen.
2. Durchlaufe das Array erneut, um Elemente, die das Kriterium erfüllen, ins Ergebnisarray einzufügen.

Rekursive Lösung:
1. Zerlege das Problem in kleinere Teile, indem du die Aufgabe für ein kleiner werdendes Array aufrufst,
bis du das Ende des Arrays erreichst.
2. Sammle die Ergebnisse auf dem Rückweg der Rekursion

Bitweise Operatoren (Fort.) - Folie 206
diese Operatoren können dazu verwendet werden, bestimmte Bit-positionen zu testen:
- 1 << 0        ist die 0te Bit-position
  Bei der Zahl 1, wird die Bit-position 0, das gesetzt ist,
  um 0 Bit-positionen nach rechts verschoben.
  Ergebnis: 1

- 1 << 1        ist die 1te Bit-position
  Bei der Zahl1, wird die Bit-position 0, das gesetzt ist,
  um 1 Bit-Positionen nach rechts verschoben.
  Ergebnis: 2

- (m & (1 << 2)) != 0      ist genau dann wahr, wenn die 2te Bit-position von m, 1 ist.
  Die zweite Bit-position wäre 4.
  Wenn die Bedingung wahr ist, dann ist das Ergebnis 4. Sonst 0

- boolean[] b = new boolean[4];
  int N = 1 << b.length;
  // N = 1 << 4
  // die 0te Bit-position, was gesetzt ist, wird 4 Bit-positionen nach rechts verschoben
  // Also: von 1 zu 2, 4, 8 und schließlich 16.
  // N = 16;
 */
package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A09 {
    public static void main(String[] args){
      int size = 15;
      int x = 5;
      int[] arr = fillInt(size);
      print(arr);
      int[] res = detectCount(arr, x);
      print(res);
      int[] resRec = detectCountRec(arr, x, 0, 0);
      print(resRec);

    }
    public static int[] detectCountRec(int[] arr, int x, int i, int count){
        if(i >= arr.length)
            return new int[count];
        boolean hit = (arr[i] & 1 << x) != 0;
        int[] res = detectCountRec(arr, x, i+1, hit ? count+1 : count);
        if(hit){
            res[count] = arr[i];
        }
        return res;
    }
    public static int[] detectCount(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if((arr[i] & 1 << x) != 0)
                ++count;
        int[] res = detectArr(arr, count, x);
        return res;
    }
    public static int[] detectArr(int[] arr, int count, int x){
        int[] res = new int[count]; int i1 = 0;
        for(int i = 0; i < arr.length; ++i)
            if((arr[i] & 1 << x) != 0)
                res[i1++] = arr[i];
        return res;
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(0, 100);
        return temp;
    }

}
