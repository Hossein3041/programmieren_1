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
class Life2{
    int[][] life;
    int[][] k2D;
    int zeile,spalte,x;
    public Life2(int zeile1, int spalte1, int x1){
        this.zeile = zeile1;
        this.spalte = spalte1;
        this.x = x1;
        life = new int[zeile][spalte];
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
                life[i][j] = wert > 0.5 ? 1 : 0;
            }
        }
    }
    public void neuberechnung(){
        int[][] life2 = new int[zeile][spalte];
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                int z = nachbarnTrue(i, j);
                if(life[i][j] > 0 && (z == 2 || z == 3))
                    life2[i][j] = ++life[i][j];
                if(life[i][j] == 0 && (z == 3))
                    life2[i][j] = 1;
                if((z > 3) || (z < 2))
                    life2[i][j] = 0;
            }
        }
        life = life2;
    }
    public void koordinaten2D(){
        int count = 0;
        for(int i = 0; i < life.length; ++i)
            for(int j = 0; j < life[i].length; ++j)
                if(nachbarnTrue(i, j) == x)
                    ++count;
        koordinaten2D_2(count);
    }
    public void koordinaten2D_2(int count){
        int[][] res = new int[count][2]; int i1 = 0;
        for(int i = 0; i < life.length; ++i)
            for(int j = 0; j < life[i].length; ++j)
                if(nachbarnTrue(i, j) == x){
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
        boolean hit = nachbarnTrue(i, j) == x;
        int[][] res = koordinaten2DRec(nextI, nextJ, hit ? count+1 : count);
        if(hit){
            res[count][0] = i;
            res[count][1] = j;
        }
        return res;
    }
    public int nachbarnTrue(int i, int j){
        int z = 0;
        for(int x = -1; x <= 1; ++x){
            for(int y = -1; y <= 1; ++y){
                int I = (i+x + life.length) % life.length;
                int J = (j+y + life[i].length) % life[i].length;
                if(!(x == 0 && y == 0) && life[I][J] > 0)
                    ++z;
            }
        }
        return z;
    }
    public void print(){
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                char zelle = umwandlung(life[i][j]);
                System.out.print(zelle);
            }
            System.out.println();
        }
        System.out.println();
    }
    public char umwandlung(int wert){
        switch(wert){
            case 0: return ' ';
            case 1: return '.';
            case 2: return 'o';
            case 3: return 'O';
            default: return '*';
        }
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

public class U10_AFG01b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeile: ");
        int zeile = sc.nextInt();
        System.out.println("Spalte: ");
        int spalte = sc.nextInt();
        System.out.println("Koordinaten für Zellen, mit x auf true: ");
        int x = sc.nextInt();
        Life2 life = new Life2(zeile, spalte, x);
    }
}
