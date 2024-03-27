// Übung 07 - Aufgabe 03 - Wiederholung
package selbstlernprojekt;
public class A03 {
    public static void main(String[] args){
        long num = 25;
        long[] binary = integerToBinary(num);
        print(binary);
    }
    public static long[] integerToBinary(long num){
        long[] binary = new long[64];
        for(int i = binary.length-1; i >= 0; --i){
            binary[i] = num & 1;
            num >>>= 1;
        }
        return binary;
    }
    public static void print(long[] binary){
        for(int i = 0; i < binary.length; ++i)
            System.out.print(binary[i]);
        System.out.println();
    }
}
