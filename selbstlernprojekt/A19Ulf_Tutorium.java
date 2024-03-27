package selbstlernprojekt;

public class A19Ulf_Tutorium {
    public static void main(String[] args){
        int[] arr = {16,3,38,64,1,19,42};
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        for(int i = 0; i < 4; ++i){
            switch(i){
                case 0:
                    System.out.println("Arary: ");
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
                    System.out.println("Bubble Sort: ");
                    print(bubble_sort(arr3));
                    break;
            }
        }
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    public static int countBit(int number){
        int count = 0;
        while(number != 0){
            count += number & 1;
            number >>>= 1;
        }
        return count;
    }
    public static int countBitRec(int number){
        return (number > 0) ? (number & 1) + countBitRec(number >>>= 1) : 0;
    }
    public static int[] bubble_sort(int[] arr){
        for(int i1 = 1; i1 < arr.length; ++i1){
            for(int i2 = 0; i2 < arr.length-i1; ++i2){
                if(countBitRec(arr[i2]) > countBitRec(arr[i2+1])){
                    swap(arr, i2, i2+1);
                }
            }
        }
        return arr;
    }
    public static int[] insertion_sort(int[] arr){
        for(int i1 = 1; i1 < arr.length; ++i1){
            int ival = arr[i1];
            int i2 = i1;
            while(i2 > 0 && countBit(arr[i2-1]) > countBit(ival)){
                arr[i2] = arr[i2-1];
                --i2;
            }
            arr[i2] = ival;
        }
        return arr;
    }
    public static void swap(int[] arr, int iP1, int iP2){
        int tmp = arr[iP1];
        arr[iP1] = arr[iP2];
        arr[iP2] = tmp;
    }
    public static int[] selection_sort(int[] arr){
        for(int i1 = 0; i1 < arr.length-1; ++i1){
            int min = i1;
            for(int i2 = i1+1; i2 < arr.length; ++i2){
                if(countBit(arr[i2]) < countBit(arr[min])){
                    min = i2;
                }
            }
            swap(arr, min, i1);
        }
        return arr;
    }
}