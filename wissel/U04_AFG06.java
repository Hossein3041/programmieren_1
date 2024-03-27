// Was gibt das folgende Programm aus?
package wissel;
public class U04_AFG06 {
    static int x = 0;
    public static void main(String[] args){
        int a = 5;
        System.out.println("Das Ergebnis der doitA Methode ist: " + doitA(a));
        /* A(5) -> x = 1 -> A(4) + x ->
           A(4) -> x = 2 -> A(3) + x ->
           A(3) -> x = 3 -> A(2) + x ->
           A(2) -> x = 4 -> A(1) + x ->
           A(1) -> x = 5 -> A(0) + x ->
           A(0) -> 0
           _____________________________
           A(0) + x -> 0 + 5 = 5
           A(1) + x -> 5 + 5 = 10
           A(2) + x -> 10 + 5 = 15
           A(3) + x -> 15 + 5 = 20
           A(4) + x -> 20 + 5 = 25
         */
        System.out.println("Das Ergebnis der doitB Methode ist: " + doitB(a));
        // Bei doitB, ist x = 10, und n = 5
        // Das Endergebnis ist 50
    }

    public static int doitA(int n){
        if(n > 0){
            ++x;
            return doitA(n-1)+x;
        }
        return 0;
    }

    public static int doitB(int n){
        if(n > 0){
            ++x;
            return doitB(n-1)+x;
        }
        return 0;
    }
}
