package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(totalResult(fillInt(sc.nextInt())));
    }
    public static int totalResult(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; ++i)
            res += arr[i];
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