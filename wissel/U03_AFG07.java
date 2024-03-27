// Es sollen die Summe aller Felder eines 2 dimensionalen Arrays
// berechnet und ausgegeben werden.

package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class U03_AFG07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ausgabe(ergebnis(sc.nextInt()));
    }

    public static void ausgabe(int erg) {
        System.out.print("Summe aller Felder 2D: " + erg);
    }

    public static int ergebnis(int arrLength){
        int[][] arr = fillInt(arrLength);
        int erg = 0;
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; ++j)
                erg += arr[i][j];
        }

        return erg;
    }
    public static int[][] fillInt(int arrLength){
        int[][] temp = new int[arrLength][arrLength];
        for(int i = 0; i < temp.length; ++i) {
            for(int j = 0; j < temp[i].length; ++j)
                temp[i][j] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
        return temp;
    }
}
