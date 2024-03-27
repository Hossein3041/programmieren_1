package wissel.call_by;

public class Aufgabe02_Call_by {
    static int n;
    static void doit(int k){
        ++n;
        k += 4;
        System.out.println(n);
    }
    public static void main(String[] args){
        n = 0;
        doit(n);
        System.out.println(n);
    }
}
