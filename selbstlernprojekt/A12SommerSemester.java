package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A12SommerSemester {
    public static void main(String[] args){
        //int[] pos = fillInt(15);
        /*
        int[] pos = {0,2,4};
        long x = 17;
        int count = cnt(x, pos);
        System.out.println("count: " + count);
        long count2 = cntRec(x, pos, 0, 0);
        System.out.println("count2: " + count2);
         */
        //aufgabe01();
        //aufgabe02();
        int[] xyz = {13,-42,17};
        xyz[2] = 52;
        int[] b = doit(xyz,0,2);
        b[1] = 14;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

    }
    static int[] doit(int[] a, int i, int j){
        a[i] = j;
        return a;
    }
    /*
    public static int cnt(long x, int[] pos){
        int count = 0;
        for(int i = 0; i < pos.length; ++i) {
            boolean mask = (x & 1L << pos[i]) != 0;
            //long mask = 1L << pos[i];
            if (mask) ++count;
        }
        return count;
    }

     */
    /*
    public static int cntRec(long x, int[] pos, int i, int count2){
        if(i >= pos.length)
            return count2;
        boolean mask = (x & 1L << pos[i]) != 0;
        count2 = cntRec(x, pos, i+1, mask ? count2+1 : count2);
        return count2;
    }

     */
    //public static void aufgabe06(){
        /*
        Schreiben Sie eine Klassenmethode "static int cntRec(long x, int[] pos)",
        die das Gleiche berechnet wie die cnt Methode aus Aufgabe 5.
        Die Methode cntRec muss jedoch rekursiv arbeiten.
        Sie dürfen eine weitere Methode implementieren, die rekursiv arbeitet.
        Sie dürfen keine vordefinierten Klassen oder Methoden verwenden.
         */
    //}
    //public static void aufgabe05(){
        /*
        Schreiben Sie eine Klassenmethode "static int cnt(long x, int[] pos)",
        die zählt, an welchen Positionen aus dem Array pos im übergebenen Longwert x
        in der Binärcodierung eine 1 steht. Beispiel: x = 17.
        D.h. die Binärcodierung lautet: 0...010001 und die Position 0 und 4 sind auf 1 gesetzt.
        Damit wäre cnt(1,[0,1,2,3]) = 1, weil das Array die 0 enthält, aber nicht die 4.
        Aber es gilt cnt(1,[0,2,4]) = 2, da das Array die Positionen 0 und 4 enthält.
        Sie dürfen keine vordefinierten Klassen oder Methoden verwenden.
         */
    //}
    public static void aufgabe01(){
        // Welche Werte haben die Variablen nach Ausführung der folgenden Programmzeilen:
        int i = 5, j = 50;
        boolean a = false, b = true;
        if(a || b){
            j = i;
            ++i;
        } else {
            i = j;
            ++j;
        }
        a = j < i;
        b = !a;

        // a = true     b = false    i = 6    j = 5
        System.out.println(a);
        System.out.println(b);
        System.out.println(i);
        System.out.println(j);
    }
    public static void aufgabe02(){
        // Welche Werte haben die Variablen nach Ausführung der folgenden Programmzeilen:
        boolean b = true;
        boolean c = false;
        int j = 0;
        int i;
        for(i = 0; i < 50; ++i){
            j++;
            b = !b;
            ++j;
            c = (i % 2) == 0;
        }

        // b =      c =     i =     j =
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(j);
    }

    //public static void aufgabe03(){
        // Wie lauten die Werte der Zellen der beiden Integer Arrays xyz und b am Ende des Programms?
        /*
        static int[] doit(int[] a, int i, int j){
            a[i] = j;
            return a;
        }
        public static void main(String[] args){
            int[] xyz = {13,-42,17};
            xyz[2] = 52;
            int[] b = doit(xyz,0,2);
            b[1] = 14;
        }
          b[0] = 2     b[1] = 14     b[2] = 5
        xyz[0] = 1   xyz[1] = 14   xyz[2] = 5
         */
    //}

    //public static void aufgabe04(){
        /*
        public class Call{
            static int j = 0;

            static void doit(int x, int y){
                x = y;
                ++y;
                x = y;
                ++j;
            }

            public static void main(String[] args){
                int a[] = {12,-42,17};
                doit(a[j],j);
            }
        }

        Welche Werte haben die Zellen des Arrays a und die Variable j,
        wenn der Parameterübergabemechanismus lautet:

        "call-by-value":        a[0] =     a[1] =      a[2] =      j =
        "call-by-reference":    a[0] =     a[1] =      a[2] =      j =
        "call-by-name:          a[0] =     a[1] =      a[2] =      j =
         */
    //}
    public static int[] fillInt(int arrLength){
        int[] temp = new int[arrLength];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(0, 100);
        return temp;
    }
}
