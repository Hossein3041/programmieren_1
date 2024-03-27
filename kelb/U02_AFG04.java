package kelb;

public class U02_AFG04 {
    public static void main(String[] args){
        boolean a = true, b = false, c = false;
        if(a || b)
            b = true;
        else
            c = true;
        a = b && c;
        c = !a;
        System.out.println(a + " " + b + " " + c);
    }
}
