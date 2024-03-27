package wissel.call_by;

public class Aufgabe05_Call_by {
    static int[] a = {10,20,30};
    static int[] b = {1,2,3,4,5};
    static int n = 0;
    static int m = 0;
    public static void main(String[] args){
        swap(a[n],n);
        System.out.println(m+" "+n+" "+a[n]+" "+b[m]);
        print(a);
        print(b);
        /*
        Call-by-Value:
        m = 1, n = 1
        a[n] = 20, b[m] = 2
        a = {10,20,30}
        b = {1,2,3,4,5}

        Call-by-Reference:
        m = 1, n = 10
        a[n] = fehler , b[m] = 2
        a = {1,20,30}
        b = {1,2,3,4,5}

        Call-by-Name:
        m = 1, n = 20
        a[n] = fehler , b[m] = 2
        a = {10,1,30}
        b = {1,2,3,4,5}
         */
    }
    public static void swap(int x, int y){
        ++n;
        int tmp = x;
        x = y;
        y = tmp;
        ++m;
    }
    public static void print(int[] tmp){
        for(int i : tmp)
            System.out.print(i + " ");
        System.out.println();
    }
}
