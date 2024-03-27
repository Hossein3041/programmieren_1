// Gesucht ist die größte Zahl in einem Array und der Index an dem
// diese Zahl steht. Schreiben Sie eine Methode die, beide Werte ermittelt
// und zurückgibt. Beide Werte sollen dann ausgegeben werden.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-Größe: ");
        ausgabe(ergebnis(sc.nextInt()));
    }

    public static void ausgabe(int[] erg){
        System.out.println("Größter Wert: " + erg[0] + ", davon Index: " + erg[1]);
    }

    public static int[] ergebnis(int arrLength){
        int[] arr = fillInt(arrLength);
        int biggest = arr[0];
        int i1 = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > biggest){
                biggest = arr[i];
                i1 = i;
            }
        }
        int[] erg = {biggest, i1};
        return erg;
    }

    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i){
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
        return temp;
    }
}
