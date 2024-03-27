// Erweitern Sie Ihr "Rational" Programm um Methoden, die zwei rationale Zahlen addiert,
// multipliziert, dividiert bzw. subtrahiert. Die Ergebnisse sollen jeweils gekürzt sein.
package kelb;
public class U08_AFG03 {
    public static void main(String[] args){
        int[] a = {4,6};
        int[] b = {15,24};
        int[] aNeu = kuerzen(a, ggt(a));
        int[] bNeu = kuerzen(b, ggt(b));
        for(int i = 0; i <= 5; ++i){
            switch (i){
                case 0:
                    System.out.println("Bruch a: ");
                    ausgabe(a);
                    System.out.println("Bruch a gekürzt: ");
                    ausgabe(aNeu);
                    System.out.println("_________________________");
                    break;
                case 1:
                    System.out.println("Bruch b: ");
                    ausgabe(b);
                    System.out.println("Bruch b gekürzt: ");
                    ausgabe(bNeu);
                    System.out.println("_________________________");
                    break;
                case 2:
                    System.out.println("Bruch a und b add:");
                    ausgabe(add(a, b));
                    System.out.println("Bruch a und b gekürzt add:");
                    ausgabe(add(aNeu, bNeu));
                    System.out.println("_________________________");
                    break;
                case 3:
                    System.out.println("Bruch a und b mult:");
                    ausgabe(mult(a, b));
                    System.out.println("Bruch a und b gekürzt mult:");
                    ausgabe(mult(aNeu, bNeu));
                    System.out.println("_________________________");
                    break;
                case 4:
                    System.out.println("Bruch a und b divid:");
                    ausgabe(divid(a, b));
                    System.out.println("Bruch a und b gekürzt divid:");
                    ausgabe(divid(aNeu, bNeu));
                    System.out.println("_________________________");
                    break;
                case 5:
                    System.out.println("Bruch a und b sub:");
                    ausgabe(sub(a, b));
                    System.out.println("Bruch a und b gekürzt sub:");
                    ausgabe(sub(aNeu, bNeu));
                    System.out.println("_________________________");
                    break;
            }
        }
    }

    public static void ausgabe(int[] erg){
        System.out.println(erg[0] + " / " + erg[1]);
    }
    public static int[] sub(int[] zahl1, int[] zahl2){
        int[] erg = new int[2];
        erg[0] = zahl1[0] * zahl2[1] - zahl1[1] * zahl2[0];
        erg[1] = zahl1[1] * zahl2[1];
        return erg;
    }
    public static int[] divid(int[] zahl1, int[] zahl2){
        int[] erg = new int[2];
        erg[0] = zahl1[0] * zahl2[1];
        erg[1] = zahl1[1] * zahl2[0];
        return erg;
    }
    public static int[] mult(int[] zahl1, int[] zahl2){
        int[] erg = new int[2];
        erg[0] = zahl1[0] * zahl2[0];
        erg[1] = zahl1[1] * zahl2[1];
        return erg;
    }
    public static int[] add(int[] zahl1, int[] zahl2){
        int[] erg = new int[2];
        erg[0] = zahl1[0]*zahl2[1] + zahl1[1]*zahl2[0];
        erg[1] = zahl1[1]*zahl2[1];
        return erg;
    }
    public static int[] kuerzen(int[] zahl, int ggt){
        int[] erg = new int[2];
        erg[0] = zahl[0] / ggt;
        erg[1] = zahl[1] / ggt;
        return erg;
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
