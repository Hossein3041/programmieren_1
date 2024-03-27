// Eine Dezimalzahl (long) soll mithilfe der folgenden zwei Operatoren in eine Binärzahl umgewandelt werden:
// &, >>>
// Die Einsen und Nullen sind in einem int Array zu speichern(kein String).
package kelb;
import java.util.Scanner;
public class U07_AFG03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long zahl = sc.nextLong();
        ausgabe(dInbArrayFor(zahl));
        System.out.println();
        ausgabe(dInbArrayWhile(zahl));
    }
    public static void ausgabe(long[] arr){
        for(long i : arr)
            System.out.print(i);
    }
    public static long[] dInbArrayFor(long zahl){
        long[] arr = new long[64];
        for(int i = arr.length-1; i >= 0; --i){
            arr[i] = zahl & 1;
            zahl >>>= 1;
        }
        return arr;
    }
    public static long[] dInbArrayWhile(long zahl){
        long[] arr = new long[64];
        int i = arr.length-1;
        while(zahl != 0){
            arr[i] = zahl & 1;
            zahl >>>= 1;
            --i;
        }
        return arr;
    }
}
