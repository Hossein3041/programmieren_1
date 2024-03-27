package selbstlernprojekt;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class A23 {
    public static void main(String[] args){
        int[] arr = fillInt(15);
        System.out.println("org array: ");
        print(arr);
        System.out.println("sorted array: ");
        print(distribution_counting(arr, rangeOfValue(arr)));
    }
    public static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + "\t");
        System.out.println();
    }
    public static int[] distribution_counting(int[] arr, int[] maxMin){
        int max = maxMin[0], min = maxMin[1];
        int[] count = new int[max - min + 1];
        for(int i = 0; i < arr.length; ++i)
            ++count[arr[i] - min];
        for(int i1 = 0, i2 = 0; i1 < count.length; ++i1)
            for(int i3 = 0; i3 < count[i1]; ++i3)
                arr[i2++] = i1 + min;
        return arr;
    }
    public static int[] rangeOfValue(int[] field){
        int max = field[0], min = field[0];
        for(int i = 0; i < field.length; ++i){
            if(field[i] > max) max = field[i];
            if(field[i] < min) min = field[i];
        }
        int[] maxMin = {max, min};
        return maxMin;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
}
