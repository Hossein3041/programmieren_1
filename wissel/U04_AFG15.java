// Erstellen Sie ein Java Programm, das folgende Methoden
// enthalten soll:
// print(), countName() und generateCarBrands().
// Die Methode generateCarBrands() soll ein Array der Größe n
// mit verschiedenen Automarken zufällig erzeugen und zurückgeben.
// Die Häufigkeit, mit der eine Automarke im Array vorkommt,
// soll die Methode countName() rekursiv ermitteln und zurückgeben.
// Die Automarke selbst soll über einen Scanner eingelesen werden.
// Die Methode print() dient nur zur Ausgabe des Arrays.
// Bei kleiner größe des Arrays kann man hier schnell vergleichen,
// ob das erzeugte Ergebnis korrekt ist.
// Beispiel: "Toyota", "Ford", "Honda", "Chevrolet", "Toyota",
// Eingabe über die Tastatur Toyota, dann sollte 2 ausgegeben werden.
package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U04_AFG15 {
    public static int countName(String[] arr, String marke, int z, int i){
        if(i >= arr.length){
            return z;
        }
        boolean hit = arr[i].equalsIgnoreCase(marke);
        return countName(arr, marke, hit ? z+1 : z, i+1);
    }
    public static String[] generateCarBrands(int size){
        String[] arr = new String[size];
        String[] autoMarken = {"Toyota", "Ford", "Honda", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Nissan", "Hyundai"};
        for(int i = 0; i < arr.length; ++i)
            arr[i] = autoMarken[ThreadLocalRandom.current().nextInt(0, autoMarken.length-1)];
        return arr;
    }

    public static void print(String[] arr){
        for (String s : arr)
            System.out.print(s + " , ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-Größe eingeben: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] arr = generateCarBrands(size);
        System.out.println("Automarke eingeben: ");
        System.out.println("Häufigkeit für Automarke: " + countName(arr, sc.nextLine(), 0, 0));
        System.out.println();
        print(arr);
    }
}
