// Verändern Sie Ihr Life Programm, sodass zunächst ein zweidimensionales boolesches Array
// angelegt wird, das so groß ist, wie die Ausgabe sein soll.
// Verwenden Sie bei der Erzeugung des Arrays für die Größenangaben wieder die int-Variablen.
// In einer Initialisierungsphase sollen die Zellen des Arrays wie folgt beschrieben werden
// (T = true, F = false):
// TFTFTFTFTFT
// TFFTFFTFFTF
// TFFFTFFFTFF
// TFFFFTFFFFT
// TFFFFFTFFFF
// Geben Sie anschließend das Array auf dem Bildschirm aus. Dabei soll die Ausgabe derart aussehen,
// wie im Programm aus Übung 03.

package kelb;
import java.util.Scanner;

public class U04_AFG05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeile: ");
        int zeile = sc.nextInt();
        System.out.println("Spalte: ");
        int spalte = sc.nextInt();

        boolean[][] life = new boolean[zeile][spalte];

        int i = 0;
        while(i < life.length){
            int j = 0;
            while(j < life[i].length){
                if(j % (2+i) == 0){
                    life[i][j] = true;
                }
                ++j;
            }
            ++i;
        }

        int i1 = 0;
        while(i1 < life.length){
            int j1 = 0;
            while(j1 < life[i1].length){
                if(life[i1][j1]){
                    System.out.print("T");
                } else {
                    System.out.print("F");
                }
                ++j1;
            }
            System.out.println();
            ++i1;
        }
    }
}
