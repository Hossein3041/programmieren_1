// Schreiben Sie ein Java Programm, das den GGT (größten gemeinsamen Teiler)
// zu zwei int Zahlen a und b berechnet. Lesen Sie die Zahlen wie in der letzten Woche
// von der Tastatur ein.

package kelb;
import java.util.Scanner;

public class U04_AFG01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Zahl a ein: ");
        int a = sc.nextInt();
        System.out.println("Geben Sie die Zahl b ein: ");
        int b = sc.nextInt();

        while(b != 0){
            int rest = a % b;
            a = b;
            b = rest;
        }
        int ggt = a;

        System.out.println("GGT ist: " + ggt);
    }
}
