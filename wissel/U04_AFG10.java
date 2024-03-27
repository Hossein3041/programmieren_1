// Erstellen Sie eine Klassenmethode, die rekursiv die Fakultät einer Zahl berechnet und zurückgibt.
// Benutzen Sie den Datentyp long.
// Was ist die größte Zahl, die mit diesem Datentyp als Fakultät abgebildet werden kann?
// Antwort: 20
package wissel;
import java.util.Scanner;
public class U04_AFG10 {
    public static long fakultaet(long n){
        if(n > 0)
            return n * fakultaet(n-1);
        else
            return 1;
    }
    public static long fakultaet2(long n){
        return (n > 0) ? n * fakultaet2(n-1) : 1;
    }
    public static void print(long erg){
        System.out.println(erg);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int erg = sc.nextInt();
        print(fakultaet(erg));
        print(fakultaet2(erg));
    }
}
