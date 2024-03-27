// Erstellen Sie ein Programm, das eine Ganzzahl mithilfe der arithmetischen
// Operatoren % und / in ihre binaere Darstellung umwandelt und diese in einem Array speichert.
// Das Array soll dann ausgegeben werden. Beachten Sie die Reihenfolge bei der Ausgabe!

package wissel;
import java.util.Scanner;

public class U02_AFG02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        ausgabe(dInbArrayWhile(zahl, 0, 0));
        System.out.println();
        ausgabe(dInbArrayFor(zahl, 0, 0));
    }
    public static void ausgabe(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }
    public static int[] dInbArrayWhile(int zahl, int divisor, int modulo){
        int[] arr = new int[32];
        int i = arr.length-1;
        while(zahl != 0){
            int r = zahl % modulo;
            zahl /= divisor;
            arr[i] = r;
            --i;
        }
        return arr;
    }
    public static int[] dInbArrayFor(int zahl, int divisor, int modulo){
        int[] arr = new int[32];
        for(int i = arr.length-1; i >= 0 && zahl != 0; --i){
            arr[i] = zahl % modulo;
            zahl /= divisor;
        }
        return arr;
    }
}
