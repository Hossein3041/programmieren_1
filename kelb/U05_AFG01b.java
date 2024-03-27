// Stellen Sie Ihr Life Programm auf die for-Schleife um. Verwenden Sie für den Schleifenabrruch
// die length Information des Arrays.
// Nach Ausgabe des Arrays berechnen Sie ein neues boolesches Array der gleichen Größe.
// Die Regeln, wann eine Zeile auf true gesetzt wird, lauten wie folgt:
// - ist die Zelle true und in der Nachbarschaft gibt es 2 oder 3 Zellen mit true,
//    bleibt die Zelle true
// - ist die Zelle false und in der Nachbarschaft gibt es 3 Zellen mit true,
//    wird die Zelle true
// - gibt es mehr als 3 oder weniger als 2 true in der Nachbarschaft, wird die Zelle mit false besetzt.

package kelb;
import java.util.Scanner;

public class U05_AFG01b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeile: ");
        int zeile = sc.nextInt();
        System.out.println("Spalte: ");
        int spalte = sc.nextInt();

        boolean[][] life = new boolean[zeile][spalte];
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                if(j % (2+i) == 0){
                    life[i][j] = true;
                }
            }
        }

        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                if(life[i][j]){
                    System.out.print("T");
                } else {
                    System.out.print("F");
                }
            }
            System.out.println();
        }

        System.out.println("___________");

        boolean[][] life2 = new boolean[zeile][spalte];
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){

                int z = 0;

                for(int x = -1; x <= 1; ++x){
                    for(int y = -1; y <= 1; ++y){
                        int I = i+x;
                        int J = j+y;

                        if(I >= 0 && J >= 0 && I < life.length && J < life[i].length && !(x == 0 && y == 0) && life[I][J]){
                            ++z;
                        }
                    }
                }

                if(life[i][j] && (z == 2 || z == 3)){
                    life2[i][j] = true;
                }

                if(!life[i][j] &&  z == 3){
                    life2[i][j] = true;
                }

                if((z > 3) || (z < 2)){
                    life2[i][j] = false;
                }

                if(life2[i][j]){
                    System.out.print("T");
                } else {
                    System.out.print("F");
                }
            }
            System.out.println();
        }

    }
}
