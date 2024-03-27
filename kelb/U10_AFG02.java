// Stellen Sie Ihr 'Rational' Programm auf Klassen und Objekte um.
// Die Klasse 'Rational' besitzt als Objekt-variable zwei int-Variablen 'Zähler' und 'Nenner'.
// Der Konstruktor initialisiert diese. Die bisherigen Methoden werden Objektmethoden.
package kelb;
class Rational{
    int zaehler, nenner;
    public Rational(int zaehler1, int nenner1){
        this.zaehler = zaehler1;
        this.nenner = nenner1;
    }
    public void print(){
        System.out.println(zaehler + " / " + nenner);
    }
    public Rational kuerzen(){
        int ggt = ggt(this.zaehler, this.nenner);
        this.zaehler /= ggt;
        this.nenner /= ggt;
        return this;
    }
    public int ggt(int zahl0, int zahl1){
        if(zahl1 == 0)
            return zahl0;
        return ggt(zahl1, zahl0 % zahl1);
    }
    public Rational add(Rational r){
        int resZaehler = this.zaehler * r.nenner + this.nenner * r.zaehler;
        int resNenner = this.nenner * r.nenner;
        return new Rational(resZaehler, resNenner);
    }
    public Rational mult(Rational r){
        return new Rational(this.zaehler * r.zaehler, this.nenner * r.nenner);
    }
    public Rational divid(Rational r){
        return new Rational(this.zaehler * r.nenner, this.nenner * r.zaehler);
    }
    public Rational sub(Rational r){
        int resZaehler = this.zaehler * r.nenner - this.nenner * r.zaehler;
        int resNenner = this.nenner * r.nenner;
        return new Rational(resZaehler, resNenner);
    }


}
public class U10_AFG02 {
    public static void main(String[] args){
        Rational a = new Rational(4, 6);
        Rational aG = new Rational(4, 6).kuerzen();
        Rational b = new Rational(15,24);
        Rational bG = new Rational(15, 24).kuerzen();
        System.out.println("Bruch a: ");
        a.print();
        System.out.println("Bruch a gekürzt: ");
        aG.print();
        System.out.println("_________________________");
        System.out.println("Bruch b: ");
        b.print();
        System.out.println("Bruch b gekürzt: ");
        bG.print();
        System.out.println("_________________________");
        System.out.println("Bruch a und b add:");
        a.add(b).print();
        System.out.println("Bruch a und b gekürzt add: ");
        aG.add(bG).print();
        System.out.println("_________________________");
        System.out.println("Bruch a und b mult: ");
        a.mult(b).print();
        System.out.println("Bruch a und b gekürzt mult: ");
        aG.mult(bG).print();
        System.out.println("_________________________");
        System.out.println("Bruch a und b divid: ");
        a.divid(b).print();
        System.out.println("Bruch a und b gekürzt divid: ");
        aG.divid(bG).print();
        System.out.println("_________________________");
        System.out.println("Bruch a und b sub: ");
        a.sub(b).print();
        System.out.println("Bruch a und b gekürzt sub:");
        aG.sub(bG).print();
        System.out.println("_________________________");
    }
}
