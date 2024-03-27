// Gegeben sind die folgenden sortierten Arrays:
// int[] arr1 = {1,3,5,7,9,11,13,15};
// int[] arr2 = {2,4,6,8,10,12,14,16,17,18,19};
// Schreiben Sie eine Methode merge(), die die beiden Arrays zu einem Array
// zusammenführt. Das neue Array soll ebenfalls sortiert sein.
package wissel;
public class U03_AFG13 {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,9,11,13,15};
        int[] arr2 = {2,4,6,8,10,12,14,16,17,18,19};
        ausgabe(mergeWhile(arr1, arr2));
        ausgabe(mergeFor(arr1, arr2));
    }

    public static void ausgabe(int[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int[] mergeWhile(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, i1 = 0, i2 = 0;
        while(i1 < arr1.length && i2 < arr2.length)
            if(arr1[i1] < arr2[i2])
                arr[i++] = arr1[i1++];
            else
                arr[i++] = arr2[i2++];
        while(i1 < arr1.length) arr[i++] = arr1[i1++];
        while(i2 < arr2.length) arr[i++] = arr2[i2++];
        return arr;
    }

    public static int[] mergeFor(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i1 = 0, i2 = 0;
        for(int i = 0; i < arr.length; ++i){
            if(i1 >= arr1.length)
                arr[i] = arr2[i2++];
            else if(i2 >= arr2.length)
                arr[i] = arr1[i1++];
            else
                if (arr1[i1] <= arr2[i2]) arr[i] = arr1[i1++];
                else arr[i] = arr2[i2++];
        }
        return arr;
    }
}
