// Schreibe eine Methode, die in einem gegebenen Array, die Summe ihrer gesetzten Bits berechnet.
// Speichere das Ergebnis in ein neues Array.
// Löse die Aufgabe iterativ (mit While und For-Schleife), sowie rekursiv.
package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A02 {
    public static void main(String[] args){
        int size = 15;
        int[] arr = fillInt(size);
        print(totalBitFor(arr));
        print(totalBitWhile(arr));
        print(totalBitRec(arr, 0));
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static int[] totalBitRec(int[] arr, int i){
        if(i >= arr.length){
            return new int[arr.length];
        }
        int[] arrBit = totalBitRec(arr, i+1);
        arrBit[i] = countBit(arr[i]);
        return arrBit;
    }
    public static int[] totalBitFor(int[] arr){
        int[] arrBit = new int[arr.length];
        for(int i = 0; i < arr.length; ++i)
            arrBit[i] = countBit(arr[i]);
        return arrBit;
    }
    public static int[] totalBitWhile(int[] arr){
        int[] arrBit = new int[arr.length];
        int i = 0;
        while(i < arr.length) {
            arrBit[i] = countBit(arr[i]);
            ++i;
        }
        return arrBit;
    }
    public static int countBit(int number){
        //return (number > 0) ? (number & 1) + countBit(number >>>= 1) : 0;
        int count = 0;
        while(number != 0){
            count += number & 1;
            number >>>= 1;
        }
        return count;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ThreadLocalRandom.current().nextInt(0,100);
        }
        return temp;
    }
}
