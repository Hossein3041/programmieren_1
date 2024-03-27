package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(totalResult(fillInt(sc.nextInt())));
    }
    public static int totalResult(int[][] arr){
        int res = 0;
        for(int i = 0; i < arr.length; ++i)
            for(int j = 0; j < arr[i].length; ++j)
                res += arr[i][j];
        return res;
    }
    public static int[][] fillInt(int size){
        int[][] temp = new int[size][size];
        for(int i = 0; i < temp.length; ++i)
            for(int j = 0; j < temp[i].length; ++j)
                temp[i][j] = ThreadLocalRandom.current().nextInt(0,100);
        return temp;
    }
}
