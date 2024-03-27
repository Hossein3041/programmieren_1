package wissel.call_by;

public class Aufgabe07_Call_by {
    static int x = 0;
    public static void magic(int i, int j){
        if(i<j)
            x += 1;
        else
            x -= 1;
        j = i;
        i = 42;
    }
    public static void main(String[] args){
        int[] a = {10,20,30};
        magic(a[x],a[x+1]);
        System.out.println(x + " " + a[0] + " " + a[1] + " " + a[2]);
        /* Call-by-Value:           x = 1
                                    a = {10,20,30}
           Call-by-Reference:       x = 1
                                    a = {42,10,30}
           Call-by-Name:            x = 1
                                    a = {10,42,20}
         */
    }
}
