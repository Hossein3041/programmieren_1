package wissel.call_by;

public class Aufgabe06_Call_by {
    public static void doit(int i){
        i = 43;
    }
    public static void main(String[] args){
        int x = 13;
        doit(x);
        System.out.println(x);
        /* Call-by-value:       x = 13;
           Call-by-Reference:   x = 43;
           Call-by-Name:        x = 43;
           "Ist der aktuelle Parameter eine einfache Variable,
            ist Call-by-Name identisch zu Call-by-Reference"
         */
    }
}
