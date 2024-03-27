/*
Aufgabe 2: Filterung basierend auf Bit-position in "x".

Ziel: Schreibe ein Programm, das ein 1D Array von Ganzzahlen arr und eine Ganzzahl x
entgegennimmt. Das Programm soll alle Zahlen aus arr herausfiltern, für die gilt:
Das Bit an der durch den Wert in arr[i] angegebenen Position x ist gesetzt (1).
Die gefilterten Zahlen sollen in einem neuen Array zurückgegeben werden.
Zusätzlich soll die Summe dieser gefilterten Zahlen berechnet werden.

Beispiel:
- Gegeben sei das Array arr = [1,2,3] und die zahl x = 10 (1010)
- Die Zahlen an Position 1 und 3 in x sind gesetzt, also 2 und 8 in binäre Darstellung.
- Das Ergebnisarray wäre [1,3], da diese Positionen in x gesetzt sind.
- Die Summe der Werte an diesen Positionen in arr wäre 4.
 */
package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A10 {
    public static void main(String[] args){
        int size = 15;
        int x = 436430;
        int[] arr = fillInt(size);
        System.out.println("Original array: ");
        print(arr);
        int[] res = detectBitCount(x, arr);
        System.out.println("Result array: ");
        print(res);
        int countRes = countRes(res);
        System.out.println("total sum of res array: " + countRes);

        int[] resRec = detectBitRec(arr, x, 0, 0);
        System.out.println("Result array, rec: ");
        print(resRec);
        int countResRec = countResRec(resRec, 0, 0);
        System.out.println("total sum of resRec array: " + countResRec);
    }
    public static int countResRec(int[] resRec, int i, int count){
        if(i >= resRec.length){
            return count;
        }
        count = resRec[i] + countResRec(resRec, i+1, count);
        return count;
    }
    public static int[] detectBitRec(int[] arr, int x, int i, int count){
        if(i >= arr.length){
            return new int[count];
        }
        boolean hit = (x & 1 << arr[i]) != 0;
        int[] res = detectBitRec(arr, x, i+1, hit ? count+1 : count);
        if(hit){
            res[count] = arr[i];
        }
        return res;
    }
    public static int countRes(int[] res){
        int count = 0;
        for(int i = 0; i < res.length; ++i)
            count += res[i];
        return count;
    }
    public static int[] detectBitCount(int x, int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if((x & 1 << arr[i]) != 0)
                ++count;
        int[] res = detectBitArr(x, arr, count);
        return res;
    }
    public static int[] detectBitArr(int x, int[] arr, int count){
        int[] res = new int[count]; int i1 = 0;
        for(int i = 0; i < arr.length; ++i)
            if((x & 1 << arr[i]) != 0)
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
