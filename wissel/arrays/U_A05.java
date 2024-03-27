package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A05 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print(secondMax(fillInt(sc.nextInt())));
    }
    public static int secondMax(int[] arr){
        int max = arr[0], smax = arr[0];
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > max) max = arr[i];
            if(arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        return smax;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ThreadLocalRandom.current().nextInt(-100,100);
        }
        return temp;
    }
}
