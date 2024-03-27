package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        print(maxValIn(fillInt(size)));
    }
    public static void print(int[] res){
        System.out.println("Value: " + res[0] + " index: " + res[1]);
    }
    public static int[] maxValIn(int[] arr){
        int max = arr[0], maxI = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > max){
                max = arr[i];
                maxI = i;
            }
        }
        int[] res = {max, maxI};
        return res;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ThreadLocalRandom.current().nextInt(-100,100);
        }
        return temp;
    }
}
