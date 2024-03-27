// Gegeben sei das folgende Array. Schreiben Sie eine Klassenmethode,
// die die Summe aller Felder des Arrays berechnet und zurückgibt.
// int[] nArray = {1,2,3,4,5,6,7,8,9,10};
// Jetzt für ein zweidimensionales Array
package wissel;
import java.util.concurrent.ThreadLocalRandom;
public class U04_AFG05b {
    public static void print(int erg){
        System.out.println(erg);
    }

    public static int querSumme(int[][] arr, int i, int j){
        if(i < arr.length){
            if(j < arr[i].length) {
                return arr[i][j] + querSumme(arr, i, j + 1);
            } else {
                return querSumme(arr, i+1, j);
            }
        } else {
            return 0;
        }
    }

    public static int querSumme2(int[][] arr, int i, int j){
        int nextI = i, nextJ = j+1;
        if(nextJ >= arr[i].length){
            nextI = i+1;
            nextJ = 0;
        }
        //return (i <= arr.length) ? arr[i][j] + querSumme2(arr, i, j) : 0;
        return 0;
    }

    public static int[][] fillInt(int size){
        int[][] temp = new int[size][size];
        for(int i = 0; i < temp.length; ++i)
            for(int j = 0; j < temp[i].length; ++j)
                temp[i][j] = ThreadLocalRandom.current().nextInt(0, 100);
        return temp;
    }

    public static void main(String[] args){
        int[][] nArray = fillInt(10);
        print(querSumme(nArray, 0, 0));
        //print(querSumme2(nArray, 0, 0));
    }
}
