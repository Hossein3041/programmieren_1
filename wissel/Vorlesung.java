// Wandeln Sie eine Dezimalzahl in ihre binäre Darstellung um.
// Es reicht, wenn das Ergebnis in der richtigen Reihenfolge, ausgegeben wird.
// Benutzen Sie die bitweisen Operatoren >> und &.
// Sei n die Zahl 42, dann ist die Ausgabe 00000000000000000000000000101010
package wissel;
import java.util.Scanner;

public class Vorlesung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ausgabe(zahlInBit(sc.nextInt()));
    }
    public static void ausgabe(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
    public static int[] zahlInBit(int zahl){
        int[] arr = new int[32];
        for(int i = arr.length-1; i >= 0; --i){
            arr[i] = zahl & 1;
            zahl >>>= 1;
        }
        return arr;
    }
}

