// Es sollen der größte und der kleinste Wert in einem
// 2 dimensionalen Array ermittelt und getauscht werden.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-Größe: ");
        int[][] arr = fillInt(sc.nextInt());
        ausgabe(arr);
        ausgabe(swap(arr));
    }

    public static void ausgabe(int[][] arr){
        for(int i = 0; i < arr[0].length; ++i)
            System.out.print("___");
        System.out.println();

        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < arr[0].length; ++i)
            System.out.print("___");
        System.out.println();
    }

    public static int[][] swap(int[][] arr){
        int[] i = ermitteln(arr);
        int s1 = i[0], s2 = i[1], b1 = i[2], b2 = i[3];
        int tmp = arr[s1][s2];
        arr[s1][s2] = arr[b1][b2];
        arr[b1][b2] = tmp;
        return arr;
    }

    public static int[] ermitteln(int[][] arr){
        int s1 = 0, s2 = 0, b1 = 0, b2 = 0;
        for(int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] < arr[s1][s2]) {
                    s1 = i;
                    s2 = j;
                }
                if (arr[i][j] > arr[b1][b2]) {
                    b1 = i;
                    b2 = j;
                }
            }
        }
        int[] i = {s1, s2, b1, b2};
        return i;
    }

    public static int[][] fillInt(int arrLength){
        int[][] temp = new int[arrLength][arrLength];
        for(int i = 0; i < temp.length; ++i)
            for (int j = 0; j < temp[i].length; ++j)
                temp[i][j] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
}
