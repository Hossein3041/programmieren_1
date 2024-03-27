// Gegeben sind folgende Aussagen:
// (A) => (¬B ∧ (¬C)) = (¬(¬A)) ∨ (B ∧ (¬C)).
// Erstellen Sie ein Java Programm, das beide Aussagen
// miteinander vergleicht und das Ergebnis ausgibt.

package kelb;

public class U02_AFG03 {
    public static void main(String[] args){
        boolean a = true; boolean b = true; boolean c = true;
        //boolean a = true; boolean b = true; boolean c = false;
        //boolean a = true; boolean b = false; boolean c = true;
        //boolean a = true; boolean b = false; boolean c = false;
        //boolean a = false; boolean b = true; boolean c = true;
        //boolean a = false; boolean b = true; boolean c = false;
        //boolean a = false; boolean b = false; boolean c = false;
        //boolean a = false; boolean b = false; boolean c = false;

        boolean links = (!a) || ((!b) && (!c));
        boolean rechts = (!(!a)) || (b && (!c));

        if(links == rechts){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
