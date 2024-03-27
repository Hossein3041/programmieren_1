package wissel.call_by;
/*
_____________________________________________________________________________
            Call-by-Value   -   Call-by-Reference    -   Call-by-Name
_____________________________________________________________________________
Ausgabe 1:         30                   30                      30
Ausgabe 2:         30                   30                      40
Ausgabe 3:  10, 20, 30, 40          10, 20, 35, 40         10, 20, 30, 45
_____________________________________________________________________________

 */
public class Aufgabe01_Call_by {
    static int n = 1;
    static int[] a = {10,20,30,40};
    static void doit(int b){
        System.out.println(b);
        ++n;
        System.out.println(b);
        b += 5;
    }
    public static void main(String[] args){
        doit(a[n+1]);
        System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
    }
}
