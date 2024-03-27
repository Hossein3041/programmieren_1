// Es soll der groesste Wert in einem eindimensionalen Array gesucht und ausgegeben werden
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG02 {
    public static void main(String[] args){
        System.out.println("Länge des Arrays festlegen: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Größte Wert ist: " + ergebnis(sc.nextInt()));
    }

    public static int ergebnis(int arrLength){
        int[] arr = fillInt(arrLength);
        int biggest = arr[0];
        for(int i = 0; i < arr.length; ++i)
            if(arr[i] > biggest) biggest = arr[i];
        return biggest;
    }

    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
}
