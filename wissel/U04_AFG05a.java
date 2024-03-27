// Gegeben sei das folgende Array. Schreiben Sie eine Klassenmethode,
// die die Summe aller Felder des Arrays berechnet und zurückgibt.
// int[] nArray = {1,2,3,4,5,6,7,8,9,10};
package wissel;
public class U04_AFG05a {
    public static void print(int erg){
        System.out.println(erg);
    }

    public static int querSumme(int[] arr, int i){
        if(i < arr.length){
            return arr[i] + querSumme(arr, i+1);
        } else {
            return 0;
        }
    }

    public static int querSumme2(int[] arr, int i){
        return (i < arr.length) ? arr[i] + querSumme2(arr, i+1) : 0;
    }
    public static void main(String[] args){
        int[] nArray = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        print(querSumme(nArray, i));
        print(querSumme2(nArray, i));
    }
}
