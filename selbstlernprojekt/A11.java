/*
Aufgabenstellung:
Gegeben sei ein 1D Array von Ganzzahlen arr und eine Ganzzahl x.
Deine Aufgabe besteht darin, ein neues Array "result" zu erstellen,
das auf folgenden Kriterien basiert:

1. Filterkriterium:
Jedes Element arr[i] wird nur dann berücksichtigt,
wen das Bit an der Position i in x gesetzt ist.

2. Transformationskriterium:
Für jedes ausgewähltes Element arr[i] wird ein transformierter Wert in result eingefügt.
Die Transformation ist wie folgt:
    - Wenn das Bit an der Position arr[i] % 10 (der Einheitsziffer von arr[i]) in x gesetzt ist,
    füge arr[i] * 2 ein.
    Andernfalls,
    füge arr[i] / 2 (Division durch 2, abgerundet) ein.
3. Sonderungskriterium:
Die Elemente in Result sollen basierend auf ihrer Größe sortiert werden,
wobei die kleinsten Werte zuerst kommen.

4. Zusätzliche Anforderung:
Berechne die Summe aller Elemente in result und gib sie aus.

Löse das Problem iterativ, sowie rekursiv.
 */
package selbstlernprojekt;
import java.util.concurrent.ThreadLocalRandom;
public class A11 {
    public static void main(String[] arg){
        int size = 50;
        int x = 436430;
        int[] arr = fillInt(size);
        System.out.println("Original array: ");
        print(arr);
        int[] res = detectBitCount(arr, x);
        int[] resSort = distribution_counting(res, rangeOfValue(res));
        System.out.println("Result array sort: ");
        print(resSort);
        int sum = totalSum(resSort);
        System.out.println("total sum of res: " + sum);


        // rekursiv lösen ...
        int[] resRec = detectBitCountRec(arr, x, 0, 0);
        int[] resRecSort = distribution_counting(resRec, rangeOfValue(resRec));
        System.out.println("Result array sort rec: ");
        print(resRecSort);
        int sum2 = totalSum(resRecSort);
        System.out.println("total sum of resRec: " + sum2);

    }
    public static int[] detectBitCountRec(int[] arr, int x, int i, int count){
        if(i >= arr.length)
            return new int[count];
        boolean hit1 = (x & 1 << arr[i]) != 0;
        boolean hit2 = (x & 1 << (arr[i] % 10)) != 0;
        int[] resRec = detectBitCountRec(arr, x, i+1, hit1 ? count+1 : count);
        if(hit1)
            if(hit2)
                resRec[count] = arr[i] * 2;
            else
                resRec[count] = arr[i] / 2;
        return resRec;
    }
    public static int[] detectBitCount(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if((x & 1 << arr[i]) != 0)
                ++count;
        int[] res = detectArr(arr, x, count);
        return res;
    }
    public static int[] detectArr(int[] arr, int x, int count){
        int[] res = new int[count]; int i1 = 0;
        for(int i = 0; i < arr.length; ++i){
            if((x & 1 << arr[i]) != 0){
                res[i1++] = (x & 1 << (arr[i] % 10)) != 0 ? arr[i] * 2 : arr[i] / 2;
            }
        }
        return res;
    }
    public static int[] distribution_counting(int[] res, int[] maxMin){
        int max = maxMin[0], min = maxMin[1];
        int[] count = new int[max - min + 1];
        for(int i = 0; i < res.length; ++i)
            ++count[res[i] - min];
        for(int i1 = 0, i2 = 0; i1 < count.length; ++i1)
            for(int i3 = 0; i3 < count[i1]; ++i3)
                res[i2++] = i1 + min;
        return res;
    }
    public static int[] rangeOfValue(int[] arr){
        int max = arr[0], min = arr[0];
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        int[] maxMin = {max, min};
        return maxMin;
    }
    public static int totalSum(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            count += arr[i];
        return count;
    }
    public static int[] fillInt(int size){
        int[] temp = new int[size];
        for(int i = 0; i < temp.length; ++i)
            temp[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        return temp;
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
}
