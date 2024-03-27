// Implementieren Sie die Sortierverfahren aus der Vorlesung für Double Werte.
// Führen Sie Laufzeitmessungen durch.
package kelb;
import java.util.Arrays;
public class U08_AFG01 {
    public static void main(String[] args){
        double[] field = {34.0, 5.0, 0.0, 4.0, 17.0, 0.123456789, 7.654321, 9.87654321, 5.555555, 3.14159265, 6.666666, 12.3456789, 9.7654321, 7.7777777, 8.8888888};
        double[] fieldSorted = field.clone();
        Arrays.sort(fieldSorted);
        for(int i = 0; i < 3; ++i){
            final double[] copy = field.clone();
            final long start = System.nanoTime();
            switch(i){
                case 0:
                    System.out.println("Selection Sort:");
                    selection_sort(copy);
                    break;
                case 1:
                    System.out.println("Insertion Sort:");
                    insertion_sort(copy);
                    break;
                case 2:
                    System.out.println("Bubble Sort:");
                    bubble_sort(copy);
                    break;
            }
            printDuration(start, System.nanoTime());
            testSort(fieldSorted, copy);
        }
    }
    public static void printDuration(long start, long end){
        System.out.println((end - start) / 1000 + "ms");
    }
    public static void testSort(double[] expected, double[] actual){
        if(!Arrays.equals(expected, actual))
            System.out.println("Array is NOT sorted");
    }
    public static void selection_sort(double[] field){
        for(int i1 = 0; i1 < field.length-1; ++i1){
            int min = i1;
            for(int i2 = i1+1; i2 < field.length; ++i2){
                if(field[i2] < field[min]){
                    min = i2;
                }
            }
            swap(field, min, i1);
        }
    }
    public static void bubble_sort(double[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            boolean bAtLeastOneSwap = false;
            for(int i2 = 0; i2 < field.length-1; ++i2){
                if(field[i2] > field[i2+1]){
                    swap(field, i2, i2+1);
                    bAtLeastOneSwap = true;
                }
            }
            if(!bAtLeastOneSwap)
                return;
        }
    }
    public static void insertion_sort(double[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            double ival = field[i1];
            int i2 = i1;
            while(i2 > 0 && field[i2-1] > ival){
                field[i2] = field[i2-1];
                --i2;
            }
            field[i2] = ival;
        }

    }
    public static void swap(double[] field, int iPos1, int iPos2){
        double tmp = field[iPos1];
        field[iPos1] = field[iPos2];
        field[iPos2] = tmp;
    }
}
