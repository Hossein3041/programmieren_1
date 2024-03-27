// Was wird das Programm ausgeben?
// Antwort: 1
package wissel;
public class U04_AFG12 {
    public static void main(String[] args){
        System.out.print(func(5));
    }

    public static int func(int n){
        int result;
        if(n==1)
            return 1;
        result = func(n-1);
        return result;
    }
}
