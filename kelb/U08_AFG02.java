// Implementieren Sie das Distribution Counting derart, dass die Methode zunächst
// selber ermittelt, aus welchem Wertebereich die zu sortierenden Zahlen stammen.
// Modifizieren Sie die Lösung aus der Vorlesung derart, dass auch negative Zahlen
// sortiert werden können.
package kelb;
public class U08_AFG02 {
    public static void main(String[] args){
        int[] field = {-3,2,-9,3-8,1,-7,-6,7,-5,5,-4,6,-3,2,-2,7,-1,3,1};
        int[] fieldClone = field.clone();
        for(int i = 0; i < 2; ++i){
            switch(i){
                case 0:
                    System.out.println("Unsorted Array:");
                    print(field);
                    break;
                case 1:
                    System.out.println("Sorted Array:");
                    print(distribution_counting(fieldClone, rangeOfValue(fieldClone)));
            }
        }
    }
    public static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static int[] rangeOfValue(int[] field){
        int max = field[0], min = field[0];
        for(int i = 0; i < field.length; ++i){
            if(field[i] > max) max = field[i];
            if(field[i] < min) min = field[i];
        }
        int[] maxMin = {max, min};
        return maxMin;
    }
    public static int[] distribution_counting(int[] field, int[] maxMin){
        int max = maxMin[0], min = maxMin[1];
        int[] count = new int[max - min + 1]; // max - min + 1, um den Wertebereich der negativen Zahlen mitzunehmen.
        for(int i = 0; i < field.length; ++i)
            ++count[field[i] - min]; // aus negativen Werten, durch - min, den richtigen Index hochzählen
        for(int i1 = 0, i2 = 0; i1 < count.length; ++i1)
            for(int i3 = 0; i3 < count[i1]; ++i3)
                field[i2++] = i1 + min; // durch + min, den richtigen Wert wieder in field einfügen
        return field;
    }
}