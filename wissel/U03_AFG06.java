// Berechnen Sie die Summe aller Felder eines 1 dimensionalen Arrays und geben diese aus.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class U03_AFG06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ausgabe(ergebnis(sc.nextInt()));
    }

    public static void ausgabe(int erg){
        System.out.println("Summe aller Felder 1D: " + erg);
    }

    public static int ergebnis(int arrLength){
        int[] arr = fillInt(arrLength);
        int erg = 0;
        for(int i = 0; i < arr.length; ++i)
            erg += arr[i];
        return erg;
    }
    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
}
