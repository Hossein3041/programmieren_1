// Was wird das folgende Programm ausgeben?
package wissel;
public class U03_AFG12 {
    public static void main(String[] args){
        double[] dArray = {8.97, 6.01, 4.22, 7.23};
        print(dArray);
    }

    public static void print(double[] temp){
        int i = 0;
        while(i < temp.length-1){
            System.out.print(++temp[i]+"\t");
            ++i;
        }
    }
}
