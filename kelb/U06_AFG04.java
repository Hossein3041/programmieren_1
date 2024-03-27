// Schreiben Sie ein Programm, das folgende Ausgabe produziert:
// Geben Sie die Höhe der Raute ein: 5
//   x
//  xxx
// xxxxx
//  xxx
//   x
package kelb;
import java.util.Scanner;
public class U06_AFG04 {
    public static void raute(int h){
        int pEins = (h+1)/2;
        int pZwei = (h-1)/2;

        for(int i = 0; i < pEins; ++i){
            for(int a = 0; a < (pEins-i-1); ++a)
                System.out.print(" ");
            for(int b = 0; b < (i*2+1); ++b)
                System.out.print("x");
            System.out.println();
        }

        if(h%2 == 0){
            for(int x = 0; x < (2*pEins-1); ++x)
                System.out.print("x");
            System.out.println();
        }

        for(int i = 0; i < pZwei; ++i){
            for(int a = 0; a < (i+1); ++a)
                System.out.print(" ");
            for(int b = 0; b < (pZwei*2)-1-2*i; ++b)
                System.out.print("x");
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        raute(sc.nextInt());
    }
}
