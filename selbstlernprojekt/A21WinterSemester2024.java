package selbstlernprojekt;
public class A21WinterSemester2024 {
    public static void main(String[] args){
        //aufgabe01();
        //aufgabe02();
        //aufgabe03();
        //ausgabe04();
        // Aufgabe 05:
        // Schreiben Sie eine Methode concatenate(int[][] i), die von durch den gegebenen Array,
        // einen neuen int[] Array erstellt, und die jeweiligen unterarray miteinander in einem verkettet:
        /*
         int[][] i = {{1,2,3},{4,5,6,7,8},{9,10},{},{11,12,13,14,15}}
         liefert das Array:
         int[] res = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
         */
        int[][] i = {{1,2,3},{4,5,6,7,8},{9,10},{},{11,12,13,14,15}};
        int[] res = concatenate(i);
        print(res);

        // Aufgabe 06:
        //long i1 = 12345;
        //long i2 = 54321;
        //boolean res = isLess(i1, i2);
        /*  Schreibe eine Methode isLess(i1, i2), die true ausgibt, falls die Summe der gesetzten Bits von i1 kleiner als die von i2 ist.
        Die Methode muss rekursiv arbeiten
         */
    }
    /*
    Meine Lösung: Nicht ganz richtig (Mit 1. Methode):

    public static boolean isLess(long i1, long i2){
        // ((i1 > 0) ? i1 & 1L + isLess(i1>>>=1L, i2) : 0)
        // ((i2 > 0) ? i2 & 1L + isLess(i1, i2>>>=1L) : 0)
        return (((i1 > 0) ? i1 & 1L + isLess(i1>>>=1L, i2) : 0) < ((i2 > 0) ? i2 & 1L + isLess(i1, i2>>>=1L) : 0)) ? true : false;
    }

    Richtige Lösung: Mit 2. Methoden (Es gibt mehrere Lösungen):
    public static boolean isLess(long i1, long i2){
        return countBit(i1) < countBit(i2)
    }
    public static long countBit(long number){
        return (number > 0) ? (number & 1) + countBit(number >>>=1) : 0;
    }
     */


    public static int[] concatenate(int[][] i){
        int countSum = 0;
        for(int i1 = 0; i1 < i.length; ++i1){
            for(int i2 = 0; i2 < i[i1].length; ++i2){
                ++countSum;
            }
        }
        int[] res = concatenate2(i, countSum);
        return res;
    }
    public static int[] concatenate2(int[][] i, int count){
        int[] res = new int[count]; int r = 0;
        for(int i1 = 0; i1 < i.length; ++i1)
            for(int i2 = 0; i2 < i[i1].length; ++i2)
                res[r++] = i[i1][i2];
        return res;
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static void aufgabe01(){
        int x = 5, y = 50;
        boolean a = x < y, b = y > x;
        if(a == b){
            ++x;
            y++;
        } // else if hab ich vergessen
        int tmp = x;
        x = y;
        y = tmp;
        a = x < y;
        System.out.print("x: " + x + "\t");
        System.out.print("y: " + y + "\t");
        System.out.print("a: " + a + "\t");
        System.out.print("b: " + b + "\t");
    }
    public static void aufgabe02(){
        int x = 0;
        int y = 0;
        int i = 20;
        for(i = 0; i < 50; ++i){
            for(int j = 0; j < 20; ++j){
                ++x;
                y++;
            }
        }
        System.out.print("x: " + x + "\t");
        System.out.print("y: " + y + "\t");
        System.out.print("i: " + i + "\t");
    }
    public static void aufgabe03(){
        int[] a = new int[10];
        int i = 20;
        for(i = 0; i < a.length; ++i)
            a[i] = i > 0 ? a[i-1] * 2 : 1;

        System.out.print("a[0]: " + a[0] + "\t");
        System.out.print("a[9]: " + a[9] + "\t");
        System.out.print("i: " + i + "\t");
    }
    public static void ausgabe04(){
        // Aufgabe 04:
        /*
        public class Call{
            static int j = 0
            public static doit(int x, int y){ // a[2], a[0]
                x = y; a[2] = a[0] = 12
                j++; j = 1
                y = 9; a[1] = 9
            }
            public static void main(String[] args){
                int a[] = {12,-42,17};
                doit(a[2],a[j])
                System.out.print("a[0]: " + a[0] + " a[1]: " + a[1] + " a[2]: " + a[2]);

                Ergebnis:
                "call-by-value":        a[0] = 12     a[1] = -42     a[2] = 17     j = 1
                "call-by-reference":    a[0] = 9      a[1] = -42     a[2] = 12     j = 1
                "call-by-name:          a[0] = 12     a[1] = 9       a[2] = 12     j = 1
            }
        }

         */
    }
}