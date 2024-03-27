package wissel.arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class U_A01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and then size of Array: ");
        int number = sc.nextInt(), size = sc.nextInt();
        int[] arr = fillInt(size);
        for(int i = 0; i < 2; ++i){
            switch (i){
                case 0:
                    print(arr);
                    break;
                case 1:
                    System.out.println(searchIndex(arr, number));
                    break;
            }
        }
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static int searchIndex(int[] arr, int number){
        int index = -1;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == number)
                index = i;
        }
        return index;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ThreadLocalRandom.current().nextInt(-100,100);
        }
        return temp;
    }
}