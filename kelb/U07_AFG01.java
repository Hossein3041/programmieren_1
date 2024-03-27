// Verändern Sie die Initialisierung der Zellen in Ihrem Life Programm.
// Die Zellen sollen jetzt zufällig mit booleschen Werten initialisiert werden.
//
// Verwenden Sie dazu den Methodenaufruf java.lang.Math.random(). Dieser liefert
// einen zufälligen Double-Wert zwischen 0.0 und 1.0 zurück.
//
// Schreiben Sie eine Methode, die einen int-Wert x übergeben bekommt und alle
// Zellen ermittelt, bei denen von den 8 Nachbarn x-viele auf true gesetzt sind.
// Die Koordination dieser Zellen, die x-viele True-Nachbarn haben
// sollen als Array zurückgeliefert werden.
//
// Programmieren Sie die vorherige Methode erneut, sodass sie rekursiv arbeitet.
package kelb;
import java.util.Scanner;
import java.lang.Math;

public class U07_AFG01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeile: ");
        int zeile = sc.nextInt();
        System.out.println("Spalte: ");
        int spalte = sc.nextInt();

        boolean[][] life = initialisierung(zeile, spalte);
        boolean[][] life2 = neuberechnung(life);
        print(life);
        System.out.println();
        print(life2);

        System.out.println("Koordinaten für Zellen, mit x auf true");
        int x = sc.nextInt();
        int[][] k2D = koordinaten2D(life2, x);
        System.out.println("Iterativ");
        printInt(k2D);
        System.out.println();
        int[][] k2DRec = koordinaten2DRec(life2, x, 0, 0, 0);
        System.out.println("Rekursiv");
        printInt(k2DRec);

    }
    public static boolean[][] initialisierung(int zeile, int spalte){
        boolean[][] life = new boolean[zeile][spalte];
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                double wert = Math.random();
                life[i][j] = wert > 0.5;
            }
        }
        return life;
    }
    public static boolean[][] neuberechnung(boolean[][] life){
        boolean[][] life2 = new boolean[life.length][life[0].length];
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                int z = nachbarnTrue(life, i, j);
                if(life[i][j] && (z == 2 || z == 3))
                    life2[i][j] = true;
                if(!life[i][j] && (z == 3))
                    life2[i][j] = true;
                if((z > 3) || (z < 2))
                    life2[i][j] = false;
            }
        }
        return life2;
    }
    public static int[][] koordinaten2D(boolean[][] life2, int x){
        int count = 0;
        for(int i = 0; i < life2.length; ++i)
            for(int j = 0; j < life2[i].length; ++j)
                if(nachbarnTrue(life2, i, j) == x)
                    ++count;
        int[][] res = koordinaten2D_2(life2, x, count);
        return res;
    }
    public static int[][] koordinaten2D_2(boolean[][] life2, int x, int count){
        int[][] res = new int[count][2]; int i1 = 0;
        for(int i = 0; i < life2.length; ++i)
            for(int j = 0; j < life2[i].length; ++j)
                if(nachbarnTrue(life2, i, j) == x){
                    res[i1][0] = i;
                    res[i1++][1] = j;
                }
        return res;
    }
    public static int[][] koordinaten2DRec(boolean[][] life2, int x, int i, int j, int count){
        if(i >= life2.length)
            return new int[count][2];
        int nextI = i, nextJ = j+1;
        if(nextJ >= life2[i].length){
            nextI = i+1;
            nextJ = 0;
        }
        boolean hit = nachbarnTrue(life2, i, j) == x;
        int[][] res = koordinaten2DRec(life2, x, nextI, nextJ, hit ? count+1 : count);
        if(hit){
            res[count][0] = i;
            res[count][1] = j;
        }
        return res;
    }
    public static int nachbarnTrue(boolean[][] arr, int i, int j){
        int z = 0;
        for(int x = -1; x <= 1; ++x){
            for(int y = -1; y <= 1; ++y){
                int I = (i+x + arr.length) % arr.length;
                int J = (j+y + arr[i].length) % arr[i].length;
                if(!(x == 0 && y == 0) && arr[I][J]){
                    ++z;
                }
            }
        }
        return z;
    }
    public static void printInt(int[][] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; j += 2){
                int x = arr[i][0];
                int y = arr[i][1];
                System.out.print("Field: (" + x + "|" + y + ")" + "\t");
            }
            System.out.println();
        }
    }
    public static void print(boolean[][] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; ++j){
               System.out.print(arr[i][j] ? "T" : "F");
            }
            System.out.println();
        }
    }
}
