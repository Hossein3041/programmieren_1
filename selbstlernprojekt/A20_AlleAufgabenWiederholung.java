package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A20_AlleAufgabenWiederholung {
    public static void main(String[] args){
        int[] arr = fillInt(30);
        int x = 123456;
        System.out.println("Array Anfang: ");
        print(arr);
        //////////////////////
        int[] resEins = aufgabeEins(arr, x);
        System.out.println("aufgabeEins: ");
        print(resEins);
        int[] resRecEins = aufgabeEinsRec(arr, x, 0, 0);
        System.out.println("aufgabeEinsRec: ");
        print(resRecEins);
        //////////////////////
        int[] resZwei = aufgabeZwei(arr, x);
        System.out.println("aufgabeZwei: ");
        print(resZwei);
        int[] resRecZwei = aufgabeZweiRec(arr, x, 0, 0);
        System.out.println("aufgabeZweiRec: ");
        print(resRecZwei);
        //////////////////////
        int[] resDrei = aufgabeDrei(arr, x);
        System.out.println("aufgabeDrei: ");
        print(resDrei);
        int[] resRecDrei = aufgabeDreiRec(arr, x, 0, 0);
        System.out.println("aufgabeDreiRec: ");
        print(resRecDrei);
        //////////////////////
        long x1 = 123456;
        int resVier = aufgabeVier(x1, arr);
        System.out.println("aufgabeVier: " + resVier);
        int resRecVier = aufgabeVierRec(x1, arr, 0, 0);
        System.out.println("aufgabeVierRec: " + resRecVier);
        //////////////////////
        char[] s = {'D','i','e','s',' ','i','s','t',' ','e','i','n',' ','t','e','s','t',' ','f','u','e','r',' ','d','a','s',' ','S','p','l','i','t'};
        char search = ' ';
        int[] resFuenf = aufgabeFuenf(s, search);
        System.out.println("aufgabeFuenf: ");
        print(resFuenf);
        int n = 10;
        aufUndAb(n);
        abUndAuf(n);
        System.out.println();
        //////////////////////
        char[] resSechs = aufgabeSechs(s, search);
        System.out.println("aufgabeSechs: ");
        printChar(resSechs);
        int resSechsRec = aufgabeSechsRec(s, search);
        System.out.println("aufgabeSechsRec: " + resSechsRec);
        //////////////////////
        int[] resSieben = aufgabeSieben(arr);
        System.out.println("aufgabeSieben: ");
        print(resSieben);
        int[] resSiebenRec = aufgabeSiebenRec(arr, 0, 0);
        System.out.println("aufgabeSiebenRec: ");
        print(resSiebenRec);

        /*
        int[] z = new int[10];
        int i = 20;
        for(i = 0; i < z.length; ++i){
            System.out.print("x");
        }
        System.out.println();
        System.out.println("i : " + i);

         */
        //long i1 = 12345;
        //long i2 = 54321;
        //boolean res = isLess(i1, i2);
        /*  Schreibe eine Methode isLess(i1, i2), die true ausgibt, falls die Summe der gesetzten Bits von i1 kleiner als die von i2 ist.
        Die Methode muss rekursiv arbeiten
         */

    }
    /*
    public static boolean isLess(long i1, long i2){
        // ((i1 > 0) ? i1 & 1L + isLess(i1>>>=1L, i2) : 0)
        // ((i2 > 0) ? i2 & 1L + isLess(i1, i2>>>=1L) : 0)
        return (((i1 > 0) ? i1 & 1L + isLess(i1>>>=1L, i2) : 0) < ((i2 > 0) ? i2 & 1L + isLess(i1, i2>>>=1L) : 0)) ? true : false;
    }

     */
    public static int[] aufgabeSiebenRec(int[] arr, int i, int count){
        if(i >= arr.length)
            return new int[count];
        boolean hit = zPotenz(arr[i]);
        int[] res = aufgabeSiebenRec(arr, i+1, hit ? count+1 : count);
        if(hit)
            res[count] = arr[i];
        return res;
    }
    public static int[] aufgabeSieben(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if(zPotenz(arr[i]))
                ++count;
        int[] res = aufgabeSieben2(arr, count);
        return res;
    }
    public static int[] aufgabeSieben2(int[] arr, int count){
        int[] res = new int[count];
        for(int i = 0, j = 0; i < arr.length; ++i)
            if(zPotenz(arr[i]))
                res[j++] = arr[i];
        return res;
    }
    public static boolean zPotenz(int number){
        return (number > 0) && (number & (number - 1)) == 0;
    }
    public static int aufgabeSechsRec(char[] s, char search){
        int count = aufgabeSechsRec2(s, search, 0, 0);
        return count;
    }
    public static int aufgabeSechsRec2(char[] s, char search, int i, int count){
        if(i >= s.length)
            return count;
        boolean hit = s[i] == search;
        count = aufgabeSechsRec2(s, search, i+1, hit ? count+1 : count);
        return count;
    }
    public static char[] aufgabeSechs(char[] s, char search){
        int count = 0;
        for(int i = 0; i < s.length; ++i)
            if(s[i] != search)
                ++count;
        char[] res = aufgabeSechs2(s, search, count);
        return res;
    }
    public static char[] aufgabeSechs2(char[] s, char search, int count){
        char[] res = new char[count];
        for(int i = 0, j = 0; i < s.length; ++i)
            if(s[i] != search)
                res[j++] = s[i];
        return res;
    }
    public static void abUndAuf(int n){
        if(n > 1){
            System.out.print(n-1 + "\t");
            abUndAuf(n-1);
        }
    }
    public static void aufUndAb(int n){
        if(n > 0){
            aufUndAb(n-1);
            System.out.print(n + "\t");
        }
    }
    public static int[] aufgabeFuenf(char[] s, char search){
        int count = 0;
        for(int i = 0; i < s.length; ++i)
            if(s[i] == search)
                ++count;
        int[] res = aufgabeFuenf2(s, search, count);
        return res;
    }
    public static int[] aufgabeFuenf2(char[] s, char search, int count){
        int[] res = new int[count];
        for(int i = 0, j = 0; i < s.length; ++i)
            if(s[i] == search)
                res[j++] = i;
        return res;
    }
    public static int aufgabeVierRec(long x1, int[] pos, int i, int count){
        if(i >= pos.length)
            return count;
        boolean mask = (x1 & 1L << pos[i]) != 0;
        count = aufgabeVierRec(x1, pos, i+1, mask ? count+1 : count);
        return count;
    }
    public static int aufgabeVier(long x1, int[] pos){
        int count = 0;
        for(int i = 0; i < pos.length; ++i){
            boolean mask = (x1 & 1L << pos[i]) != 0;
            if(mask) ++count;
        }
        return count;
    }
    public static int[] aufgabeDreiRec(int[] arr, int x, int i, int count){
        if(i >=  arr.length)
            return new int[count];
        boolean hit = (x & 1 << arr[i]) != 0;
        boolean hit2 = (x & 1 << (arr[i] % 10)) != 0;
        int[] res = aufgabeDreiRec(arr, x, i+1, hit ? count+1 : count);
        if(hit)
            if(hit2)
                res[count] = arr[i] * 2;
            else
                res[count] = arr[i] / 2;
        return res;
    }
    public static int[] aufgabeDrei(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if((x & 1 << arr[i]) != 0)
                ++count;
        int[] res = aufgabeDrei2(arr, x, count);
        return res;
    }
    public static int[] aufgabeDrei2(int[] arr, int x, int count){
        int[] res = new int[count];
        for(int i = 0, j = 0; i < arr.length; ++i)
            if((x & 1 << (arr[i])) != 0)
                res[j++] = (x & 1 << (arr[i] % 10)) != 0 ? arr[i] * 2 : arr[i] / 2;
        return res;
    }
    public static int[] aufgabeZweiRec(int[] arr, int x, int i, int count){
        if(i >= arr.length)
            return new int[count];
        boolean hit = (x & 1 << arr[i]) != 0;
        int[] res = aufgabeZweiRec(arr, x, i+1, hit ? count+1 : count);
        if(hit)
            res[count] = arr[i];
        return res;
    }
    public static int[] aufgabeZwei(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if((x & 1 << arr[i]) != 0)
                ++count;
        int[] res = aufgabeZwei2(arr, x, count);
        return res;
    }
    public static int[] aufgabeZwei2(int[] arr, int x, int count){
        int[] res = new int[count];
        for(int i = 0, j = 0; i < arr.length; ++i)
            if((x & 1 << arr[i]) != 0)
                res[j++] = arr[i];
        return res;
    }
    public static int[] aufgabeEinsRec(int[] arr, int x, int i, int count){
        if(i >= arr.length)
            return new int[count];
        boolean hit = (arr[i] & 1 << x) != 0;
        int[] res = aufgabeEinsRec(arr, x, i+1, hit ? count+1 : count);
        if(hit)
            res[count] = arr[i];
        return res;
    }
    public static int[] aufgabeEins(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if((arr[i] & 1 << x) != 0)
                ++count;
        int[] res = aufgabeEins2(arr, x, count);
        return res;
    }
    public static int[] aufgabeEins2(int[] arr, int x, int count){
        int[] res = new int[count];
        for(int i = 0, j = 0; i < arr.length; ++i)
            if((arr[i] & 1 << x) != 0)
                res[j++] = arr[i];
        return res;
    }
    public static void printChar(char[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(0,100);
        return temp;
    }
}