package selbstlernprojekt;
public class A13WinterSemester {
    public static void main(String[] args){
        aufgabe01();
        aufgabe02();
        aufgabe03();

        // Aufgabe 05:
        char[] s = {'D','i','e','s',' ','i','s','t',' ','e','i','n',' ','t','e','s','t',' ','f','u','e','r',' ','d','a','s',' ','S','p','l','i','t'};
        char search = ' ';
        int[] res = position(s, search);
        int n = 10;
        aufUndAb(n);
        abUndAuf(n);

    }
    public static void aufUndAb(int n) {
        if(n > 0) {
            aufUndAb(n - 1);
            System.out.print(n + "\t");
        }
    }
    public static void abUndAuf(int n){
        if(n > 1){
            System.out.print(n-1 + "\t");
            abUndAuf(n-1);
        }if(n == 1){
            System.out.print(n);
        }
    }
    public static int[] position(char[] s, char search){
        int count = 0;
        for(int i = 0; i < s.length; ++i)
            if(s[i] == search)
                ++count;
        int[] res = position2(s, search, count);
        return res;
    }
    public static int[] position2(char[] s, char search, int count){
        int[] res = new int[count];
        for(int i = 0, j = 0; i < s.length; ++i)
            if(s[i] == search)
                res[j++] = s[i];
        return res;
    }
    public static void aufgabe01(){
        // Welche Werte haben die Variablen nach Ausführung der folgenden Programmzeilen:
        int i = 0, j = 34;
        boolean a = i < j, b = !a;
        if(a == b){
            i = j*2;
        } else if (a){
            i = j*3;
            ++j;
        } else {
            j += 4;
            j = j / 2;
        }

        // a =      b =     i =     j =
        System.out.println(a);
        System.out.println(b);
        System.out.println(i);
        System.out.println(j);
    }
    public static void aufgabe02(){
        // Welche Werte haben die Variablen nach Ausführung der folgenden Programmzeilen:
        int i = 0, j = 10, k = 0;
        int count = 0;
        while(j > i){
            System.out.println("Iteration:" + count);
            ++j;
            i += 2;
            System.out.println("i: " +  i);
            System.out.println("j: " +  j);
            System.out.println("k: " +  k);
            k++;
            ++count;
        }
        // i = 20     j = 20    k = 10
        System.out.println();
        System.out.println("Ende: ");
        System.out.println("i: " +  i);
        System.out.println("j: " +  j);
        System.out.println("k: " +  k);
    }
    public static void aufgabe03(){
        // Welchen Wert hat das Array a an der Stelle 9 nach Ausführung der folgenden Programmzeilen:
        int[] a = new int[10];
        int j = 0;
        while(j < a.length){
            a[j] = 1;
            j = j + 1;
        }
        for(int i = 1; i < a.length; ++i)
            a[i] = a[i-1] * 2;
        // a[9] =
        System.out.println(a[9]);
    }
    public static void aufgabe04(){
        // Gegeben sei das folgende Programm:
        /*
        public class CallBy{
            static int x = 0;
            static void magic(int i, int j){
                if(i < j)
                    x += 1;
                else
                    x -= 1;
                j = i;
                i = 42;
            }
            public static void main(String[] args){
                int a[] = {10,20,30};
                magic(a[x],a[x+1]);
            }
        }

        Welche Werte haben die Zellen des Arrays a und die Variable x,
        wenn der Parameterübergabemechanismus lautet:

        "call-by-value":        a[0] =     a[1] =      a[2] =      x =
        "call-by-reference":    a[0] =     a[1] =      a[2] =      x =
        "call-by-name:          a[0] =     a[1] =      a[2] =      x =
         */
    }
    public static void aufgabe05(){
        /*
        Schreiben Sie eine Klassenmethode "int[] position(char[] s, char search)",
        die die Position ermittelt, an denen der Buchstabe "search"
        in dem Character Array "s" vorkommt und diese Positionen in einem Integer Array zurückgibt.
        Beispiel:
        char[] s = {'D','i','e','s',' ','i','s','t','
         ','e','i','n',' ','t','e','s','t',' ','f','u','e','r','
          ','d','a','s',' ','S','p','l','i','t'};

        position(s, ' ');
        liefert das Integer Array [4,8,12,17,22,26];

        Sie dürfen keine vordefinierten Klassen oder Methoden verwenden.
         */
    }
    public static void aufgabe06(){
        /*
        Schreiben Sie eine Klassenmethode "aufUndAb(int n)", die die Zahlen "1 2 ...
        n-1 n n-1 ... 2 1 ausgibt. Die Methode muss rekursiv arbeiten. Sie dürfen
        eine weitere Methode implementieren, die rekursiv arbeitet. Sie dürfen keine
        vordefinierten Klassen oder Methoden verwenden.
         */
    }
}