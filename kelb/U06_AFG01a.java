// Stellen Sie Ihr Life Programm auf Methoden um.
// Die Initialisierung, Ausgabe und Neuberechnung
// soll jeweils durch eine Methode erfolgen.
// Verändern Sie die Definition für die Nachbarschaft.
// Jetzt sollen auch die Zellen am Rand und in den Ecken jeweils 8 Nachbarn
// haben. Dazu hat der linke Rand als linken Nachbarn den ganz rechten Rand,
// die oberen Zellen als oberen Nachbarn die ganz unteren Zellen usw.
// D.h. geht man oben aus dem Feld hinaus, kommt man unten wieder hinein,
// geht man links hinaus, kommt man rechts wieder hinein.
// Führen Sie die Neuberechnung und Ausgabe immer wieder durch.
package kelb;
import java.util.Scanner;
public class U06_AFG01a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeile: ");
        int zeile = sc.nextInt();
        System.out.println("Spalte: ");
        int spalte = sc.nextInt();

        boolean[][] life = initialisierung(zeile, spalte);
        boolean[][] life2 = neuberechnung(life);
        ausgabe(life);
        System.out.println();
        ausgabe(life2);
    }

    public static boolean[][] initialisierung(int zeile, int spalte){
        boolean[][] life = new boolean[zeile][spalte];
        for(int i = 0; i < life.length; ++i)
            for(int j = 0; j < life[i].length; ++j)
                if(j % (2+i) == 0)
                    life[i][j] = true;
        return life;
    }

    public static boolean[][] neuberechnung(boolean[][] life){
        boolean[][] life2 = new boolean[life.length][life[0].length];
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                int z = 0;

                int il = life.length;
                int jl = life[i].length;
                // Nachbarschaften festlegen, und die Länge des Arrays beibehalten
                if(life[i][(j-1 + jl) % jl]){ // Zelle links
                    ++z;
                }

                if(life[i][(j+1 + jl) % jl]){ // Zelle rechts
                    ++z;
                }

                if(life[(i-1 + il) % il][j]){ // Zelle oben
                    ++z;
                }

                if(life[(i-1 + il) % il][(j-1 + jl) % jl]){ // Zelle oben Links
                    ++z;
                }

                if(life[(i-1 + il) % il][(j+1 + jl) % jl]){ // Zelle oben rechts
                    ++z;
                }

                if(life[(i+1 + il) % il][j]){ //  Zelle unten
                    ++z;
                }

                if(life[(i+1 + il) % il][(j-1 + jl) % jl]){ // Zelle unten links
                    ++z;
                }

                if(life[(i+1 + il) % il][(j+1 + jl) % jl]){ // Zelle unten rechts
                    ++z;
                }

                // 1. Bedingung:
                if(life[i][j] && (z == 2 || z == 3)){
                    life2[i][j] = true;
                }

                // 2. Bedingung:
                if(!life[i][j] && (z == 3)){
                    life2[i][j] = true;
                }

                // 3. Bedingung:
                if((z > 3) || (z < 2)){
                    life2[i][j] = false;
                }
            }
        }
        return life2;
    }

    public static void ausgabe(boolean[][] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; ++j){
                if(arr[i][j]){
                    System.out.print("T");
                } else {
                    System.out.print("F");
                }
            }
            System.out.println();
        }
    }
}
