package wissel.arrays;

public class U_A10 {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,9,11,13,15};
        int[] arr2 = {2,4,6,8,10,12,14,16,17,18,19};
        print(mergeWhile(arr1, arr2));
        System.out.println();
        print(mergeFor(arr1, arr2));
    }
    public static void print(int[] arr){
        for(int i :  arr)
            System.out.print(i + "\t");
    }
    public static int[] mergeWhile(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, i1 = 0, i2 = 0;
        while(i1 < arr1.length && i2 < arr2.length){
            if(arr1[i1] < arr2[i2])
                arr[i++] = arr1[i1++];
            else
                arr[i++] = arr2[i2++];
        }
        while(i1 < arr1.length)
            arr[i++] = arr1[i1++];
        while(i2 < arr2.length)
            arr[i++] = arr2[i2++];

        return arr;
    }
    public static int[] mergeFor(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        for(int i = 0, i1 = 0, i2 = 0; i < arr.length; ++i){
            if(i1 >= arr1.length)
                arr[i] = arr2[i2++];
            else if(i2 >= arr2.length)
                arr[i] = arr1[i1++];
            else
                if(arr1[i1] <= arr2[i2])
                    arr[i] = arr1[i1++];
                else
                    arr[i] = arr2[i2++];
        }
        return arr;
    }
}
