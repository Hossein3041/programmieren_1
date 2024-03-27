// Erweitern Sie Ihr "Rational" Programm derart, dass die beiden Zahlen
// einmal addiert und einmal multipliziert werden.
// Speichern Sie die Werte erneut in int-Arrays der Länge zwei ab.
// Geben Sie die Ergebnisse einmal vor dem Kürzen und einmal nach dem Kürzen aus.
package kelb;
public class U06_AFG02 {
    public static void main(String[] args){
        int[] a = {4, 6};
        System.out.println("Bruch a: ");
        ausgabe(a);
        System.out.println("Bruch a gekürzt: ");
        int[] aNeu = kuerzen(a, ggt(a));
        ausgabe(aNeu);

        int[] b = {15, 24};
        System.out.println("Bruch b: ");
        ausgabe(b);
        System.out.println("Bruch b gekürzt: ");
        int[] bNeu = kuerzen(b, ggt(b));
        ausgabe(bNeu);

        System.out.println("Bruch a und b add:");
        ausgabe(add(a, b));
        System.out.println("Bruch a und b gekürzt add:");
        ausgabe(add(aNeu, bNeu));

        System.out.println("Bruch a und b mult:");
        ausgabe(mult(a, b));
        System.out.println("Bruch a und b gekürzt mult");
        ausgabe(mult(aNeu, bNeu));
    }

    public static void ausgabe(int[] zahl){
        System.out.println(zahl[0] + " / " + zahl[1]);
    }
    public static int[] mult(int[] zahl1, int[] zahl2){
        int[] zahl = new int[2];
        zahl[0] = zahl1[0] * zahl2[0];
        zahl[1] = zahl1[1] * zahl2[1];
        return zahl;
    }
    public static int[] add(int[] zahl1, int[] zahl2){
        int[] zahl = new int[2];
        zahl[0] = zahl1[0]*zahl2[1] + zahl1[1]*zahl2[0];
        zahl[1] = zahl1[1]*zahl2[1];
       return zahl;
    }
    public static int[] kuerzen(int[] zahl, int ggt){
        int[] zahlNeu = new int[2];
        zahlNeu[0] = zahl[0] / ggt;
        zahlNeu[1] = zahl[1] / ggt;
        return zahlNeu;
    }
    public static int ggt(int[] zahl){
        int zahl0 = zahl[0], zahl1 = zahl[1];
        while(zahl1 != 0){
            int r = zahl0 % zahl1;
            zahl0 = zahl1;
            zahl1 = r;
        }
        int ggt = zahl0;
        return ggt;
    }
}
