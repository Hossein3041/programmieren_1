// Erstellen Sie ein Java Programm, das aus einem Array
// den zweitgroessten Wert ermittelt und ausgibt.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG05 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-Größe: ");
        ausgabe(ergebnis(sc.nextInt()));
    }
    public static void ausgabe(int erg){
        System.out.println();
        System.out.println("Zweitgrößter Wert: " + erg);
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
    }

    public static int ergebnis(int arrLength){
        int[] arr = fillInt(arrLength);
        printArr(arr);
        int biggest = smallest(arr);
        int twoBiggest = smallest(arr);
        for(int i = 0; i < arr.length; ++i){
           if(arr[i] > biggest){
               twoBiggest = biggest;
               biggest = arr[i];
           }
           if(arr[i] > twoBiggest && arr[i] != biggest){
               twoBiggest = arr[i];
           }
        }
        return twoBiggest;
    }

    public static int smallest(int[] arr){
        int small = arr[0];
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] < small)
                small = arr[i];
        }
        return small;
    }

    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i){
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
        return temp;
    }
}
