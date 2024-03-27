// Wandeln Sie eine Dezimalzahl in ihre binäre Darstellung um.
// Es reicht, wenn das Ergebnis in der richtigen Reihenfolge, ausgegeben wird.
// Benutzen Sie die bitweisen Operatoren >> und &.
// Sei n die Zahl 42, dann ist die Ausgabe 00000000000000000000000000101010

package wissel;
import java.util.Scanner;

public class U02_AFG04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        deziInbitWhile(zahl);
        System.out.println();
        deziInbitFor(zahl);
    }

    public static void deziInbitWhile(int number){
        int[] arr = new int[32];
        int i = arr.length-1;
        while(number != 0){
            arr[i] = number & 1;
            number >>>= 1;
            --i;
        }
        int j = 0;
        while(j < arr.length){
            System.out.print(arr[j]);
            ++j;
        }
    }
    public static void deziInbitFor(int number){
        int[] arr = new int[32];
        for(int i = arr.length-1; i >= 0; --i) {
            arr[i] = number & 1;
            number >>>= 1;
        }
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }
}

