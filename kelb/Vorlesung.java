package kelb;
import java.util.Vector;
public class Vorlesung{
    static void doit(int i, int j){
        System.out.println("i: " + i + "\tj:" + j);
    }
    static void doit(int i){
        doit(i, 23);
    }
    static void doit(){
        doit(42);
    }
    public static void main(String[] args){
        doit();
        doit(3);
        doit(56, 107);
    }
}