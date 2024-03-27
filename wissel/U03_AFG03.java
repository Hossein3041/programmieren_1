// Es soll der kleinste Wert in einem eindimensionalen Array gesucht und ausgegeben werden.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG03 {
    public static void main(String[] args){
        System.out.println("Größe des Arrays festlegen: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kleinste Wert ist: " + ergebnis(sc.nextInt()));
    }

    public static int ergebnis(int arrLength){
        int[] arr = fillInt(arrLength);
        int small = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }

    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i){
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
        return temp;
    }
}
