// Es sollen der groesste und der kleinste Wert in einem
// eindimensionalen Array ermittelt und getauscht werden.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-Größe: ");
        int[] arr = fillInt(sc.nextInt());
        System.out.println("Array: ");
        ausgabe(arr);
        ausgabe(swap(arr));
    }
    public static void ausgabe(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static int[] swap(int[] arr){
        int[] erg = ermitteln(arr);
        int tmp = arr[erg[0]];
        arr[erg[0]] = arr[erg[1]];
        arr[erg[1]] = tmp;
        return arr;
    }
    public static int[] ermitteln(int[] arr){
        int si = 0, bi = 0;
        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] < arr[si])
                si = i;
            if (arr[i] > arr[bi])
                bi = i;
        }
        int[] erg = {si, bi};
        return erg;
    }
    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
}
