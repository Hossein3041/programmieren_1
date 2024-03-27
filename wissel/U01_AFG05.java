// Es sollen aller Teiler einer Ganzzahl ermittelt und ausgegeben werden.
// Schreiben Sie dazu eine entsprechende Klassenmethode.

package wissel;
import java.util.Scanner;

public class U01_AFG05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // 5: {1; ...; 5}
        int zahl = sc.nextInt();
        teiler(zahl);
    }

    public static void teiler(int zahl){
        System.out.println("Alle Teiler der Zahl " + zahl + ": ");
        for(int i = 1; i <= zahl; ++i){
            if(zahl % i == 0){
                System.out.print(i + "; ");
            }
        }
    }
}