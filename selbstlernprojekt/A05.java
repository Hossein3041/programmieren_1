// Sortiere ein Array von ganzen Zahlen, in ein anderes Array wie folgt:
// Erstelle ein Array der doppelten Länge,
// Sortiere die Zahlen nach den ursprünglichen Zahlen aufwärts, sodass nach jeder Zahl, die Anzahl der Bits jener Zahl direkt mit initialisiert wird:
// z.B.: gegeben sei das Array: arr {1,2,3,4,5}
//                              arr2 = [arr.length*2]
//                              arr2[i++] = arr[i]
//                              arr2[i++] = anzahlBits(arr[i])
// Löse die Aufgabe iterativ, sowie rekursiv
// Geben Sie arr und danach arr2 aus.
package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;

public class A05 {
    public static void main(String[] args){
        int size = 15;
        int[] arr = bubble_sort(fillInt(size));
        System.out.println("Original Array sort: ");
        print(arr);
        int[] arrFinal = sortArr(arr);
        System.out.println("New Array sort iter: ");
        print(arrFinal);
        int[] arr2 = new int[arr.length*2];
        int[] arrFinalRec = sortArrRec(arr, 0, arr2);
        System.out.println("New Array sort rec: ");
        print(arrFinalRec);
    }
    public static int[] sortArrRec(int[] arr, int i, int[] arrFinal){
        if(i >= arr.length){
            return arrFinal;
        }
        int j = i * 2;
        arrFinal[j] = arr[i];
        arrFinal[j+1] = countBit(arr[i]);
        return sortArrRec(arr,i+1, arrFinal);
    }
    public static int[] sortArr(int[] arr){
        int[] arrFinal = new int[arr.length*2];
        for(int i = 0, j = 0; i < arr.length; ++i){
            arrFinal[j++] = arr[i];
            arrFinal[j++] = countBit(arr[i]);
        }
        return arrFinal;
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static int[] bubble_sort(int[] arr){
        for(int i1 = 1; i1 < arr.length; ++i1)
            for(int i2 = 0; i2 < arr.length-i1; ++i2)
                if(arr[i2] > arr[i2+1])
                    swap(arr, i2, i2+1);
        return arr;
    }
    public static void swap(int[] field,int iPos1,int iPos2) {
        int tmp = field[iPos1];
        field[iPos1] = field[iPos2];
        field[iPos2] = tmp;
    }
    public static int countBit(int number){
        int count = 0;
        while(number > 0){
            count += number & 1;
            number >>>= 1;
        }
        return count;
    }
    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(0, 100);
        return temp;
    }
}
