package selbstlernprojekt;
public class A17Uebungsklausur {
    public static void main(String[] args){
        char[] s = {'a','b','c','d','e','f','d'};
        char search = 'd';
        int[] out = position(s, search);
        System.out.println("Original array: ");
        print(s);

        System.out.println("Result array: ");
        print2(out);

        int[] outRec = positionRec(s, 0, search, 0);
        System.out.println("Result array rec: ");
        print2(outRec);
    }
    public static int[] positionRec(char[] s, int i, char search, int count){
        if(i >= s.length)
            return new int[count];
        boolean hit = (s[i] == search);
        int[] outRec = positionRec(s, i+1, search, hit ? count+1 : count);
        if(hit){
            outRec[count] = i;
        }
        return outRec;
    }
    public static int[] position(char[] s, char search) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (search == s[i]) {
                counter++;
            }
        }
        int[] out = position2(s, search, counter); // Ergebnis Array auffangen
        return out; // Ergebnis Array zurückgeben in main()
    }
    public static int[] position2(char[] s, char search, int counter){
        int[] out = new int[counter];
        for(int i = 0, counter2 = 0; i < s.length; ++i)
            if(search == s[i])
                out[counter2++] = i;
        return out;
    }
    public static void print2(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static void print(char[] arr) {
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
}
