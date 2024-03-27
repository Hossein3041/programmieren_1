// Erstellen Sie eine rekursive Klassenmethode, die die Summe der ersten n natürlichen Zahlen berechnet.
// Das Ergebnis soll anschließend ausgegeben werden.
package wissel;
import java.util.Scanner;
public class U04_AFG02 {
    public static int sum_rec2(int n){
        int nextN = n-1;
        if(n == 0){
            return 0;
        }
        return n + sum_rec2(nextN);
    }
    public static int sum_rec1(int n){
        if(n > 0){
            return n + sum_rec1(n-1);
        } else {
            return 0;
        }
    }

    public static void print(int erg){
        System.out.println(erg);
    }

    public static int sum_rec3(int n){
        return (n > 0) ? n + sum_rec3(n-1) : 0;
    }

    public static int sum_rec4(int n){
        return (n == 0) ? 0 : n + sum_rec3(n-1);
    }
    public static void sum_rec5(int n, int res){
        if(n > 0){
            res += n;
            sum_rec5(n-1, res);
        } else if(n == 0){
            System.out.print(res);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int erg =  sc.nextInt();
        print(sum_rec1(erg));
        print(sum_rec2(erg));
        print(sum_rec3(erg));
        print(sum_rec4(erg));
        sum_rec5(erg, 0);
    }
}
