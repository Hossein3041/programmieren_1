// Erstellen Sie ein Programm, das je nach Eingabe der Höhe folgende Ausgabe erzeugt:
// Geben Sie die Höhe der Pyramide ein: 8
//        x
//       xxx
//      xxxxx
//     xxxxxxx
//    xxxxxxxxx
//   xxxxxxxxxxx
//  xxxxxxxxxxxxx
// xxxxxxxxxxxxxxx
// Benutzen Sie dafür die for-Schleife.
package kelb;
import java.util.Scanner;
public class U06_AFG03 {
    public static void pyramide(int h){
        for(int i = 0; i < h; ++i){
            for(int a = 0; a < (h-i-1); ++a)
                System.out.print(" ");
            for(int b = 0; b < (i*2+1); ++b)
                System.out.print("x");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Höhe der Pyramide: ");
        pyramide(sc.nextInt());
    }
}
