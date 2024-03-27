// Zwei Zahlen a und b können dadurch multipliziert werden,
// dass eine Schleife von 0 bis b-1 läuft und immer wieder zum Ergebnis a hinzuaddiert.
// Implementieren Sie eine Methode mult_iter, die dieses Verfahren iterativ implementiert
// und eine Methode mult_rec, die dieses Verfahren rekursiv implementiert.
// Beachten Sie, dass a und b auch jeweils negativ sein können.
package kelb;
import java.util.Scanner;
public class U09_AFG04 {
    public static void main(String[] args) {
        System.out.println("Numbers to multiply: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i = 0; i < 2; ++i){
            switch (i){
                case 0:
                    System.out.println("Iterativ: ");
                    print(a, b, mult_iter(a, b));
                    break;
                case 1:
                    System.out.println("Rekursiv: ");
                    print(a, b, mult_rec(a, b));
                    break;
            }
        }
    }
    public static int mult_iter(int a, int b){
        int erg = 0;
        if(a < 0 && b < 0) {
            a = (~a + 1); b = ~b + 1;
        }
        if(a > 0 && b < 0){
            int tmp = a;
            a = b;
            b = tmp;
        }
        for(int i = 0; i < b; ++i)
            erg += a;

        return erg;
    }
    public static int mult_rec(int a, int b){
        if(b == 0)
            return 0;
        boolean bMin = a > 0 && b < 0;
        boolean abMin = a < 0 && b < 0;
        return (bMin ? b : (abMin ? (~a + 1) : a)) + mult_rec(bMin ? b : (abMin ? (~a + 1) : a), bMin ? a-1 : (abMin ? (~b + 1)-1 : b-1));
    }
    public static void print(int a, int b, int result){
        System.out.println(a + " * " + b + " : " + result);
    }
}