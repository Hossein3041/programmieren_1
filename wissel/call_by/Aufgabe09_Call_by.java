package wissel.call_by;

public class Aufgabe09_Call_by {
    public static void main(String[] args){
        int x = 0;
        int[] y = {10,20,30,40};
        doit(x,y);
        System.out.println(x);
        System.out.println(y[2]);
    }
    public static void doit(int i, int[] a){
        i = 2;
        a[i] = 6;
        a = new int[] {-1, -2, -3};
    }
     /* Call-by-Value:      x = 0, y[2] = 6
        Call-by-Reference:  x = 2, y[2] = -3
        Call-by-Name:       x = 2, y[2] = -3
     */
}
