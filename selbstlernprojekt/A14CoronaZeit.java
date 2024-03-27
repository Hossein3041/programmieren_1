package selbstlernprojekt;
public class A14CoronaZeit {
    public static void main(String[] args){
        Arrays();
    }
    public static void Anweisungssequenz(){
        // Gegeben sei der folgende Programmausschnitt:
        int j = 4;
        int i = 7;
        ++i;
        j = j * i;
        j++;
        int x = 0;
        if(i % 2 == 0)
            x = 34;
        else
            x = 17;

        // Welche Werten haben die Variablen:
        // i =      j =     x =
        System.out.println(i);
        System.out.println(j);
        System.out.println(x);
    }
    public static void Arrays(){
        // Gegeben sei der folgende Programmausschnitt:
        int j = 4;
        int i = j;
        System.out.println(i);
        j = 6;
        System.out.println(i);
        int[] x = {1,2};
        int[] y = x;
        System.out.println(y[1]);
        x[1] = 17;
        System.out.println(y[1]);
        x = new int[]{3,4};
        System.out.println(y[1]);
        // Welche Ausgabe produziert das Programm?
    }
    public static void reference(){
        /*
        // Gegeben sei das folgenden Programm.
        public static void doit(int i, int[] a){
            int j = i;
            a[i] = 6;
            a[j] = 13;
        }
        public static void main(String[] args){
            int x = 0;
            int[] y = {10,20,30,40};
            doit(++x,y);
            System.out.println(x);
            System.out.println(y[0]);
            System.out.println(y[1]);
            System.out.println(y[2]);
            System.out.println(y[3]);
        }
        // Wie lautet die Ausgabe?
         */
    }
    public static void programmieren1(){
        /*
        Schreiben Sie eine Klassenmethode "char[] filter(char[] a, char c)",
        die aus dem übergebenen char-Array "a" alle Vorkommen von "c" herausfiltert
        und den Rest zurückgibt.
        Beispiel:
        sei x = {'j','u','h','u'}, dann liefert filter(x,'u') das char-Array {'j','h'} zurück.

        Sie dürfen nicht die String Klasse oder irgendwelche anderen vordefinierten Klassen verwenden.
         */
    }
    public static void programmieren2(){
        /*
        Schreiben Sie eine Klassenmethode "int count(char[] a, char c)" die zu dem übergebenen
        char-Array "a" und char "c" ermittelt, wie oft der "c" in "a" vorkommt.
        Dies muss rekursiv erfolgen.
        Hierzu sollten Sie eine weitere Methode programmieren, die dann rekursiv ist
        und die weitere Parameter besitzen kann.
        Die count Methode darf von der Signatur nicht verändert werden.
        Beispiel:
        sei x = {'j','u','h','u'}, dann liefert count(x,'u'} 2 zurück.

        Sie dürfen nicht die String Klasse oder irgendwelche anderen vordefinierten Klassen verwenden.
         */
    }
}
