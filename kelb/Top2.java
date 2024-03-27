package kelb;
class Juhu{
    public void doit(){ // Objektmethode: gehört zum Objekt, kann auf Objekt-Variable i zugreifen
        System.out.println(++j);
    }
    int j; // Objekt-Variable: Gehört zum Objekt, nicht zu irgendeiner Methode
}
public class Top2{
    public static void main(String[] args){
        Juhu i = new Juhu(); // *
        Juhu k = new Juhu(); // *  2 Objekte werden angelegt
        i.doit(); // *
        i.doit(); // * ruft 2-mal 'doit' von Objekt i auf
        k.doit(); // ruft 1-mal 'doit' von Objekt k auf
    }
}