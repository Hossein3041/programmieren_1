package kelb;
public class U07_AFG02 {
    public static void main(String[] args){
        /*
        _____________________________________________________________________________
                    Übung 07 - Aufgabe 02:
int[] a = {10,20,30};
int[] b = {1,2,3,4,5};
int n = 0, m = 0;
void swap(int x, y){
    ++n;
    int tmp = x;
    x = y;
    y = tmp;
    ++m;
}
Geben Sie jeweils die Werte von a, b, n und m nach dem Aufruf von
    swap(a[n],b[m])
    swap(a[n],b[n])
    swap(a[n],n)
an, wenn die Werte Call-by-Value, Call-by-Value-Result, Call-by-Reference,
Call-by-Name übergeben werden.
_____________________________________________________________________________
                        swap(a[n],b[m])
_____________________________________________________________________________
    Call-by-Value - Call-by-Value-Result - Call-by-Reference - Call-by-Name
_____________________________________________________________________________
a:  {10,20,30}         {1,20,30}            {1,20,30}           {10,1,30}
b:  {1,2,3,4,5}        {10,2,3,4,5}         {10,2,3,4,5}        {20,2,3,4,5}
n:  1                  1                    1                   1
m:  1                  1                    1                   1
_____________________________________________________________________________
                        swap(a[n],b[n])
_____________________________________________________________________________
    Call-by-Value - Call-by-Value-Result - Call-by-Reference - Call-by-Name
_____________________________________________________________________________
a:  {10,20,30}      {1,20,30}              {1,20,30}           {10,2,30}
b:  {1,2,3,4,5}     {10,2,3,4,5}           {10,2,3,4,5}        {1,20,3,4,5}
n:  1               1                      1                   1
m:  1               1                      1                   1
_____________________________________________________________________________
                        swap(a[n],n)
_____________________________________________________________________________
    Call-by-Value - Call-by-Value-Result - Call-by-Reference - Call-by-Name
_____________________________________________________________________________
a:  {10,20,30}      {0,20,30}              {1,20,30}           {10,1,30}
b:  {1,2,3,4,5}     {1,2,3,4,5}            {1,2,3,4,5}         {1,2,3,4,5}
n:  1               10                     10                  20
m:  1               1                      1                   1
_____________________________________________________________________________
         */
    }
}