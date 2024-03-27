// Stellen Sie Ihr Life Programm auf Klassen und Objekte um.
// Die Methoden sollen Objektmethoden werden und bekommen keine booleschen Array mehr übergeben,
// sondern greifen auf Objekt-variablen zu.
// Ersetzen Sie auch das boolesche Array durch ein int-Array.
// Mit dem int-Array soll kodiert werden, ob eine Zelle besetzt ist,
// und wenn Sie besetzt ist, wie lange sie schon besetzt ist.
// Verändern Sie die Ausgabe wie folgt:
//      Wert = 0 -> Ausgabe: Leerzeichen
//      Wert = 1 -> Ausgabe: '.'
//      Wert = 2 -> Ausgabe: 'o'
//      Wert = 3 -> Ausgabe: 'O'
//      Wert > 3 -> Ausgabe: '*'
package kelb;
import java.util.Scanner;
import java.lang.Math;
class Life{
    boolean[][] life;
    int[][] k2D;
    int zeile,spalte,x;
    public Life(int zeile1, int spalte1, int x1){
        this.zeile = zeile1;
        this.spalte = spalte1;
        this.x = x1;
        life = new boolean[zeile][spalte];
        this.initialisierung();
        this.print();
        this.neuberechnung();
        this.print();
        System.out.println("Iterativ");
        this.koordinaten2D();
        this.printInt();
        System.out.println("Rekursiv");
        k2D = koordinaten2DRec(0,0,0);
        printInt();

    }
    public void initialisierung(){
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                double wert = Math.random();
                life[i][j] = wert > 0.5;
            }
        }
    }
    public void neuberechnung(){
        boolean[][] life2 = new boolean[zeile][spalte];
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
        life = life2;
    }
    public void koordinaten2D(){
        int count = 0;
        for(int i = 0; i < life.length; ++i)
            for(int j = 0; j < life[i].length; ++j)
                if(nachbarnTrue(life, i, j) == x)
                    ++count;
        koordinaten2D_2(count);
    }
    public void koordinaten2D_2(int count){
        int[][] res = new int[count][2]; int i1 = 0;
        for(int i = 0; i < life.length; ++i)
            for(int j = 0; j < life[i].length; ++j)
                if(nachbarnTrue(life, i, j) == x){
                    res[i1][0] = i;
                    res[i1++][1] = j;
                }
        k2D = res;
    }
    public int[][] koordinaten2DRec(int i, int j, int count){
        if(i >= life.length)
            return new int[count][2];
        int nextI = i, nextJ = j+1;
        if(nextJ >= life[i].length){
            nextI = i+1;
            nextJ = 0;
        }
        boolean hit = nachbarnTrue(life, i, j) == x;
        int[][] res = koordinaten2DRec(nextI, nextJ, hit ? count+1 : count);
        if(hit){
            res[count][0] = i;
            res[count][1] = j;
        }
        return res;
    }
    public int nachbarnTrue(boolean[][] life, int i, int j){
        int z = 0;
        for(int x = -1; x <= 1; ++x){
            for(int y = -1; y <= 1; ++y){
                int I = (i+x + life.length) % life.length;
                int J = (j+y + life[i].length) % life[i].length;
                if(!(x == 0 && y == 0) && life[I][J]){
                    ++z;
                }
            }
        }
        return z;
    }
    public void print(){
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                System.out.print(life[i][j] ? "T" : "F");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printInt(){
        for(int i = 0; i < k2D.length; ++i){
            for(int j = 0; j < k2D[i].length; j += 2){
                int x = k2D[i][0];
                int y = k2D[i][1];
                System.out.print("Field: (" + x + "|" + y + ")" + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class U10_AFG01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeile: ");
        int zeile = sc.nextInt();
        System.out.println("Spalte: ");
        int spalte = sc.nextInt();
        System.out.println("Koordinaten für Zellen, mit x auf true: ");
        int x = sc.nextInt();
        Life life = new Life(zeile, spalte, x);
    }
}
