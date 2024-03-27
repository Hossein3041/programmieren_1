// Implementieren Sie die drei Sortiermethoden Insertion, Selection- und Bubblesort derart,
// dass sie Arrays von 'Rational' Objekten sortieren.
package kelb;
class Rational1{
    private int zaehler;
    private int nenner;
    public Rational1(int zaehler, int nenner){
        if(nenner == 0)
            throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
        this.zaehler = zaehler;
        this.nenner = nenner;
        kuerzen();
    }
    private void kuerzen(){
        int ggt = ggt(zaehler, nenner);
        zaehler /= ggt;
        nenner /= ggt;
    }
    private int ggt(int a, int b){
        return b == 0 ? a : ggt(b, a % b);
    }
    public int vergleich(Rational1 r){
        return Integer.compare(zaehler * r.nenner, r.zaehler * nenner);
    }
    public String toString(){
        return zaehler + " / " + nenner;
    }


}
public class U11_AFG02 {
    public static void main(String[] args){
        Rational1[] rationals = {
                new Rational1(1, 3),
                new Rational1(3, 4),
                new Rational1(4, 5),
                new Rational1(1, 2),
                new Rational1(2, 3),
        };
        for(int i = 0; i < 3; ++i){
            switch(i){
                case 0: System.out.println("Original Array: ");
                        printArray(rationals);
                        System.out.println("Sorted with Selection Sort: ");
                        selection_sort(rationals);
                        printArray(rationals);
                        rationals = resetArray();
                        break;
                case 1: System.out.println("\nOriginal array:");
                        printArray(rationals);
                        System.out.println("Sorted with Insertion Sort:");
                        insertion_sort(rationals);
                        printArray(rationals);
                        rationals = resetArray();
                        break;
                case 2: System.out.println("\nOriginal array:");
                        printArray(rationals);
                        System.out.println("Sorted with Bubble Sort:");
                        bubble_sort(rationals);
                        printArray(rationals);
                        rationals = resetArray();
                        break;
            }
        }
    }
    static void printArray(Rational1[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.println(arr[i].toString());
    }
    static Rational1[] resetArray(){
        return new Rational1[]{
                new Rational1(1, 3),
                new Rational1(3, 4),
                new Rational1(4, 5),
                new Rational1(1, 2),
                new Rational1(2, 3)
        };
    }
    static void swap(Rational1[] field, int iPos1, int iPos2){
        Rational1 tmp = field[iPos1];
        field[iPos1] = field[iPos2];
        field[iPos2] = tmp;
    }
    static void selection_sort(Rational1[] field){
        for(int i1 = 0; i1 < field.length-1; ++i1){
            int min = i1;
            for(int i2 = i1+1; i2 < field.length; ++i2){
                if(field[i2].vergleich(field[min]) < 0){
                    min = i2;
                }
            }
            swap(field, min, i1);
        }
    }
    static void insertion_sort(Rational1[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            Rational1 ival = field[i1];
            int i2 = i1;
            while(i2 > 0 && field[i2-1].vergleich(ival) > 0){
                field[i2] = field[i2-1];
                --i2;
            }
            field[i2] = ival;
        }
    }
    static void bubble_sort(Rational1[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            for(int i2 = 0; i2 < field.length-i1; ++i2){
                if(field[i2].vergleich(field[i2+1]) > 0){
                    swap(field, i2, i2+1);
                }
            }
        }
    }
}
