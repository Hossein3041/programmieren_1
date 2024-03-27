// Schreiben Sie eine Methode, die ein zweidimensionales Array der Größe
// 6x6 vom Typ int erzeugt und dieses mit zweistelligen Zufallszahlen füllt.
// Danach sollen die Zeilensumme und die Gesamtsumme aller Felder berechnet
// und jeweils ausgegeben werden.
package kelb;
import java.util.concurrent.ThreadLocalRandom;
public class U06_AFG05 {
    public static void summe(int[][] arr){
        int gesamtSumme = 0;
        for(int i = 0; i < arr.length; ++i){
            int zeilenSumme = 0;
            for(int j = 0; j < arr[i].length; ++j){
                zeilenSumme += arr[i][j];
            }
            System.out.println("Zeilensumme für Zeile: " + i + ": " + zeilenSumme);
            gesamtSumme += zeilenSumme;
        }
        System.out.print("Gesamtsumme: " + gesamtSumme);
    }
    public static int[][] fillInt(int size){
        int[][] arr = new int[size][size];
        for(int i = 0; i < arr.length; ++i)
            for(int j = 0; j < arr[i].length; ++j)
                arr[i][j] = ThreadLocalRandom.current().nextInt(0, 100);
        return arr;
    }
    public static void main(String[] args){
        summe(fillInt(6));
    }
}