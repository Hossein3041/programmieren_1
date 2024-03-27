package wissel.call_by;

public class Aufgabe08_Call_by {
    static int i = 0;
    public static void main(String[] args){
        int[] n = {10,20,30};
        xyz(n[i], i);
        System.out.println(i + " " + n[0] + " " + n[1] + " " + n[2]);
    }
    public static void xyz(int a, int b){ // n[0], i = 0
        ++a; // n[0] = 10 + 1 = 11
        ++b; // i = 1
        ++i; // i = 2
        a = b; // a[2] 2
    }
    /* Call-by-Value:           i = 1
                                n = {10,20,30}
       Call-by-Reference:       i = 2
                                n = {2,20,30}
       Call-by-Name:            i = 2
                                n = {11,20,2}
     */
}
