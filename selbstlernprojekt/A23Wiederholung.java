package selbstlernprojekt;
import java.util.Scanner;
import java.lang.Math;

public class A23Wiederholung {
    static int count = 0;
    public static boolean solveQueens(int[][] board, int N, int spalte) {
        if (spalte >= N) {
            ++count;
            return false;
        }
        for(int zeile = 0; zeile < board.length; ++zeile){
            if(isSafe(board, N, zeile, spalte)){
                board[zeile][spalte] = 1;
                if(solveQueens(board, N, spalte+1))
                    return true;
                board[zeile][spalte] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board, int N, int zeile, int spalte){
        for(int i = 0; i < spalte; ++i)
            if(board[zeile][i] == 1)
                return false;
        for(int i = zeile, j = spalte; i >= 0 && j >= 0; --i, --j)
            if(board[i][j] == 1)
                return false;
        for(int i = zeile, j = spalte; j >= 0 && i < N; ++i, --j)
            if(board[i][j] == 1)
                return false;
        return true;
    }
    public static void main(String[] args){
        int N = 8;
        int[][] board = new int[N][N];
        solveQueens(board, N, 0);
        System.out.println("Number of solutions: " + count);
    }
}

/*
 Alte Lösung:
 static int count  = 0;
    public static boolean solveQueens(int[][] board, int N, int spalte){
        if(spalte >= N){
            ++count;
            return false;
        }

        for(int zeile = 0; zeile < board.length; ++zeile){ // Eine Dame in jeder Zeile der Spalte platzieren.
            if(isSafe(board, N, zeile, spalte)){ // Prüfen, ob Platzierung der Dame sicher ist.
                board[zeile][spalte] = 1; // Dame platzieren.

                if(solveQueens(board, N,spalte + 1)) // Rekursiver Aufruf der nächsten Spalte
                    return true;

                board[zeile][spalte] = 0; // Backtracking: Entferne die Dame und versuche die nächste Reihe
                  //Backtracking-Erklärung:
                  // Das Ziel des Algorithmus ist die Platzierung aller Damen, und nicht nur eine Dame:
                  //Wenn jedoch eine Dame platziert wurde, und das dazu führen kann, dass alle anderen Damen
                  // nicht platziert werden können, dann muss man die Platzierung für eine Dame zurücknehmen,
                  //und eine andere Platzierung finden, womit man eine Lösung für alle Damen finden kann.
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board, int N, int zeile, int spalte){
        for(int i = 0; i < spalte; ++i) // Bei der Zeile, alle Spalten links davon prüfen
            if(board[zeile][i] == 1)
                return false;
        for(int i = zeile, j = spalte; i >= 0 && j >= 0; --i, --j) // Diagonale oben auf der linken Seite prüfen
            if(board[i][j] == 1)
                return false;
        for(int i = zeile, j = spalte; j >= 0 && i < N; ++i, --j) // Diagonale unten auf der linken Seite prüfen
            if(board[i][j] == 1)
                return false;
        return true;
    }
    public static void main(String[] args){
        int N = 8;
        int[][] board = new int[N][N];
        solveQueens(board, N, 0);
        System.out.println("Anzahl der Lösungen: " + count);
    }



 */
