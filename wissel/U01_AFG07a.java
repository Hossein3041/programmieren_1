// Erstellen Sie eine Klassenmethode, die prüft, ob es sich bei der Zahl um ein Palindrom handelt.
// Beispiel: 11211 ist ein Palindrom. Ausgabe wäre dann true.

package wissel;
import java.util.Scanner;

public class U01_AFG07a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        int divisor = 10;
        int modulo = 10;

        boolean erg = palindromTest(zahl, divisor, modulo);
        System.out.println(erg);
    }

    public static boolean palindromTest(int zahl, int divisor, int modulo){
        int z = 0;
        int zahl2 = zahl;
        int zahl3 = zahl;

        // Zifferanzahl ermittelt
        while(zahl != 0){
            ++z;
            zahl = zahl/divisor;
        }

        // 1-stellige Palindromzahl
        if(z == 1){
            return true;
        }

        // Zahl in ein Array abspeichern:

        int restWert = 0;
        int[] arr = new int[z];
        for(int i = z-1; i >= 0; --i){
            restWert = zahl2 % modulo;
            zahl2 = zahl2/divisor;
            arr[i] = restWert;
        }

        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        // Zahl umgekehrt in ein Array abspeichern:
        int[] arrUm = new int[z];
        restWert = 0;
        int a = 0;
        while(zahl3 > 0){
            restWert = zahl3 % modulo;
            arrUm[a] = restWert;
            zahl3 = zahl3/divisor;
            a++;
        }

        for(int i = 0; i < arrUm.length; ++i){
            System.out.print(arrUm[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < z; ++i){
            if(arr[i] != arrUm[i]){
                return false;
            }
        }

        return true;
    }
}
