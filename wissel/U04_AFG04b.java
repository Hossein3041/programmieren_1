// Schreiben Sie eine Methode, die das folgende Array rekursiv ausgibt.
// Einmal soll die Ausgabe bei Index 0 beginnen und dann alle Werte ausgeben.
// Die zweite Methode soll das Array in umgekehrter Reihenfolge ausgeben.
// Jetzt für ein zweidimensionales Array
package wissel;
import java.util.concurrent.ThreadLocalRandom;

public class U04_AFG04b {
    public static void printArrLast2(int[][] arr, int i, int j){
        int nextI = i, nextJ = j+1;
        if(nextJ >= arr[i].length){
            nextI = i+1;
            nextJ = 0;
            System.out.println();
        }
        if(nextI < arr.length){
            printArrLast2(arr, nextI, nextJ);
            System.out.print(arr[i][j] + ", ");
            if(i < arr.length && j == 0){
                System.out.println();
            }
        }
    }
    public static void printArrLast(int[][] arr, int i, int j){
        if(i < arr.length){
            if(j < arr[i].length){
                printArrLast(arr, i, j+1);
                System.out.print(arr[i][j] + "\t");
            } else {
                printArrLast(arr, i+1, 0);
                System.out.println();
            }
        }
    }
    public static void printArrFirst(int[][] arr, int i, int j){
        if(i < arr.length){
            if(j < arr[i].length) {
                System.out.print(arr[i][j] + "\t");
                printArrFirst(arr, i, j + 1);
            } else {
                System.out.println();
                printArrFirst(arr, i+1, 0);
            }
        }
    }
    public static void printArrFirst2(int[][] arr, int i, int j){
        int nextI = i, nextJ = j+1;
        if(nextJ >= arr[i].length){
            nextI = i+1;
            nextJ = 0;
            System.out.println();
        }
        if(nextI < arr.length){
            System.out.print(arr[i][j] + ",");
            printArrFirst2(arr, nextI, nextJ);
        }
    }
    public static int[][] fillInt(int size){
        int[][] temp = new int[size][size];
        for(int i = 0; i < temp.length; ++i)
            for(int j = 0; j < temp[i].length; ++j)
                temp[i][j] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
    public static void main(String[] args){
        int[][] nArray = fillInt(10);
        printArrFirst(nArray, 0, 0);
        System.out.println();
        printArrFirst2(nArray, 0, 0);
        System.out.println();
        printArrLast(nArray, 0, 0);
        System.out.println();
        printArrLast2(nArray, 0, 0);
    }
}
