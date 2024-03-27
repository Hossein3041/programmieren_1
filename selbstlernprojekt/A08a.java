// Dynamische Array-Erweiterung und MergeSort:
// Implementiere eine Methode, die dynamisch ein neues Array aus der Kombination zweier gegebenen Arrays erstellt,
// wobei sie nur Zahlen einschließt, deren binäre Darstellung eine ungerade Anzahl von 1en aufweist,
// und sortiere das finale Array mit dem Sortieralgorithmus, nach Anzahl ihrer positiven Bits.
// - BubbleSort
// außer der Anwendung der Sortieralgorithmen, soll der restliche Aufgabenteil iterativ erfolgen.
package selbstlernprojekt;
public class A08a {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,9,11,13,15};
        int[] arr2 = {2,4,6,8,10,12,14,16,17,18,19};
        determineBit(arr1, arr2);
    }
    public static void determineBit(int[] arr1, int[] arr2){
        int countLength = 0;
        for(int i = 0; i < arr1.length; ++i)
            if(countBit(arr1[i]) % 2 != 0)
                ++countLength;
        for(int i = 0; i < arr2.length; ++i)
            if(countBit(arr2[i]) % 2 != 0)
                ++countLength;
        createArr(arr1, arr2, countLength);
    }
    public static void createArr(int[] arr1, int[] arr2, int length){
        int[] arr = new int[length];
        for(int i = 0, i1 = 0, i2 = 0; i < arr.length; ++i){
            if(i1 >= arr1.length){
                if(countBit(arr2[i2]) % 2 != 0){
                    arr[i] = arr2[i2++];
                }
            } else if(i2 >= arr2.length){
                if(countBit(arr1[i1]) % 2 != 0){
                    arr[i] = arr1[i1++];
                }
            } else {
                if (arr1[i1] <= arr2[i2]){
                    if(countBit(arr1[i1]) % 2 != 0)
                        arr[i] = arr1[i1++];
                } else {
                    if(countBit(arr2[i2]) % 2 != 0)
                        arr[i] = arr2[i2++];
                }
            }
        }
        bubble_sort(arr);
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
    public static int countBit(int number){
        int count = 0;
        while(number != 0){
            count += number & 1;
            number >>>= 1;
        }
        return count;
    }
    public static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + "\t");
        System.out.println();
    }
}