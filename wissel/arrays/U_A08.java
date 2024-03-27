package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = fillInt(size);
        print(arr);
        print(swap(arr));
    }
    public static void print(int[] arr){
        for(int i :  arr)
            System.out.print(i + "\t");
        System.out.println();
    }
    public static int[] swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = tmp;
        return arr;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ThreadLocalRandom.current().nextInt(0,100);
        }
        return temp;
    }
}
