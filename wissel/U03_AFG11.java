// Was wird das folgende Programm ausgeben?
package wissel;

public class U03_AFG11 {
    public static void main(String[] args){
        double[] dArray = {8.97, 6.01, 4.22, 7.23};
        print(dArray);
        // Es werden die Zahlen wie im Array ursprünglich gespeichert ausgegeben.
        // Nach der Ausgabe werden sie um 1 Wert erhöht, wegen Postinkrement!
    }

    public static void print(double[] temp){
        int i = 0;
        while(i < temp.length){
            System.out.print(temp[i++]+"\t");
        }
    }
}
