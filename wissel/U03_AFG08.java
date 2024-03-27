// Es sollen der erste und der letzte Wert in einem int Array
// vertauscht werden. Schreiben Sie dazu eine Methode swap().
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = (fillInt(sc.nextInt()));
        ausgabe(arr);
        System.out.println();
        ausgabe(swap(arr));
    }

    public static void ausgabe(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    public static int[] swap(int[] arr){
            int tmp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = tmp;
            return arr;
    }

    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
}
