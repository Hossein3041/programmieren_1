// Schreiben Sie ein Programm, das drei Integer Werte über die Tastatur einliest
// und den größten dieser Werte ausgibt. Verwenden Sie hierzu die unten genannten Java Befehle,
// um einen int Wert von der Tastatur einzulesen.

package kelb;
import java.util.Scanner;

public class U03_AFG03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Zahl a ein: ");
        int a = sc.nextInt();
        System.out.println("Geben Sie die Zahl b ein: ");
        int b = sc.nextInt();
        System.out.println("Geben Sie die Zahl c ein: ");
        int c = sc.nextInt();

        int step1;
        int step2;

        if(a >= b){
            step1 = a;
        } else {
            step1 = b;
        }

        if(step1 >= c){
            step2 = step1;
        } else {
            step2 = c;
        }

        System.out.println(step2);
    }
}
