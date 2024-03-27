package wissel;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U04_AFG15b {
    public static int countName(String[] arr, String marke, int z, int i) {

        if (i < arr.length) {
            if (arr[i].equals(marke)) { // Verwenden von .equals() statt ==
                z++;
            }
            return countName(arr, marke, z, i + 1); // Korrekte Rückgabe des rekursiven Aufrufs
        }
        return z;
    }

    public static String[] generateCarBrands(int size) {
        String[] arr = new String[size];
        String[] autoMarken = {"Toyota", "Ford", "Honda", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Nissan", "Hyundai"};
        for (int i = 0; i < arr.length; ++i)
            arr[i] = autoMarken[ThreadLocalRandom.current().nextInt(0, autoMarken.length)];
        return arr;
    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-Größe eingeben: ");
        int size = sc.nextInt();
        sc.nextLine(); // Konsumiert das Zeilenende
        String[] arr = generateCarBrands(size);
        print(arr);
        System.out.println("\nAutomarke eingeben: ");
        String marke = sc.nextLine();
        int z = countName(arr, marke, 0, 0); // Vereinfachung der Parameterübergabe
        System.out.println("Häufigkeit für Automarke " + marke + ": " + z);
    }
}