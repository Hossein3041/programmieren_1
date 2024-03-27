package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(max(fillInt(size)));
        System.out.println(min(fillInt(size)));
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; ++i)
            if(arr[i] > max) max = arr[i];
        return max;
    }
    public static int min(int[] arr){
        int min = arr[0];
        for(int i = arr.length-1; i >= 0; --i){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ThreadLocalRandom.current().nextInt(-100,100);
        }
        return temp;
    }
}
