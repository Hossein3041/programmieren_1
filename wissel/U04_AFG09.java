// Implementieren Sie eine rekursive Klassenmethode x_mult_y,
// die zwei int Werte x und y übergeben bekommt und das Produkt von x und y
// zurückliefert. Sie dürfen nicht den * Operator verwenden, sondern müssen
// den + Operator verwenden. Sie dürfen weiter Methoden implementieren,
// die eventuell rekursiv arbeiten. Achten Sie darauf, dass die Vorzeichen
// richtig verarbeitet werden, sprich x_mult_y(-3,-4) muss 12 zurückliefern.
package wissel;
import java.util.Scanner;
public class U04_AFG09 {
    public static int x_mult_y(int x, int y){
        if(y > 0 && x > 0){
            return x + x_mult_y(x, y-1);
        }
        if(y < 0 && x < 0){
            x = (~x + 1);
            y = (~y + 1);
            return x_mult_y(x, y);
        }
        if(x < 0 && y > 0){
            return x + x_mult_y(x, y-1);
        }
        if(x > 0 && y < 0){
            return y + x_mult_y(y, x-1);
        }
        return 0;
    }

    public static void print(int erg){
        System.out.println(erg);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        print(x_mult_y(x, y));
    }
}
