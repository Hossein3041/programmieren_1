// Was wird ausgegeben?
// Antwort: 1
package wissel;

public class U04_AFG13 {
    public static void main(String[] args){
        int n = 5;
        System.out.println(fun(n));
    }

    public static int fun(int n){
        int result;
        if(n==1)
            return 1;
        result = fun(n-1)*n;
        return result;
    }
}
