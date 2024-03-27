// Gegeben sei das unten aufgeführte Array.
// Schreiben Sie eine Klassenmethode, die diejenige Dezimalzahl ausgibt,
// die in ihrer binaeren Darstellung die meisten 1'sen hat.
// Tipp: Sie werden mehr als eine Methode brauchen!

package wissel;

public class U02_AFG06 {
    public static void main(String[] args){

        int[] numbers = {4, 2, 9, 15, 7, 31};
        System.out.println(ergebnis(numbers));
    }

    public static int ergebnis(int[] arr){
        int erg = arr[0];
        int z1 = countEinser(arr[0]);
        for(int i = 0; i < arr.length; ++i){
            int z2 = countEinser(arr[i]);
            if(z2 > z1){
                z1 = z2;
                erg = arr[i];
            }
        }
        return erg;
    }

    public static int countEinser(int zahl){
        int z = 0;
        while(zahl != 0){
            z += zahl & 1;
            zahl >>= 1;
            // zahl >>>= 1; um auch negative Zahlen mitzunehmen
        }

        return z;
    }
}



