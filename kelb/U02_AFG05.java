// Was gibt das folgende Programm aus?

package kelb;

public class U02_AFG05 {
    public static void main(String[] args){
        int x = 10;
        boolean a = x > 0 && x <= 10;
        boolean b = x < 5 || x > 9;
        boolean c = !(b || a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
