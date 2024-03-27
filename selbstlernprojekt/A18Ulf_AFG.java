// Nimm die Zahlen 16, 3, 38, 64, 1, 19, 42 und sortiere diese innerhalb eines Arrays
// aufsteigend nach ihrer Anzahl positiver Bits. Implementiere diese Sortierung
// mit den bekannten Algorithmen BubbleSort, InsertionSort, SelectionSort.
package selbstlernprojekt;
public class A18Ulf_AFG {
    public static void main(String[] args){
        int[] arr = {16,3,38,64,1,19,42};
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        for(int i = 0; i < 4; ++i){
            switch(i){
                case 0:
                    System.out.println("Array: ");
                    print(arr);
                    break;
                case 1:
                    System.out.println("Selection Sort: ");
                    print(selection_sort(arr));
                    break;
                case 2:
                    System.out.println("Insertion Sort: ");
                    print(insertion_sort(arr2));
                    break;
                case 3:
                    System.out.println("Bubble Sort:");
                    print(bubble_sort(arr3));
                    break;
            }
        }
    }
    public static int[] insertion_sort(int[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            int ival = field[i1];
            int i2 = i1;
            while(i2 > 0 && countBit(field[i2-1]) > countBit(ival)){
                field[i2] = field[i2-1];
                --i2;
            }
            field[i2] = ival;
        }
        return field;
    }
    public static int[] bubble_sort(int[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            boolean bAtLeastOneSwap = false;
            for(int i2 = 0; i2 < field.length-i1; ++i2){
                if(countBitRec(field[i2]) > countBitRec(field[i2+1])){
                    swap(field, i2, i2+1);
                    bAtLeastOneSwap = true;
                }
            }
            if(!bAtLeastOneSwap)
                return field;
        }
        return field;
    }
    public static int[] selection_sort(int[] field){
        for(int i1 = 0; i1 < field.length-1; ++i1){
            int min = i1;
            for(int i2 = i1+1; i2 < field.length; ++i2){
                if(countBit(field[i2]) < countBit(field[min])){
                    min = i2;
                }
            }
            swap(field, min, i1);
        }
        return field;
    }
    public static void swap(int[] field, int iPos1, int iPos2){
        int tmp = field[iPos1];
        field[iPos1] = field[iPos2];
        field[iPos2] = tmp;
    }
    public static int countBit(int num){
        int count = 0;
        while(num != 0){
            if((num & 1) == 1)
                ++count;
            num >>>= 1;
        }
        return count;
    }
    public static int countBitRec(int num){
        return (num > 0) ? num & 1 + countBitRec(num >>>= 1) : 0;
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
