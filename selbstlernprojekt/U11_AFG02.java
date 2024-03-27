package selbstlernprojekt;

class Rational{
    private int zaehler, nenner;
    public Rational(int zaehler, int nenner){
        if(nenner == 0)
            throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
        this.zaehler = zaehler;
        this.nenner = nenner;
        kuerzen();
    }
    private void kuerzen(){
        int ggt = ggt(zaehler, nenner);
        zaehler /= zaehler;
        nenner /= nenner;
    }
    private int ggt(int a, int b){
        return b == 0 ? a : ggt(b, a % b);
    }
    public int vergleich(Rational r){
        return Integer.compare(zaehler * r.nenner, r.zaehler * nenner);
    }
    public String toString(){
        return zaehler + " / " + nenner;
    }
}
public class U11_AFG02 {
    public static void main(String[] args){
        Rational[] rationals = {
                new Rational(1, 3),
                new Rational(3, 4),
                new Rational(4, 5),
                new Rational(1, 2),
                new Rational(2, 3),
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
    static void printArray(Rational[] arr){
        for(int i = 0; i < arr.length; ++i)
            System.out.println(arr[i].toString());
    }
    static void selection_sort(Rational[] field){
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
    static void swap(Rational[] field, int iPos1, int iPos2){
        Rational tmp = field[iPos1];
        field[iPos1] = field[iPos2];
        field[iPos2] = tmp;
    }
    static Rational[] resetArray(){
        return new Rational[]{
                new Rational(1, 3),
                new Rational(3, 4),
                new Rational(4, 5),
                new Rational(1, 2),
                new Rational(2, 3)
        };
    }
    static void insertion_sort(Rational[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            Rational ival = field[i1];
            int i2 = i1;
            while(i2 > 0 &&  field[i2-1].vergleich(ival) > 0){
                field[i2] = field[i2-1];
                --i2;
            }
            field[i2] = ival;
        }
    }
    static void bubble_sort(Rational[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            for(int i2 = 0; i2 < field.length-i1; ++i2){
                if(field[i2].vergleich(field[i2+1]) > 0){
                    swap(field, i2, i2+1);
                }
            }
        }
    }
}
