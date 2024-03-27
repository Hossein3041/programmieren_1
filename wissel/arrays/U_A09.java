package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = fillInt(size);
        print(arr);
        print(swap(arr, minMax(arr)));
    }
    public static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + "\t");
        System.out.println();
    }
    public static int[] swap(int[] arr, int[] res){
        int minI = res[0], maxI = res[1];
        int tmp = arr[minI];
        arr[minI] = arr[maxI];
        arr[maxI] = tmp;
        return arr;
    }
    public static int[] minMax(int[] arr){ // Für das Vertauschen von Werten, immer mit Index arbeiten. Das auch bei 2D Arrays
        int minI = 0, maxI = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] < arr[minI]) minI = i;
            if(arr[i] > arr[maxI]) maxI = i;
        }
        int[] res = {minI, maxI};
        return res;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ThreadLocalRandom.current().nextInt(0,100);
        }
        return temp;
    }
}
