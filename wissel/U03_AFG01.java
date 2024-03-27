// Für alle Aufgaben benutzen Sie zur Erzeugung eines Arrays
// vom Typ int, soweit erforderlich, bitte die folgende Methode:
// public static int[] fillInt(int size){
//      int[] temp = new int[size];
//      for(int i = 0; i < temp.length; ++i){
//          temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
//      }
//      return temp;
// }
// ____________________________________________________________________
//
// In einem Array soll zunächst eine Zahl gesucht werden. Die Zahl wird
// über die Tastatur eingegeben. Wenn die Zahl gefunden wurde, soll der
// Index dieser Zahl ausgegeben werden. Wurde die Zahl nicht gefunden,
// soll -1 zurückgegeben werden.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Größe das Arrays und gesuchte Zahl festlegen: ");
        System.out.println(ergebnis(sc.nextInt(), sc.nextInt()));
    }

    public static int ergebnis(int arrLength, int zahl){
        int[] arr = fillInt(arrLength);
        int index = -1;
        for(int i = 0; i < arr.length; ++i)
            if(arr[i] == zahl) index = i;
        return index;
    }

    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i){
            temp[i] = ThreadLocalRandom.current().nextInt(-100,100);
        }
        return temp;
    }
}
