// Löse die Aufgabe 8a rekursiv. Der Sortieralgorithmus kann so bleiben
package selbstlernprojekt;
public class A08b {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,9,11,13,15};
        int[] arr2 = {2,4,6,8,10,12,14,16,17,18,19};
        int count = determineBit(arr1, 0, arr2, 0, 0);
        bubble_sort(createArr(arr1, 0, arr2, 0, 0, count, null));
    }
    public static int determineBit(int[] arr1, int i1, int[] arr2, int i2, int count){
        if(i1 < arr1.length){
            boolean hit1 = countBit(arr1[i1]) % 2 != 0;
            return determineBit(arr1, i1+1, arr2, i2, hit1 ? count+1 : count);
        }
        if(i2 < arr2.length){
            boolean hit2 = countBit(arr2[i2]) % 2 != 0;
            return determineBit(arr1, i1, arr2, i2+1, hit2 ? count+1 : count);
        }
        return count;
    }
    public static int[] createArr(int[] arr1, int i1, int[] arr2, int i2, int i, int length, int[] arr){
        if(i1 >= arr1.length && i2 >= arr2.length){
            return arr;
        }
        if(arr == null){
            arr = new int[length];
        }
        if(i1 < arr1.length && i2 < arr2.length){
            boolean hit1 = countBit(arr1[i1]) % 2 != 0;
            boolean hit2 = countBit(arr2[i2]) % 2 != 0;
            boolean arr1Hit = false, arr2Hit = false;
            if(hit1){
                arr[i] = arr1[i1];
                arr1Hit = true;
            }
            if(hit2){
                arr[i] = arr2[i2];
                arr2Hit = true;
            }
            return createArr(arr1, arr1Hit ? i1+1 : i1, arr2, arr2Hit ? i2+1 : i2, i+1, length, arr);
            // Lösung stimmt nicht ganz.
        }
        if(i1 >= arr1.length){
            if(countBit(arr2[i2]) % 2 != 0)
                arr[i] = arr2[i2];
            return createArr(arr1, i1, arr2, i2+1, i+1, length, arr);
        } else if(countBit(arr1[i1]) % 2 != 0){
            arr[i] = arr1[i1];
            return createArr(arr1, i1+1, arr2, i2, i+1, length, arr);
        }
        return arr;
    }
    public static int countBit(int number){
        int count = 0;
        while(number != 0){
            count += number & 1;
            number >>>= 1;
        }
        return count;
    }
    public static void bubble_sort(int[] arr){
        for(int i1 = 1; i1 < arr.length; ++i1){
            for(int i2 = 0; i2 < arr.length-i1; ++i2){
                if(countBit(arr[i2]) > countBit(arr[i2+1])){
                    swap(arr, i2, i2+1);
                }
            }
        }
        print(arr);
    }
    public static void swap(int[] arr, int iP1, int iP2){
        int tmp = arr[iP1];
        arr[iP1] = arr[iP2];
        arr[iP2] = tmp;
    }
    public static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + "\t");
        System.out.println();
    }
}
