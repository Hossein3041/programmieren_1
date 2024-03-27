package wissel.call_by;
public class ArrayAlsParameter {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        print(array);
        swap(array);
        print(array);
    }
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = tmp;
    }
    public static void print(int[] arr){
        for(int x : arr)
            System.out.print(x+" ");
        System.out.println();
    }
}
