// Schreiben Sie ein Programm, dass zwei int Zahlen m und n einliest, m-n berechnet und ausgibt.
// Dazu dürfen Sie aber nicht die Operatoren - oder * verwenden.
// Verwenden Sie stattdessen die Binäroperatoren und den + Operator.

package kelb;
import java.util.Scanner;

public class U05_AFG03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int erg = m + (~n + 1);
        System.out.println(erg);
    }
}
