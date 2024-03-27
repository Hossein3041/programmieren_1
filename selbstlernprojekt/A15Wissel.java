package selbstlernprojekt;

public class A15Wissel {
    public static void main(String[] args){
        aufgabe01();
        aufgabe02();
        aufgabe03();
        aufgabe04();
    }
    public static void aufgabe01(){
        int x = 5, y = 10;
        boolean a = x < y, b = !(x == y);

        if(a == b){
            x = y*2;
        } else if(a){
            x = y*3;
            ++y;
        } else
            y += 4;
            x = y%2;
        System.out.println("a = " + a + ", b = " + b + ", x = " + x + ", y = " + y);
    }
    public static void aufgabe02(){
        int x = 5, y = 0, z = 0, w = 10;
        while(y < x){
            ++x;
            y += 2;
            ++z;
            w -=-z+3;
        }
        System.out.print("x = " + x + ", y = " + y + ", z = " + z + ", w = " + w);
    }
    public static void aufgabe03(){
        int i = 0, j = 0, k = 0, p1 = 0, p2 = 0, m = 0, n = 0;
        i = i++;
        j = (j = j + 1);
        k = (k++) + (k++) + (k++);
        m = (m++) + (m++);
        n = (++n) + (++n) + (++n);
        p1 = (2*p1) + (p1++);
        p2 = (p2++) + (2*p2);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(m);
        System.out.println(n);
    }
    public static void aufgabe04(){
        int[] a = new int[10];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < a.length; ++i)
            a[i] = a[i-1] + a[i-2];
        System.out.println(a[9]);
    }
    public static void aufgabe05(){}
    public static void aufgabe06(){}
    public static void aufgabe07(){}
}
