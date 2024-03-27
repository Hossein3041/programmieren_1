// Schreibe eine Methode, die prüft, ob die Anzahl der gesetzten Bits (1en) in der Binärdarstellung einer gegebenen Zahl gerade oder ungerade ist.
// Speichere die geraden Zahlen in ein Array, und die ungeraden Zahlen in ein anderes Array.
// Speichere die beiden Arrays, in den ursprünglichen Array, wie folgt:
// Das Array mit den geraden Bits, nach ihrer Anzahl aufwärts in den Array speichern, dann:
// Das Array mit den ungeraden Bits, nach ihrer Anzahl aufwärts in den Array speichern.
package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A01 {
    public static void main(String[] args){
        int size = 15;
        int[] arr = fillInt(size);
        print(arr);
        geradeUngeradeCount(arr);
    }
    public static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + "\t");
        System.out.println();
    }
    public static void geradeUngeradeCount(int[] arr){
        int gerade = 0, ungerade = 0;
        for(int i = 0; i < arr.length; ++i){
            if(countBit(arr[i]) % 2 == 0)
                ++gerade;
            else
                ++ungerade;
        }
        geradeUngeradeInit(arr, gerade, ungerade);
    }
    public static void geradeUngeradeInit(int[] arr, int gerade, int ungerade){
        int[] arrGerade = new int[gerade]; int ig = 0;
        int[] arrUngerade = new int[ungerade]; int iu = 0;
        for(int i = 0; i < arr.length; ++i){
            if(countBit(arr[i]) % 2 == 0)
                arrGerade[ig++] = arr[i];
            else if(countBit(arr[i]) % 2 != 0)
                arrUngerade[iu++] = arr[i];
        }
        orginalArrayInit(arr, arrGerade, arrUngerade, 0, 0);
    }
    public static void orginalArrayInit(int[] arr, int[] arrGerade, int[] arrUngerade, int ig, int iu){
        arrGerade = bubble_sort(arrGerade); print(arrGerade);
        arrUngerade = bubble_sort(arrUngerade); print(arrUngerade);
        int i = 0;
        while(ig < arrGerade.length)
            arr[i++] = arrGerade[ig++];
        while(iu < arrUngerade.length)
            arr[i++] = arrUngerade[iu++];
        print(arr);
        // Das Ergebnis stimmt irgendwie nicht ganz
    }
    public static int[] bubble_sort(int[] arr){
        for(int i1 = 1; i1 < arr.length; ++i1){
            for(int i2 = 0; i2 < arr.length-i1; ++i2)
                if(arr[i2] > arr[i2+1])
                    swap(arr, i2, i2+1);
        }
        return arr;
    }
    public static void swap(int[] arr, int iPos1, int iPos2){
        int tmp = arr[iPos1];
        arr[iPos1] = arr[iPos2];
        arr[iPos2] = tmp;
    }
    public static int countBit(int number){
        int count = 0;
        while(number > 0){
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
