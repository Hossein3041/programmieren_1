// Schreiben Sie eine Methode, die das folgende Array rekursiv ausgibt.
// Einmal soll die Ausgabe bei Index 0 beginnen und dann alle Werte ausgeben.
// Die zweite Methode soll das Array in umgekehrter Reihenfolge ausgeben.
package wissel;

public class U04_AFG04a {
    public static void printArrLast(int[] arr, int i){
        if(i < arr.length){
            printArrLast(arr, i+1);
            System.out.print(arr[i] + ", ");
        }
    }

    public static void printArrFirst(int[] arr, int i){
        if(i < arr.length){
            System.out.print(arr[i] + ", ");
            printArrFirst(arr, i+1);
        }
    }
    public static void main(String[] args){
        int[] nArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int i = 0;
        printArrFirst(nArray, i);
        System.out.println();
        printArrLast(nArray, i);
    }
}
