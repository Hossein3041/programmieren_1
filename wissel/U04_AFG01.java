// Was gibt das folgende Programm aus?
package wissel;
public class U04_AFG01 {
    public static void doitA(int n){
            if(n > 0){
                System.out.print("doitA n = "+n+" ");
                doitA(n-1);
            }
    }

    public static void doitB(int n){
        if(n > 0){
            doitB(n-1);
            System.out.print("doitB n = "+n+" ");
        }
    }

    public static void main(String[] args){
        int n = 6;
        doitA(n);
        System.out.println();
        doitB(n);
    }
}
