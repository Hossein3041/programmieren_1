package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A16_2019Klausur {
    public static void main(String[] args){
        /*
        Implementieren Sie eine iterative Klassenmethode filter_iter, die ein int-Array a
        übergeben bekommt, und ein int-Array zurückliefert, dass alle Zahlen aus a enthält,
        die eine Zweierpotenz sind. Zerlegen Sie Ihre Lösung in sinnvolle Untermethoden.
         */
        System.out.println("Original array: ");
        //int[] arr = fillInt(15);
        int[] arr = {1, 2, 4, 8, 16, 5, 10};
        print(arr);
        System.out.println("Iter array: ");
        int[] res = filter_iter(arr);
        print(res);
        System.out.println("Rec array: ");
        int[] resRec = filter_rec(arr, 0, 0);
        print(resRec);
    }
    public static int[] filter_rec(int[] arr, int i, int count){
        if(i >= arr.length)
            return new int[count];
        boolean hit = zweierPotenz(arr[i]);
        int[] resRec = filter_rec(arr, i+1, hit ? count+1 : count);
        if(hit)
            resRec[count] = arr[i];
        return resRec;
    }
    public static int[] filter_iter(int[] arr){
        /*
        Implementieren Sie eine iterative Klassenmethode filter_iter, die ein int-Array a
        übergeben bekommt, und ein int-Array zurückliefert, dass alle Zahlen aus a enthält,
        die eine Zweierpotenz sind. Zerlegen Sie Ihre Lösung in sinnvolle Untermethoden.
         */
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if(zweierPotenz(arr[i]))
                ++count;
        int[] res = filter_iter2(arr, count);
        return res;
    }
    public static int[] filter_iter2(int[] arr, int count){
        int[] res = new int[count];
        for(int i = 0, j = 0; i < arr.length; ++i)
            if(zweierPotenz(arr[i]))
                res[j++] = arr[i];
        return res;
    }
    public static boolean zweierPotenz(int number){
       return number > 0 && (number & (number - 1)) == 0;
       /*
        Die gegebene Methode isPowerOfTwo(int n) prüft, ob die Zahl n eine Zweierpotenz ist. Lassen Sie uns die Bedingung im Detail betrachten:

        n > 0:
        Diese Bedingung stellt sicher, dass die Zahl n positiv ist. Da negative Zahlen keine Zweierpotenzen sein können, ist dies ein wichtiger erster Schritt.
        (n & (n - 1)) == 0:
        Hier wird die Bitweise-UND-Operation (&) verwendet.
                Wenn n eine Zweierpotenz ist, hat es genau ein Bit gesetzt (d.h., es ist eine Kombination von 0en und genau einer 1).
        Wenn wir n - 1 berechnen, wird das niedrigstwertige gesetzte Bit in n auf 0 gesetzt und alle Bits rechts davon auf 1 gesetzt.
                Das Bitweise-UND von n und n - 1 ergibt 0, wenn n tatsächlich eine Zweierpotenz ist.
                Beispiel: Für n = 8 (2^3) ist n - 1 = 7 (111 in Binär). Das Bitweise-UND von 8 und 7 ergibt 0 (1000 & 0111 = 0000).
                Zusammengefasst: Wenn n positiv ist und (n & (n - 1)) gleich 0 ist, handelt es sich bei n um eine Zweierpotenz.
        */
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    /*
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(0, 300);
        return temp;
    }

     */
}
