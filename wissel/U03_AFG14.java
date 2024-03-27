// Ist das folgende Programm lauffähig?
// Begründen Sie ihre Antwort
package wissel;
import java.util.concurrent.ThreadLocalRandom;

public class U03_AFG14 {
    public static void main(String[] args){
        int size = 10;
        int[] iArr = fillInt(size);
        //int[] iArr = {3,8,5,9,12,45,67,2,10};
        print(iArr);

        double[] dArr = fillDouble(size);
        //double[] dArr = {9.21,8.23,10.00,56.75};
        print(dArr);

        // Es wird zwischen den beiden print-Methoden nicht unterschieden.
        // Dies stellt jedoch kein Hindernis für die Lauffähigkeit des Programms dar.
        // Das Problem ist, dass für iArr und dArr versucht wird,
        // zweimal jeweils ein Array mit denselben Namen zu deklarieren,
        // was in Java nicht zulässig ist. Ebenso kann man dasselbe Array
        // nicht auf diese Weise neu initialisieren
        // Fehlermeldung:
        // - Variable 'iArr' is already defined in the scope
        // - Variable 'dArr' is already defined in the scope
    }

    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }

    public static double[] fillDouble(int size){
        double[] temp = new double[size];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextDouble(-100.00, 100.00);
        return temp;
    }

    public static void print(int[] temp){
        for(int x : temp)
            System.out.print(x + " ");
        System.out.println("\n");
    }

    public static void print(double[] temp){
        for(double x : temp)
            System.out.print(x + " ");
        System.out.println();
    }
}
