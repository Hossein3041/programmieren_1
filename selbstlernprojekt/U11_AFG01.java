package selbstlernprojekt;
import java.util.Scanner;
class Stone{
    int status;
    private static Stone[][] life;
    int i, j;
    public Stone(int status, int i, int j){
        this.status = status;
        this.i = i;
        this.j = j;
    }
    public static void setLife(Stone[][] life){
        Stone.life = life;
    }
    public int countNeighbour(){
        int count = 0;
        for(int x = -1; x <= 1; ++x){
            for(int y = -1; y <= 1; ++y){
                int I = (i+x + life.length) % life.length;
                int J = (j+y + life[0].length) % life[0].length;
                if(!(x == 0 && y == 0) && life[I][J].isAlive())
                    ++count;
            }
        }
        return count;
    }
    public boolean isAlive(){
        return status > 0;
    }
    public void print(){
        switch(status){
            case 0: System.out.print(' '); break;
            case 1: System.out.print('.'); break;
            case 2: System.out.print('o'); break;
            case 3: System.out.print('O'); break;
            default: System.out.print('*');
        }
    }
    public void computeNext(int count){
        if(isAlive() && (count == 2 || count == 3))
            status = ++status;
        if(!isAlive() && count == 3)
            status = 1;
        if((count > 3) || (count < 2))
            status = 0;
    }
}
class Life{
    Stone[][] life;
    int zeile, spalte;
    public Life(int zeile, int spalte){
        this.zeile = zeile;
        this.spalte = spalte;
        life = new Stone[zeile][spalte];
        this.initialisierung();
        this.print();
        this.neuberechnung();
        this.print();
    }
    public void initialisierung(){
        for(int i = 0; i < life.length; ++i)
            for(int j = 0; j < life[i].length; ++j)
                life[i][j] = new Stone(Math.random() > 0.5 ? 1 : 0, i, j);
        Stone.setLife(life); // Setze das gesamte Array für Stone;
    }
    public void print(){
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                life[i][j].print();
            }
        }
    }
    public void neuberechnung(){
        for(int i = 0; i < life.length; ++i){
            for(int j = 0; j < life[i].length; ++j){
                int count = life[i][j].countNeighbour();
                life[i][j].computeNext(count);
            }
        }
    }
}
public class U11_AFG01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeile: ");
        int zeile = sc.nextInt();
        System.out.println("Spalte: ");
        int spalte = sc.nextInt();
        Life life = new Life(zeile, spalte);
    }
}
