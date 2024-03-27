package selbstlernprojekt;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class A22 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("determine size of array: ");
       int[] arr = fillInt(sc.nextInt());
       System.out.println("array: ");
       print(arr);
       System.out.println("sorted array from min to max: ");
       print(selection_sort(arr));
   }
   public static int[] selection_sort(int[] arr){
       for(int i1 = 0; i1 < arr.length-1; ++i1){
           int min = i1;
           for(int i2 = i1+1; i2 < arr.length; ++i2)
               if(arr[i2] < arr[min])
                   min = i2;
           swap(arr, min, i1);
       }
       return arr;
   }
   public static void swap(int[] arr, int iP1, int iP2){
       int tmp = arr[iP1];
       arr[iP1] = arr[iP2];
       arr[iP2] = tmp;
   }
   public static void print(int[] arr){
       for(int i : arr)
           System.out.print(i + "\t");
       System.out.println();
   }
   public static int[] fillInt(int size){
       int[] temp = new int[size];
       for(int i = 0; i < temp.length; ++i)
           temp[i] = ThreadLocalRandom.current().nextInt(-100,100);
       return temp;
   }
}
