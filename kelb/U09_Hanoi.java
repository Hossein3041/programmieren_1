package kelb;
public class U09_Hanoi {
    public static void main(String[] args){
        int[][] towers = new int[3][5];
        init(towers);
        printTowers(towers);
        move(towers, towers[0].length, 0, 2, 1);
    }
    public static void move(int[][] towers, int N, int iFrom, int iTo, int iVia){
        if(N > 0){
            move(towers, N-1, iFrom, iVia, iTo);
            moveStone(towers, iFrom, iTo);
            printTowers(towers);
            move(towers, N-1, iVia, iTo, iFrom);
        }
    }
    public static void printTowers(int[][] towers){
        for(int j = 0; j < towers[0].length; ++j){
            for(int i = 0; i < towers.length; ++i){
                printStone(towers[i][j]);
            }
            System.out.println();
        }
        System.out.print("-----------------------------------");
        System.out.println("----------------------------\n\n");
    }
    public static void moveStone(int[][] towers, int iFrom,int iTo){
        for(int i = 0; i < towers[iFrom].length; ++i){
            if(towers[iFrom][i] != 0){
                for(int j = towers[iTo].length-1; j >= 0; --j){
                    if(towers[iTo][i] == 0){
                        towers[iTo][j] = towers[iFrom][i];
                        towers[iFrom][i] = 0;
                        return;
                    }
                }
            }
        }
    }
    public static void printStone(int iWidth){
        if (iWidth == 0) {
            for(int i = 0;i < 21;++i)
                System.out.print(" ");
        } else {
            for(int i = 0;i < (21-iWidth) / 2;++i)
                System.out.print(" ");
            for(int i = 0;i < iWidth;++i)
                System.out.print("+");
            for(int i = 0;i < (21-iWidth) / 2;++i)
                System.out.print(" ");
        }
    }
    public static void init(int[][] towers){
        for(int i = 0; i < towers[0].length; ++i)
            towers[0][i] = 2*i+1;
    }
}
