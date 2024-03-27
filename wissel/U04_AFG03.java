// Schreiben Sie eine Klassenmethode, die zu einer beliebigen Basis
// und einem beliebigen Exponenten den Potenzwert rekursiv berechnet.
package wissel;
import java.util.Scanner;
public class U04_AFG03 {
    public static int potenzWert2(int b, int ex){
        if(ex == 0)
            return 1;
        else
            return b * potenzWert2(b, ex-1);
    }
    public static int potenzWert1(int b, int ex){
        if(ex > 0)
            return b * potenzWert1(b, ex-1);
        else
            return 1;
    }

    public static int potenzWert3(int b, int ex){
        return (ex == 0) ? 1 : b * potenzWert3(b, ex-1);
    }
    public static int potenzWert4(int b, int ex){
        return (ex > 0) ? b * potenzWert4(b, ex-1) : 1;
    }
    public static void print(int erg){
        System.out.println(erg);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wert für Basis: ");
        int b = sc.nextInt();
        System.out.println("Wert für Exponent: ");
        int ex = sc.nextInt();
        print(potenzWert1(b, ex));
        print(potenzWert2(b, ex));
        print(potenzWert3(b, ex));
        print(potenzWert4(b, ex));
    }
}
