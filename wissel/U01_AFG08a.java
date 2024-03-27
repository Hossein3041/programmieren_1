// Die Ziffern einer Ganzzahl sollen in umgekehrter Reihenfolge ausgegeben werden.
// Erstellen Sie dazu eine entsprechende Methode.
// Beispiel: 12345 -> 54321

package wissel;
import java.util.Scanner;

public class U01_AFG08a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        int divisor = 10;
        int modulo = 10;

        int[] arr = umkehrung(zahl, divisor, modulo);

        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + "");
        }
    }

    public static int[] umkehrung(int zahl, int divisor, int modulo){
        int z = 0, zahl2 = zahl;
        while(zahl != 0){
            ++z;
            zahl /= divisor;
        }

        int[] arr = new int[z]; int i = 0;
        while(zahl2 > 0){
            arr[i++] = zahl2 % modulo;
            zahl2 /= divisor;
        }

        return arr;

    }
}
